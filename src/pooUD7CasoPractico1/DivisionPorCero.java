package pooUD7CasoPractico1;

public class DivisionPorCero {
    public double division (int num1, int num2){
        double resultado = 0;
        try {
            if (num2 == 0) {
                throw new ExcepcionDeDivisionPorCero(num2);
            } else {
                resultado = num1 / num2;
            }
        } catch (ExcepcionDeDivisionPorCero e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally hecho");
        }
        System.out.println("Volviendo de division");
        return resultado;
    }
}
