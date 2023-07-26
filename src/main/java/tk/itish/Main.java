package tk.itish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // print menu variable
        boolean isPrintMenu = true;

        // print greetings
        System.out.println("\nWelcome to Caesar Cipher Application");

        String optionMessage = "Select an option below:";
        System.out.println(optionMessage);

        for(int i = 0; i < optionMessage.length(); i++){
            System.out.print("-");
        }
        System.out.print("\n");


        while (isPrintMenu){
            // print menu
            final String menuSelection = printMenu();

            if(menuSelection.equals("3")){
                System.out.println("\nGood Bye");
                isPrintMenu = false;
            } else if (menuSelection.equals("1")) {
                System.out.println(encryption());
            } else if (menuSelection.equals("2")) {
                System.out.println(decryption());
            }else {
                System.out.println("\nYou have entered a wrong selection.\n");
            }

        }

    }

    // print menu
    public static String printMenu(){
        // define scanner
        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Encrypt Letters");
        System.out.println("2. Decrypt Letters");
        System.out.println("3. Exit Application\n");

        String menu = scanner.nextLine();

        return menu;
    }

    // encryption
    public static String encryption(){
        // get encoding object
        Encode encode = new Encode();
        // define scanner
        Scanner scanner = new Scanner(System.in);

        // prompt for input
        System.out.println("Enter input to encrypt: ");

        // save input entered
        String input = scanner.nextLine().toUpperCase();

        // prompt for input
        System.out.println("Enter key to shift for encryption: ");

        // check key if int
        try {
            // save key entered
            int key = Integer.parseInt(scanner.nextLine());

            // call encryption function
            return "Encoded Output: " + encode.performEncoding(input, key)+"\n";
        }catch (Exception exception){
            System.out.println("Invalid key value. Please provide a valid number");
        }


        return "There was an issue encoding your input";
    }

    // decryption
    public static String decryption(){

        // get encoding object
        Encode encode = new Encode();
        // define scanner
        Scanner scanner = new Scanner(System.in);

        // prompt for input
        System.out.println("Enter input to decrypt: ");

        // save input entered
        String input = scanner.nextLine().toUpperCase();

        // prompt for input
        System.out.println("Enter key to shift for decryption: ");

        // check key if int
        try {
            // save key entered
            int key = Integer.parseInt(scanner.nextLine());


            // call encryption function
            return encode.performDecoding(input, key);
        }catch (Exception exception){
            System.out.println("Invalid key value. Please provide a valid number");
        }


        return "There was an issue decoding your input";
    }
}