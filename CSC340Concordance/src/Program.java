

/**
 * This is main java file for the Concordance program. Contains Main().
 * @author Charles Mayse
 * 2/9/16
 * 
 * Delivered 2/12/16 for first use-case
 * 3/2/16 Exception handling for stability improvements. 
 * 
 * Complete 3/4/16
 */

/**
 * Import required for reader
 */
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    /**
     * main Entry point of the program
     * @param args Not used.
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        CommandLine cLine = new CommandLine();

        /**
         * String and String array used to hold user input
         */
        String input;
        String[] inputArr;

        /**
         * Welcome prompt.
         */
        System.out.println("Welcome to Concordance");

        /**
         * This while loop will continue to run, until cLine object closes 
         * the program.
         */
        while (true) {

            /**
             * Scanner object to read from console
             * after the user enters a command, parse the command using
             * the space character as a delimiter
             */
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            inputArr = input.trim().split(" ");

            /**
             * Commands must follow certain order to maintain program
             * integrity
             */
            cLine.setCommand(inputArr);

        }
    }
}
