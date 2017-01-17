
package SumOfTheNumbers;


import java.util.Scanner;

/**
 * Created by alfatihmukhtar on 1/13/17.
 */
public class UserInput {

    private Scanner scanner;
    private Display display;

    public UserInput() {
        scanner = new Scanner(System.in);
        display = new Display();
    }

    public int askUserForInteger() {
        display.printToScreen("Please give a number ");
        int userInput = scanner.nextInt();

        return userInput;
    }



}