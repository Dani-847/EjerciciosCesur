package pooUD7CasoPractico3;

import java.util.Random;

public class Simulacion {
    public static void main(String[] args) {
        Random rand = new Random();
        double temperatura;
        int frio=0;
        int calor=0;

        while (frio<5 && calor<15) {
            try {
                temperatura = rand.nextDouble(91);
                System.out.println("Temperatura: " + temperatura);
                Thread.sleep((int)(Math.random()*2000));
                if (temperatura > 50)
                    throw new DemasiadoCalor("Demasiado calor: " + temperatura);
                if (temperatura < 20)
                    throw new DemasiadoFrio("Demasiado frio: " + temperatura);
            }catch (DemasiadoFrio e){
                System.out.println(e.getMessage());
                frio++;
            }catch (DemasiadoCalor c){
                System.out.println(c.getMessage());
                calor++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Calor: " + calor);
        System.out.println("Frio: " + frio);
    }
}
