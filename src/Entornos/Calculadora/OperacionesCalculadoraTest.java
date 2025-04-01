package Entornos.Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OperacionesCalculadoraTest {

    @Test
    @DisplayName("TC001 - Prueba de Suma: números positivos")
    void testSumaPositivos() {
        double resultado = OperacionesCalculadora.suma(5, 3);
        assertEquals(8, resultado, "La suma de 5 y 3 debería ser 8");
    }

    @Test
    @DisplayName("TC002 - Prueba de Resta: número negativo")
    void testRestaNegativo() {
        double resultado = OperacionesCalculadora.resta(5, 8);
        assertEquals(-3, resultado, "La resta de 5 menos 8 debería ser -3");
    }

    @Test
    @DisplayName("TC003 - Prueba de Multiplicación: uno de los operandos es cero")
    void testMultiplicacionCero() {
        double resultado = OperacionesCalculadora.multiplicacion(5, 0);
        assertEquals(0, resultado, "La multiplicación de cualquier número por cero debería ser 0");
    }

    @Test
    @DisplayName("TC004 - Prueba de División: división normal")
    void testDivisionNormal() {
        double resultado = OperacionesCalculadora.division(10, 2);
        assertEquals(5, resultado, "La división de 10 entre 2 debería ser 5");
    }

    @Test
    @DisplayName("TC005 - Prueba de División: división entre cero")
    void testDivisionEntreCero() {
        double resultado = OperacionesCalculadora.division(10, 0);
        // Se espera 0 y la salida por consola del mensaje de error
        assertEquals(0, resultado, "La división entre cero debe retornar 0 y mostrar un mensaje de error");
    }

    @Test
    @DisplayName("TC006 - Prueba de Potencia: potencia normal")
    void testPotencia() {
        double resultado = OperacionesCalculadora.potencia(2, 3);
        assertEquals(8, resultado, "2 elevado a 3 debería ser 8");
    }
}
