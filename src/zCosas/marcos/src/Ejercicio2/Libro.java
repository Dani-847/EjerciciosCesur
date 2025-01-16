package Ejercicio2;

public class Libro {
     private String titulo;
     private double precio;
     private Categoria catergoria;
     private boolean prestado;

     public Libro(String titulo, double precio, Categoria catergoria, boolean prestado) {
          this.titulo = titulo;
          this.precio = precio;
          this.catergoria = catergoria;
          this.prestado = prestado;
     }

     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public double getPrecio() {
          return precio;
     }

     public void setPrecio(double precio) {
          this.precio = precio;
     }

     public Categoria getCatergoria() {
          return catergoria;
     }

     public void setCatergoria(Categoria catergoria) {
          this.catergoria = catergoria;
     }

     public boolean isPrestado() {
          return prestado;
     }

     public void setPrestado(boolean prestado) {
          this.prestado = prestado;
     }

     @Override
     public String toString() {
          return "libro{" +
                  "titulo='" + titulo + '\'' +
                  ", precio=" + precio +
                  ", catergoria=" + catergoria +
                  ", prestado=" + prestado +
                  '}';
     }
     public void marcarPrestado(){
     }
}
