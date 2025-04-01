package Entornos.Calculadora;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraSystemTest {

    // Captura la salida del sistema para poder verificarla
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final java.io.InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testCalculadoraSuma() {
        // Simula la entrada del usuario:
        // 1: Selección de la operación Suma
        // 3: Primer operando
        // 2: Segundo operando
        // 6: Selección de Salir para terminar la aplicación
        String simulatedInput = "1\n3\n2\n6\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Se invoca el método main de la clase Test, que simula el flujo completo de la aplicación
        CalculadoraTest.main(new String[]{});

        // Se obtiene la salida capturada y se verifica que contiene el resultado esperado.
        String output = outContent.toString();
        // Se espera que la suma de 3 y 2 sea 5, y que se muestre en la salida.
        assertTrue(output.contains("El resultado es: 5"), "La salida debe contener el resultado de la suma (5).");
    }
}
