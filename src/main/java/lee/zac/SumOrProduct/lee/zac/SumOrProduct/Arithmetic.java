package lee.zac.SumOrProduct.lee.zac.SumOrProduct;

/**
 * Created by zaclee on 9/9/16.
 */
public class Arithmetic {

    public int sum(int n) {

        int sumTotal =0;

        for(int i=0; i<=n; i++) {
            sumTotal += i;
        }
        return sumTotal;

    }

    public int product(int n) {

        int productTotal =1;

        for(int i=1; i<=n; i++) {
            productTotal *= i;
        }
        return productTotal;
    }
}
