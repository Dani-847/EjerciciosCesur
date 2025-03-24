package Programacion.UD5.pooUD5CasoPractico1;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    public Persona (){
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC(){
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
    public void comprobarSexo(){
        if (sexo != 'H' && sexo != 'M') {
            sexo = 'H';
        }
    }
    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDNI: " + DNI + "\nSexo: " + sexo + "\nPeso: " + peso + "\nAltura: " + altura;
    }
    public void generaDNI(){
        final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int num = (int) (Math.random() * 100000000);
        int resto = num % 23;
        DNI = num + letras.charAt(resto) + "";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
