package ex25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordTester() {
        assertAll(
                () -> assertEquals(0, App.passwordValidator("12345")),
                () -> assertEquals(1, App.passwordValidator("abcdef")),
                () -> assertEquals(2, App.passwordValidator("abc123xyz")),
                () -> assertEquals(3, App.passwordValidator("1337h@xor!")));
    }
}