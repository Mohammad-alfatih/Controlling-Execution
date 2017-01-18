package SumOrProduct;

/**
 * Created by alfatihmukhtar on 1/13/17.
 */
public class Calculator {
    // Declarations
    private Display display;
    private UserInput input;
    private Sum sum;
    private Product product;

    // Instantiating
    public Calculator() {
        display = new Display();
        input = new UserInput();
        sum = new Sum();
        product = new Product();
    }

    public void run() {
        int number = input.askUserForInteger();
        String operator = input.askUserForOpCode();
        int answer = 0;
        if(operator.equals("+")) {
            answer = sum.getSum(number);
            display.printToScreen("Your result" +
                    " is " + answer);
        } else if(operator.equals("x")) {
            answer = product.getProduct(number);
            display.printToScreen("Your result" +
                    " is " + answer);
        } else {
            display.printToScreen("This is not an option, only choose [+] or [x]");

        }

    }
}
