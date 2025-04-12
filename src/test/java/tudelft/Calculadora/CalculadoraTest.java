package tudelft.Calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    public void testSumarPositivos() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testEvaluarNumero() {
        assertEquals("Negativo", calc.evaluarNumero(-4));
        assertEquals("Positivo", calc.evaluarNumero(4));
        assertEquals("Cero", calc.evaluarNumero(0));
    }
    @Test
    public void testEsParConNumeroPar() {
        assertTrue(calc.esPar(4));
        assertFalse(calc.esPar(5));
    }

}
