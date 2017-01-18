package TooLargeTooSmall;

/**
 * Created by alfatihmukhtar on 1/18/17.
 */
public class Distributor {
    private Display display = new Display();
    private UserInput input = new UserInput();
    private NumberGenerator generator = new NumberGenerator();
    private NumberComparer comparer = new NumberComparer();

    public void run() {
        display.printToScreen("We will generated a random number from 1 to 100");
        int randomNumber = generator.generateRandomNumber();
        display.printToScreen();
        // Take an input (an int).
        // Compare input to randomNumber.
            // if input < than randomNumber: "too low, try again";
            // if input > than randomNumber: "too high, try again";
            // else: "Congratulations, you've gotten it right, the correct number is " + randomNumber + ".";
    }
}
