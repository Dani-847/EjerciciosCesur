package Programacion.UDB.pooUD11CasoPractico3;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class GestionBiblioteca {
    private Set<Usuario> usuarios;
    private Set<Libro> libros;
    private Set<Prestamo> prestamos;

    public GestionBiblioteca() {
        usuarios = new HashSet<Usuario>();
        libros = new TreeSet<Libro>();
        prestamos = new LinkedHashSet<>();
        cargarUsuarios();
        cargarLibros();
        cargarPrestamos();
    }

    public void mostrarUsuarios() {
        if (usuarios.isEmpty())
            System.out.println("No hay ningún usuario");
        else{
            System.out.println("USUARIOS");
            System.out.println("========");
            for (Usuario u : usuarios) {
                System.out.println(u);
            }
            System.out.println();
        }
    }

    public void mostrarLibrosDisponibles() {
        if (libros.isEmpty())
            System.out.println("No hay ningún libro");
        else{
            System.out.println("LIBROS DISPONIBLES");
            System.out.println("==================");
            for (Libro libro : libros) {
                if (libro.isEstado())
                    System.out.println(libro);
            }
            System.out.println();
        }
    }

    public void mostrarPrestamosActivos() {
        if (prestamos.isEmpty())
            System.out.println("No hay ningún préstamo activo");
        else{
            System.out.println("PRÉSTAMOS ACTIVOS");
            System.out.println("=================");
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo);
            }
            System.out.println();
        }
    }

    private void cargarUsuarios() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("usuarios.csv"));
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                Usuario u = new Usuario(datos[0], datos[1], datos[2]);
                usuarios.add(u);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try{
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    private void cargarLibros() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("libros.csv"));
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split("\\*");
                Libro l = new Libro(datos[0], datos[1], datos[2],Boolean.parseBoolean(datos[3]));
                String codigo = calcularCodigo(l.getIsbn());
                l.setCodigo(codigo);
                libros.add(l);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try{
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    private String calcularCodigo(String isbn) {
        int contador = 1;
        StringBuilder codigo = new StringBuilder();
            for (Libro libro : libros) {
                if (libro.getIsbn().equals(isbn))
                    contador++;
            }
        codigo.append(isbn).append("-").append(contador);
        return codigo.toString();
    }


    private void cargarPrestamos() {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("prestamos.csv"));
            String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                Prestamo p = new Prestamo(datos[0], datos[1]);
                LocalDate fecha = LocalDate.parse(datos[2]);
                p.setFechaPrestamo(fecha);
                prestamos.add(p);
                linea = br.readLine();
            }
        } catch (FileNotFoundException e) {
            //System.out.println();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            try{
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }

    public boolean agregarUsuario(Usuario u) {
        boolean agregado = false;
        if (!usuarios.contains(u)) {
            usuarios.add(u);
            agregado = true;
            guardarUsuario(u);
        }
        return agregado;
    }

    private void guardarUsuario(Usuario u) {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter("usuarios.csv",true));
            pw.println(u.getDni()+","+u.getNombre()+","+u.getEmail()+",0");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        } finally {
            if (pw != null)
                pw.close();
        }
    }

    public void agregarLibro(Libro libro){
        libro.setCodigo(calcularCodigo(libro.getIsbn()));
        libros.add(libro);
        guardarLibro(libro);
        System.out.println("Libro agregado correctamente");
    }

    private void guardarLibro(Libro libro) {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter("libros.csv",true));
            pw.println(libro.getIsbn()+"*"+libro.getTitulo()+"*"+libro.getAutor()+"*true");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        } finally {
            if (pw != null)
                pw.close();
        }
    }

    public void agregarPrestamo(String nombre, String titulo) {
        String codigo = buscarLibroDisponible(titulo);
        Usuario usuario = buscarUsuario(nombre);
        if (usuario!=null && codigo != null) {
            Prestamo p = new Prestamo(usuario.getDni(), codigo);
            prestamos.add(p);
            guardarPrestamo(p);
            List<Libro> losLibros = buscarLibro(titulo);
            Libro elLibro = null;
            for (Libro libro : losLibros) {
                if (libro.getCodigo().equals(codigo)) {
                    elLibro = libro;
                    elLibro.setEstado(false);
                }
            }
            //Actualizar libros.csv
            if (elLibro != null)
                modificarLibros(elLibro);
        } else
            System.out.println("No se puede realizar este préstamo");
    }

    private void guardarPrestamo(Prestamo p) {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter("prestamos.csv",true));
            pw.println(p.getDni()+","+p.getCodigo()+","+p.getFechaPrestamo()+","+p.getFechaDevolucion());
            System.out.println("Prestamo relizado correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        } finally {
            if (pw != null)
                pw.close();
        }
    }

    private String buscarLibroDisponible(String titulo) {
        String res=null;
        for(Libro libro : libros) {
            if (libro.getTitulo().equals(titulo) && libro.isEstado()) {
                res = libro.getCodigo();
            }
        }
        return res;
    }

    public Usuario buscarUsuario(String nombre) {
        Usuario u = null;
        for (Usuario usuario : usuarios) {
            if (nombre.equals(usuario.getNombre()))
                u = usuario;
        }
        return u;
    }

    public List<Libro> buscarLibro(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public void devolverPrestamo(String nombre, String titulo) {
        Usuario u = buscarUsuario(nombre);
        Libro elLibro=null;
        Prestamo elPrestamo=null;
        //Busco los préstamos del usuario u
        for (Prestamo p : prestamos) {
            if (p.getDni().equals(u.getDni())) {
                Libro l = dameLibro(p.getCodigo());
                //Si coincide el título del libro del préstamo con el que quiero devolver, lo devuelvo
                if (l!=null && l.getTitulo().equals(titulo)) {
                    elPrestamo = p;
                    elLibro = l;
                }
            }
        }
        if (elLibro != null) {
            //borrar el préstamo del conjunto de préstamos
            prestamos.remove(elPrestamo);
            //Modificar el libro en libros.csv
            elLibro.setEstado(true);
            modificarLibros(elLibro);
            //guardar el préstamo en prestamos_finalizados.csv
            //borrar el préstamo de prestamos.csv
            if (elPrestamo != null) {
                agregarPrestamoFinalizado(elPrestamo);
                eliminarPrestamo();
            }
        }
    }

    private void eliminarPrestamo() {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter("prestamos.csv"));
            for (Prestamo p : prestamos) {
                pw.println(p.getDni() + "," + p.getCodigo() + "," + p.getFechaPrestamo() + "," + p.getFechaDevolucion());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (pw!=null)
                pw.close();
        }
    }

    private void agregarPrestamoFinalizado(Prestamo elPrestamo) {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter("prestamos_finalizados.csv",true));
            pw.println(elPrestamo.getDni()+","+elPrestamo.getCodigo()+","+elPrestamo.getFechaPrestamo()+","+elPrestamo.getFechaDevolucion());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (pw!=null)
                pw.close();
        }
    }

    private void modificarLibros(Libro elLibro) {
        PrintWriter pw = null;
        try{
            pw = new PrintWriter("libros.csv");
            for (Libro libro : libros) {
                if (libro.getCodigo().equals(elLibro.getCodigo())) {
                    libro.setEstado(elLibro.isEstado());
                }
                pw.println(libro.getIsbn()+"*"+libro.getTitulo()+"*"+libro.getAutor()+"*"+libro.isEstado());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al escribir en el archivo");
        } finally {
            if (pw!=null)
                pw.close();
        }
    }

    private Libro dameLibro(String codigo) {
        Libro elLibro = null;
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                elLibro = libro;
            }
        }
        return elLibro;
    }
}
