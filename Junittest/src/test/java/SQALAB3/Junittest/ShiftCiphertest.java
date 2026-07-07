package SQALAB3.Junittest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShiftCiphertest {

    ShiftCipher cipher = new ShiftCipher();

    @Test
    void TC01_uppercase_shouldReturnEncrypted() {
        // Expected Result ตามสเปค
        assertEquals("ZVMADHYL", cipher.shift("SOFTWARE", 3));
    }

    @Test
    void TC02_lowercase_shouldReturnEncrypted() {
        assertEquals("zvmadhyl", cipher.shift("software", 3));
    }

    @Test
    void TC03_shortWord_shouldReturnEncrypted() {
        assertEquals("EHG", cipher.shift("BED", 3));
    }

    @Test
    void TC04_withNumbers_shouldKeepDigitsUnchanged() {
        assertEquals("EHG404", cipher.shift("BED404", 3));
    }
}