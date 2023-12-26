import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckBracketsOnStringTest {


    @Test
    void checkString_whenCorrectString() {
        String correctString = "s(dhgj_sfbfj)";
        CheckBracketsOnString ch = new CheckBracketsOnString();

        assertTrue(ch.checkString(correctString));
    }

    @Test
    void checkString_whenWrongString() {
        String correctString = "s)dhgj_)sfbfj)";
        CheckBracketsOnString ch = new CheckBracketsOnString();

        assertFalse(ch.checkString(correctString));
    }

}