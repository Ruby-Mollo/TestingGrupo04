package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MirrorTest {

    // Test 1: Cadena con reflejo al inicio y final ("ab")
    @Test
    public void testMirror_abXYZba() {
        Mirror mirror = new Mirror();
        assertEquals("ab", mirror.mirrorEnds("abXYZba"));
    }

    // Test 2: Solo primer y último carácter coinciden ("a")
    @Test
    public void testMirror_abca() {
        Mirror mirror = new Mirror();
        assertEquals("a", mirror.mirrorEnds("abca"));
    }

    // Test 3: Cadena completamente simétrica impar ("aba")
    @Test
    public void testMirror_aba() {
        Mirror mirror = new Mirror();
        assertEquals("aba", mirror.mirrorEnds("aba"));
    }

    // Test 4: Cadena completamente simétrica par ("abba")
    @Test
    public void testMirror_abba() {
        Mirror mirror = new Mirror();
        assertEquals("abba", mirror.mirrorEnds("abba"));
    }

    // Test 5: Cadena sin ningún carácter reflejado
    @Test
    public void testMirror_none() {
        Mirror mirror = new Mirror();
        assertEquals("", mirror.mirrorEnds("xyz"));
    }
}
