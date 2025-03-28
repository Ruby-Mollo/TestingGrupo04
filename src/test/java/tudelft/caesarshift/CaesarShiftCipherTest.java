package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    // Prueba un desplazamiento basico de 1 posicion
    @Test
    public void testBasicShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("abc", 1);
        Assertions.assertEquals("bcd", result);
    }

    // Verifica que no haya duplicacion de caracteres en la salida
    @Test
    public void testNoDuplication() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("a", 1);
        Assertions.assertEquals("b", result);
    }

    // Comprueba que los espacios se manejen correctamente sin ser cifrados
    @Test
    public void testSpaceHandling() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("a b", 1);
        Assertions.assertEquals("b c", result);
    }

    // Prueba un desplazamiento negativo
    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("b", -1);
        Assertions.assertEquals("a", result);
    }

    // Verifica el comportamiento de "wraparound" de 'z' a 'a'
    @Test
    public void testWraparound() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("z", 1);
        Assertions.assertEquals("a", result);
    }

    // Prueba la deteccion de entradas invalidas (caracteres no permitidos)
    @Test
    public void testInvalidInput() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("a1", 1);
        Assertions.assertEquals("invalid", result);
    }

    // Comprueba el manejo de desplazamientos grandes (mayores que 26)
    @Test
    public void testLargeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("a", 27);
        Assertions.assertEquals("b", result);
    }

    // Verifica el comportamiento con una cadena vacia
    @Test
    public void testEmptyString() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.caesarShiftCipher("", 5);
        Assertions.assertEquals("", result);
    }
}
