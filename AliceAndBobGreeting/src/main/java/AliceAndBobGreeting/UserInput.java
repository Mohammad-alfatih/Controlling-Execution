package AliceAndBobGreeting;

import java.util.Scanner;

/**
 * Created by alfatihmukhtar on 1/17/17.
 */
public class UserInput {
    private Scanner scanner;
    private Display display;

    public UserInput() {
        scanner = new Scanner(System.in);
        display = new Display();
    }

    public int askUserForName() {
        display.printToScreen("What is your name? ");
        String userInput = scanner.next();

        return userInput;
    }
}
