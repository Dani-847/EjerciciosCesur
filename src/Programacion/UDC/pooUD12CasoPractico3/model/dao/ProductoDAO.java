package Programacion.UDC.pooUD12CasoPractico3.model.dao;

import Programacion.UDC.pooUD12CasoPractico3.model.Producto;
import Programacion.UDC.pooUD12CasoPractico3.model.ProductoAlimenticio;
import Programacion.UDC.pooUD12CasoPractico3.model.ProductoElectronico;
import Programacion.UDC.pooUD12CasoPractico3.model.ProductoHigiene;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.TreeSet;

public class ProductoDAO {

    public ProductoDAO() {
        try {
            AccesoBD.conectarBD();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<Producto> getProductos() {
        Set<Producto> resultado = new TreeSet<>();
        String sql="select * from productos;";
        try{
            ResultSet rs = AccesoBD.consultaBD(sql);
            while(rs.next()){
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                String tipo = rs.getString("tipo");
                String extra = rs.getString("extra");
                //Interpretamos el campo extra según el tipo
                Producto producto = null;
                switch (tipo.toLowerCase()){
                    case "alimenticio" -> {
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate fechaCaducidad = LocalDate.parse(extra, dtf);
                        Date fecha = Date.valueOf(fechaCaducidad);
                        producto = new ProductoAlimenticio(codigo, nombre, tipo, precio, fecha);
                    }
                    case "electronico" -> {
                        int garantia = Integer.parseInt(extra);
                        producto = new ProductoElectronico(codigo, nombre, tipo, precio, garantia);
                    }
                    case "higiene" -> {
                        boolean esDesinfectante = Boolean.parseBoolean(extra);
                        producto = new ProductoHigiene(codigo, nombre, tipo, precio, esDesinfectante);
                    }
                }
                resultado.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta");
        }
        return resultado;
    }

    public int insertarProducto(Producto p) {
        int res=0;
        String extra="";
        switch(p.getTipo().toLowerCase()){
            case "alimenticio" -> {
                extra = ((ProductoAlimenticio)p).getFechaCaducidad().toString();
            }
            case "electronico" -> {
                extra = ((ProductoElectronico)p).getGarantiaMeses()+"";
            }
            case "higiene" -> {
                extra = ((ProductoHigiene)p).isEsDesinfectante()+"";
            }
        }

        String sql="insert into productos values('"+p.getCodigo()+"','"+p.getNombre()+"',"+p.getPrecio()+",'"+p.getTipo()+"','"+extra+"');";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public int borrarProducto(String codigo) {
        int res=0;
        String sql="delete from productos where codigo='"+codigo+"';";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
