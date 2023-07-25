package tk.itish.models;
// define class as model
public class EncodeInput {
    // define member variables
    private String inputString;
    private int key;

    // define no arg constructor
    public EncodeInput() {
    }

    // define argumented constructor
    public EncodeInput(String inputString, int key) {
        this.inputString = inputString;
        this.key = key;
    }

    // create setters and getters
    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
