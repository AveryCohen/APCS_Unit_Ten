import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitMatchTest {

    @Test
    void digitMatch() {
        assertEquals(1, DigitMatch.digitMatch(38, 34));
        assertEquals(0, DigitMatch.digitMatch(5, 5552));
        assertEquals(3, DigitMatch.digitMatch(892, 892));
        assertEquals(3, DigitMatch.digitMatch(298892, 7892));
        assertEquals(1, DigitMatch.digitMatch(380, 0));
        assertEquals(0, DigitMatch.digitMatch(123456, 654321));
        assertEquals(2, DigitMatch.digitMatch(1234567, 67));
    }
}