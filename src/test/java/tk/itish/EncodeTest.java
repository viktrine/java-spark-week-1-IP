package tk.itish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test class for encoding methods
 * @version 1.0.0
 * @author Kipng'etich Victor Lang'at
 */
class EncodeTest {
    // test key
    @Test
    void isValidCharacter_whenInputStringProvided_true(){
        Encode encode = new Encode();
        assertTrue(encode.isValidCharacter("asa das"));
    }
}