package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    //Devuelve true cuando hay dos gg juntas
    @Test
    public void testDoubleG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("zzggzz");
        Assertions.assertTrue(result);
    }

    //Verifica si hay solo una g para devolver false
    @Test
    public void testSingleG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("yygyy");
        Assertions.assertFalse(result);
    }

    //Verifica que haya g separadas
    @Test
    public void testSeparatedGs() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("agmgmg");
        Assertions.assertFalse(result);
    }

    //Verifica si se comienza con la g
    @Test
    public void testStartWithG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("gaaaaa");
        Assertions.assertFalse(result);
    }

    //Verifica si termina con multiples g
    @Test
    public void testEndWithG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("aagg");
        Assertions.assertTrue(result);
    }

    //Verifica si tiene 3 g juntas
    @Test
    public void testTripleG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("axgggcc");
        Assertions.assertTrue(result);
    }

    //Verifica si no hay g
    @Test
    public void testNoG() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xx");
        Assertions.assertTrue(result);
    }
}
