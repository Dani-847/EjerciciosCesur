package pooUD7CasoPractico3;

import java.util.Random;

public class Simulacion {
    public static void main(String[] args) {
        int iteracionesTotales = 100;
        int[] numeros = new int[iteracionesTotales];

        int vecesCalor = 0;
        int vecesFrio = 0;

        Random random = new Random();

        int i = 0;
        while (i < iteracionesTotales && vecesCalor < 15 && vecesFrio < 5) {
            try {
                Thread.sleep((int)(Math.random() * 2000));
                System.out.println("--------------------");
                numeros[i] = random.nextInt(90);
                System.out.println("Temperatura actual: " + numeros[i]);
                if (numeros[i] > 50)
                    throw new DemasiadoCalor(numeros[i]);
                if (numeros[i] < 20)
                    throw new DemasiadoFrio(numeros[i]);
            } catch (DemasiadoCalor e) {
                System.out.println(e.getMessage());
                vecesCalor++;
                System.out.println("Veces de calor: " + vecesCalor);
            } catch (DemasiadoFrio e) {
                System.out.println(e.getMessage());
                vecesFrio++;
                System.out.println("Veces de frío: " + vecesFrio);
            } catch (InterruptedException e) {
                System.out.println("Error en la pausa del hilo.");
                Thread.currentThread().interrupt();
            } finally {
                i++;
            }

            if (vecesCalor >= 15) {
                System.out.println("Se ha superado el límite de calor.");
            }

            if (vecesFrio >= 5) {
                System.out.println("Se ha superado el límite de frío.");
            }
        }
    }
}
