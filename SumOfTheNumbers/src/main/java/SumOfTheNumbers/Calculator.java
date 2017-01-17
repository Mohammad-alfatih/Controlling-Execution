package SumOfTheNumbers;

/**
 * Created by alfatihmukhtar on 1/13/17.
 */
public class Calculator {
    // Declarations
    private Display display;
    private UserInput input;
    private Sum sum;

    // Instantiating
    public Calculator() {
        display = new Display();
        input = new UserInput();
        sum = new Sum();
    }

    public void run() {
        int number = input.askUserForInteger();
        int answer = sum.getSum(number);
        display.printToScreen("Your sum is " + answer);
    }
}
