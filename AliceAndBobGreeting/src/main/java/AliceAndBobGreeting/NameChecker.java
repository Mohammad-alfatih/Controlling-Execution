package AliceAndBobGreeting;

/**
 * Created by alfatihmukhtar on 1/17/17.
 */
public class NameChecker {
    public String checkName(String name) {
        String message = "";
        if(name=="Alice" || name=="Bob") {
            message = "Hello " + name + " it's nice to see you!";
        }
        return message;
    }
}
