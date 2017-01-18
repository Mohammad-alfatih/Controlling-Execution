package SumOrProduct;

/**
 * Created by alfatihmukhtar on 1/14/17.
 */
public class Product {

    public int getProduct(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}