package IzGita.src.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseLetterTest {

    @Test
    void reversesLettersInNormalString() {
        assertEquals(
                "t@eb eht av$J!123",
                ReverseLetter.reverseLetters("J@va the be$t!123")
        );
    }

    @Test
    void returnsEmptyForEmptyInput() {
        assertEquals("", ReverseLetter.reverseLetters(""));
    }

    @Test
    void keepsSingleLetter() {
        assertEquals("a", ReverseLetter.reverseLetters("a"));
    }

    @Test
    void keepsStringWithoutLetters() {
        assertEquals("123 !@#", ReverseLetter.reverseLetters("123 !@#"));
    }

    @Test
    void reversesOnlyLetters() {
        assertEquals("dcba", ReverseLetter.reverseLetters("abcd"));
    }

    @Test
    void keepsNonLettersInPlace() {
        assertEquals("#c!b?a@", ReverseLetter.reverseLetters("#a!b?c@"));
    }

    @Test
    void preservesLetterCase() {
        assertEquals("CbA", ReverseLetter.reverseLetters("AbC"));
    }

    @Test
    void throwsExceptionForNullInput() {
        assertThrows(
                NullPointerException.class,
                () -> ReverseLetter.reverseLetters(null)
        );
    }
}
