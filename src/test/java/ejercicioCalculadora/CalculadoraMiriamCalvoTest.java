package ejercicioCalculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraMiriamCalvoTest {

    @Test
    void testSuma() {
        // Valor esperado
        int valorEsperado = 30;
        // Crear el objeto con los valores de entrada
        CalculadoraMiriamCalvo calc = new CalculadoraMiriamCalvo(20, 10);
        // Ejecutar el método a probar
        int resultado = calc.suma();
        // Verificar el resultado
        assertEquals(valorEsperado, resultado, "La suma no coincide con el valor esperado.");
    }

    @Test
    void resta() {
        fail("Test fallido deliberadamente, MiriamCalvo");
    }

    @Test
    void multiplica() {
        fail("Test fallido deliberadamente, MiriamCalvo");
    }

    @Test
    void divide() {
        fail("Test fallido deliberadamente, MiriamCalvo");
    }
}