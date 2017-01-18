
package SumOrProduct;


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
        display.printToScreen("Please give a number (n): ");
        int integer = scanner.nextInt();

        return integer;
    }

    public String askUserForOpCode() {
        display.printToScreen("Please choose an operator:\n" +
        "[+] : to ADD your integer (sum of 1 to n)\n" +
        "[x] : to MULTIPLY your integer (product of 1 to n) ");

        String opCode = scanner.next();

        return opCode;

    }



}