package Programacion.Examenes.Examen06_03_2025.Ejercicio1;

public class BuscadorArray {
    public static int[] generarArrayAleatorio() {
        int[] array = new int[((int) (Math.random() * 50))+50];
        System.out.println("Tamaño del array generado aleatoriamente: " + array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            boolean repetido = false;
            int j = 0;
            while (j < i && !repetido) {
                if (array[i] == array[j]) {
                    i--;
                    repetido = true;
                }
                j++;
            }
        }
        return array;
    }

    public static int buscarElemento(int[] array, int valor) throws ElementoNoEncontradoException {
        boolean encontrado = false;
        int indice = 0;
        while (indice < array.length && !encontrado) {
            if (array[indice] == valor) {
                encontrado = true;
            } else {
                indice++;
            }
        }
        if (indice >= array.length) {
            throw new ElementoNoEncontradoException("El numero " + valor + " no se encuentra en el array.");
        }
        return indice;
    }
}
