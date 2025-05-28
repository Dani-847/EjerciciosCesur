package model.dao;

import model.Profecia;
import model.TratadoAlquimico;
import model.Grimorio;
import model.ManuscritoMaldito;
import model.Manuscrito;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class ManuscritoDAO {

    public ManuscritoDAO() {
        try {
            AccesoBD.conectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public int actualizarManuscrito(Manuscrito m) {
        int res = 0;
        String extra = "";
        switch (m.getTipo().toLowerCase()) {
            case "profecia" -> {
                extra = ((Profecia) m).getEstaDescifrada() + "";
            }
            case "tratado" -> {
                extra = ((TratadoAlquimico) m).isEstaCompleto() + "";
            }
            case "grimorio" -> {
                extra = ((Grimorio) m).getNivelPeligro();
            }
            case "maldito" -> {
                extra = ((ManuscritoMaldito) m).isEstaSellado() + "";
            }
        }

        String sql = "update manuscritos set titulo='" + m.getTitulo() + "', autor='" + m.getAutor() + "', anio=" + m.getAnio() + ", nivel_acceso='" + m.getNivelAcceso() + "', tipo='" + m.getTipo() + "', extra='" + extra + "' where id=" + m.getId() + ";";
        try {
            res = AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public List<Manuscrito> getManuscritos() {
        List<Manuscrito> resultado = new java.util.ArrayList<>();
        String sql = "select * from manuscritos;";
        try {
            ResultSet rs = AccesoBD.consultaBD(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anio = rs.getInt("anio");
                String nivel_acceso = rs.getString("nivel_acceso");
                String tipo = rs.getString("tipo");
                String extra = rs.getString("extra");
                Manuscrito manuscrito = null;
                switch (tipo.toLowerCase()) {
                    case "profecia" -> {
                        boolean estaDescifrada = Boolean.parseBoolean(extra);
                        manuscrito = new Profecia(id, titulo, autor, anio, nivel_acceso, estaDescifrada);
                    }
                    case "tratado" -> {
                        boolean estaCompleto = Boolean.parseBoolean(extra);
                        manuscrito = new TratadoAlquimico(id, titulo, autor, anio, nivel_acceso, estaCompleto);
                    }
                    case "grimorio" -> {
                        manuscrito = new Grimorio(id, titulo, autor, anio, nivel_acceso, extra);
                    }
                    case "maldito" -> {
                        boolean estaSellado = Boolean.parseBoolean(extra);
                        manuscrito = new ManuscritoMaldito(id, titulo, autor, anio, nivel_acceso, estaSellado);
                    }
                }
                resultado.add(manuscrito);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta");
        }
        return resultado;
    }

    public int insertarManuscrito(Manuscrito m) {
        int res=0;
        String extra="";
        switch(m.getTipo().toLowerCase()){
            case "profecia" -> {
                extra = ((Profecia)m).getEstaDescifrada()+"";
            }
            case "tratado" -> {
                extra = ((TratadoAlquimico)m).isEstaCompleto()+"";
            }
            case "grimorio" -> {
                extra = ((Grimorio)m).getNivelPeligro();
            }
            case "maldito" -> {
                extra = ((ManuscritoMaldito)m).isEstaSellado()+"";
            }
        }

        String sql="insert into manuscritos values("+m.getId()+",'"+m.getTitulo()+"','"+m.getAutor()+"',"+m.getAnio()+",'"+m.getNivelAcceso()+"','"+m.getTipo()+"','"+extra+"');";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public int eliminarManuscrito(String codigo) {
        int res=0;
        String sql="delete from manuscritos where codigo='"+codigo+"';";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
