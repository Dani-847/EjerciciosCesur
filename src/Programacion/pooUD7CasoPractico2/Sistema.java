package pooUD7CasoPractico2;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        final int TAMANHO = 10;
        Mundo[] planetas = new Mundo[TAMANHO];

        for (int i = 0; i < planetas.length; i++) {
            planetas[i] = new Mundo();
        }

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < planetas.length; i++) {
            try {
                System.out.print("Nombre del planeta "+i+": ");
                planetas[i].setNombre(sc.nextLine());
                System.out.print("Diámetro del planeta: ");
                double diametro = Double.parseDouble(sc.nextLine());
                if (diametro <= 0)
                    throw new ValorNegativoException(diametro);
                else
                    planetas[i].setDiametro(diametro);
            }catch (NumberFormatException e){
                System.out.println("Debe introducir un numero válido");
                i--;
            } catch (ValorNegativoException e){
                System.out.println("Debe introducir un numero mayor que cero");
                System.out.println(e.getMessage());
                i--;
            }
        }
        int i=0;
        boolean superior = false;
        while (i < planetas.length && !superior) {
            try {
                if (planetas[i].getDiametro() < 20)
                    throw new DiametroInferiorException(planetas[i].getDiametro());
                if (planetas[i].getDiametro() > 100)
                    throw new DiametroSuperiorException(planetas[i].getNombre()+" - "+planetas[i].getDiametro());
            } catch (DiametroInferiorException e) {
                System.out.println(e.getMessage());
            } catch (DiametroSuperiorException e) {
                System.out.println(e.getMessage());
                superior = true;
            } catch (Exception e){
                System.out.println("HA OCURRIDO UNA EXCEPCIÓN");
            } finally{
                i++;
            }
        }
        sc.close();
    }
}
