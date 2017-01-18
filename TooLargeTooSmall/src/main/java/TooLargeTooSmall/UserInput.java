package TooLargeTooSmall;

import java.util.Scanner;

/**
 * Created by alfatihmukhtar on 1/18/17.
 */
public class UserInput {
    private Scanner scanner;
    private Display display;

    public UserInput() {
        scanner = new Scanner(System.in);
        display = new Display();
    }

    public void askUserForInput() {
        display.printToScreen("Now, please guess the number that we have chosen: ");
    }

}
