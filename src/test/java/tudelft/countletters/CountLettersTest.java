package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    /*@Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }


    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }*/

    //Prueba de cpndiciones
    @Test
    public void conditionCoverage_rBranch() {
        int words = new CountLetters().count("car|bat");
        Assertions.assertEquals(1, words); // last == 'r' antes del separador
    }

    @Test
    public void conditionCoverage_sBranch() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words); // last == 's' antes del separador
    }

    @Test
    public void conditionCoverage_noMatch() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(1, words); // ni 'r' ni 's'
    }

    @Test
    public void conditionCoverage_falseCondition() {
        int words = new CountLetters().count("c|ats");
        Assertions.assertEquals(0, words); // separador aparece al inicio, 'c' no es 'r' ni 's'
    }

    //Pruebas representativas para Cobertura de Caminos
    @Test
    public void pathCoverage_allTrue() {
        int words = new CountLetters().count("bars|cars");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void pathCoverage_someTrue_someFalse() {
        int words = new CountLetters().count("bats|cat");
        Assertions.assertEquals(1, words); // solo 's' activa
    }

    @Test
    public void pathCoverage_allFalse() {
        int words = new CountLetters().count("bat.cat");
        Assertions.assertEquals(0, words); // ningún final cumple
    }

    // Pruebas para MC/DC
    @Test
    public void mcdc_A_influencesOutcome() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words); // A = T, C = T
    }

    @Test
    public void mcdc_A_false_BC_true() {
        int words = new CountLetters().count("!s"); // primer char es '!', last = 's'
        Assertions.assertEquals(0, words); // A = F → whole condition false
    }

    @Test
    public void mcdc_B_influencesOutcome() {
        int words = new CountLetters().count("car|bat");
        Assertions.assertEquals(1, words); // last = 'r'
    }

    @Test
    public void mcdc_C_influencesOutcome() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words); // last = 's'
    }
}