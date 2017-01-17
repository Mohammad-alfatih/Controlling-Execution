package SumOfTheNumbers;

/**
 * Created by alfatihmukhtar on 1/14/17.
 */
public class Sum {

    public int getSum(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i;
        }

        return result;
    }
}