package Entornos.Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraIntegrationTest {

    @Test
    @DisplayName("Integración: Suma y Resta utilizando Calculadora y OperacionesCalculadora")
    void testIntegracionSumaYResta() {
        // Se crea una instancia de Calculadora con dos operandos
        Calculadora calc = new Calculadora(10, 5);

        // Se integran las operaciones utilizando los valores de Calculadora
        double resultadoSuma = OperacionesCalculadora.suma(calc.getNumero1(), calc.getNumero2());
        double resultadoResta = OperacionesCalculadora.resta(calc.getNumero1(), calc.getNumero2());

        // Se validan los resultados obtenidos
        assertEquals(15, resultadoSuma, "La suma de 10 y 5 debe ser 15");
        assertEquals(5, resultadoResta, "La resta de 10 y 5 debe ser 5");
    }

    @Test
    @DisplayName("Integración: Multiplicación y División utilizando Calculadora y OperacionesCalculadora")
    void testIntegracionMultiplicacionYDivision() {
        // Se crea una instancia de Calculadora con dos operandos
        Calculadora calc = new Calculadora(8, 2);

        // Se integran las operaciones utilizando los valores de Calculadora
        double resultadoMultiplicacion = OperacionesCalculadora.multiplicacion(calc.getNumero1(), calc.getNumero2());
        double resultadoDivision = OperacionesCalculadora.division(calc.getNumero1(), calc.getNumero2());

        // Se validan los resultados obtenidos
        assertEquals(16, resultadoMultiplicacion, "La multiplicación de 8 y 2 debe ser 16");
        assertEquals(4, resultadoDivision, "La división de 8 entre 2 debe ser 4");
    }
}
