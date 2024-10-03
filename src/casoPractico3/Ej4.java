package casoPractico3;

public class Ej4 {
    public static void main(String[] args) {
        int res=0;
        System.out.println(res);
        for (int i = 50;i>=20;i = i -2){
            System.out.println("-----");
            res = res + i;
            System.out.println(i);
            System.out.println(res);
            System.out.println("-----");
        }
        System.out.println(res);
    }


}
