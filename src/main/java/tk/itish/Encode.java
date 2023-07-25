package tk.itish;

/**
 * This class will be used for encoding purposes
 * @version 1.0.0
 * @author Kipng'etich Victor Lang'at
 */
public class Encode {
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
    // define member variables
}
