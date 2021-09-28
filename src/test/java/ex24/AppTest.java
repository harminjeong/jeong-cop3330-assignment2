package ex24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Check if anagram")
    void isAnagram() {
        assertEquals(true, App.isAnagram("note","tone"));
        assertEquals(false, App.isAnagram("apple","orange"));
    }
}