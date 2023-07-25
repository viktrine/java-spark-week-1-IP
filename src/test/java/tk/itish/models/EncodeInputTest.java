package tk.itish.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// define test encodeinputmodel class
class EncodeInputTest {
    // test if constructor define
    @Test
    void encodeInput_instantiatedCorrectly(){
        EncodeInput encodeInput = new EncodeInput("A", 2);
        assertEquals(true, encodeInput instanceof  EncodeInput);
    }

    // ensure a letter non empty string for input string
    @Test
    void getInputString_nonEmptyStringProvided(){
        EncodeInput encodeInput = new EncodeInput("A", 2);
        assertEquals(true, encodeInput.getInputString().length() > 0);
    }

    // ensure a key more than 0 is given
    @Test
    void isValidNumber_nonZeroKeyProvided(){
        EncodeInput encodeInput = new EncodeInput("A", 2);
        assertEquals(true, encodeInput.getKey()  > 0);
    }
}