package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class SumProduct {
    private  int resultOfProduct = 1;
    private int resultOfSum = 0;

    public int product(int n) {
        for (int i =1; i <= n; i++) {
            resultOfProduct = resultOfProduct * i;
        }
        return resultOfProduct;
    }

    public int sum(int n) {
        for(int i =1; i <=n; i++) {
            resultOfSum = resultOfSum + i;
        }
        return  resultOfSum;
    }

}
