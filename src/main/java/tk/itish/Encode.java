package tk.itish;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class will be used for encoding purposes
 * @version 1.0.0
 * @author Kipng'etich Victor Lang'at
 */
public class Encode {
    // define member variables
    String validCharacterString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] validCharacter = validCharacterString.toCharArray();


    // check if all characters are valid
    public boolean isValidCharacter(String inputString) {
        // convert to character Arrays
        final char[] inputStringCharArray = inputString.toCharArray();
        for(int i = 0; i < inputStringCharArray.length; i++){
            if (!Character.isAlphabetic(inputStringCharArray[i]) && inputStringCharArray[i] != ' '){
                return false;
            }
        }
        return true;
    }
    // // check if key > 0
    public boolean isValidKeyValue(int key){
        return key > 0 && key < 26;
    }

    // function for encryption
    public String performEncoding(String inputString, int key) {
        final char[] inputStringCharArray = inputString.toUpperCase().toCharArray();

        // define new list
        StringBuilder newString = new StringBuilder();

        if(isValidCharacter(inputString) && isValidKeyValue(key)){
            for(int i = 0; i < inputStringCharArray.length; i++){
                if(inputStringCharArray[i] == ' '){
                    newString.append(inputStringCharArray[i]);
                }else{
                newString.append(validCharacter[(validCharacterString.indexOf(inputStringCharArray[i])  + key) % 26]);
                }
            }
        }
        return newString.toString();
    }

    // function for decryption
    public String performDecoding(String inputString, int key) {
        final char[] inputStringCharArray = inputString.toUpperCase().toCharArray();

        // define new list
        StringBuilder newString = new StringBuilder();

        if(isValidCharacter(inputString) && isValidKeyValue(key)){
            for(int i = 0; i < inputStringCharArray.length; i++){
                if(inputStringCharArray[i] == ' '){
                    newString.append(inputStringCharArray[i]);
                }else{
                    newString.append(validCharacter[(validCharacterString.indexOf(inputStringCharArray[i])  - key) % 26]);
                }
            }
        }
        return newString.toString();
    }
}
