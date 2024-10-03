package casoPractico4;

public class Ej3 {
    public static void main(String[] args) {
        int total = 0;
        int cnt = 0;
        for (int i = 20; i <= 3500;i++){
            if ((i*(i+1)/2)%7==0){
                total += i;
                cnt++;
            }
        }
        System.out.println("El total es " + total + ". Son " + cnt + " numeros.");
    }
}
//n*(n+1)/2   todo multiplo de 7