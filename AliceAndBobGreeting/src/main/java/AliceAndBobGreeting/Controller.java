package AliceAndBobGreeting;

/**
 * Created by alfatihmukhtar on 1/17/17.
 */
public class Controller {
    private UserInput input;
    private NameChecker checker;
    private Display display;

    public Controller() {
        input = new UserInput();
        checker = new NameChecker();
        display = new Display();
    }

    public void run() {
        String name = input.askUserForName();
        String message = checker.checkName(name);
        display.printToScreen(message);

    }
}
