package Programacion.UD7.pooUD7CasoPractico1;

public class DivisionPorCero {
    public double division(double a, double b) {
        double resul=0;
        try {
            if (b == 0)
                //EXCEPCION
                throw new ExcepcionDeDivisionPorCero(b);
            else
                resul = a / b;
        }catch(ExcepcionDeDivisionPorCero e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally hecho");
        }
        System.out.println("Volviendo de division");
        return resul;
    }
}
