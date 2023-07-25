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
}