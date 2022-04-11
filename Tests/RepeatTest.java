import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatTest {

    @Test
    void repeat() {
        assertEquals("hellohellohello", Repeat.repeat("hello", 3));
        assertEquals("this is fun", Repeat.repeat("this is fun", 1));
        assertEquals("", Repeat.repeat("wow", 0));
        assertEquals("hi ho! hi ho! hi ho! hi ho! hi ho! ", Repeat.repeat("hi ho! ", 5));
    }
}