package AliceAndBobGreeting;

/**
 * Created by alfatihmukhtar on 1/17/17.
 */
public class NameChecker {
    public String checkName(String name) {
        String message = "";
        if(name.equals("Alice") || name.equals("Bob")) {
            message = "Hello " + name + " it's nice to see you!";
        } else {
            message = "Who are you " + name + "? You must be an imposter";
        }
        return message;
    }
}
