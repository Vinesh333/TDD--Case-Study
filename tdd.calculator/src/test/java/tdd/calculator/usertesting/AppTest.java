package tdd.calculator.usertesting;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import tdd.calculator.App.App;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
	@ParameterizedTest
    @CsvSource({
        "PramodDutta, true",
        "Pramod Dutta, false",
        "Pramod@123, false",
        "Pramod_Dutta, false",
        "Pramod/Dutta, false",
        "Pramod#Dutta, false"
    })
    public void testIsValidUserName(String userName, boolean expected) {
        assertEquals(expected, App.isValidUserName(userName));
    }
}

