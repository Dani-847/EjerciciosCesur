package casoPractico4.SolucionesProfesor;

public class Ej3 {
    public static void main(String[] args) {
        int contador=0;
        int suma=0;
        for (int i = 20; i <=3500 ; i++) {
            //n*(n+1)/2 = múltiplo de 7
            if ((i*(i+1)/2)%7==0){
                suma=suma+i;
                contador++;
            }
        }
        System.out.println("Total de números: "+contador);
        System.out.println("Suma total: "+suma);
    }
}
