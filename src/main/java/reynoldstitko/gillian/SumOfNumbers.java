package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
/* Lab CD10 Instruction: Understand how to get input from user. Find solution to sum numbers from 1 to n.
Print final answer to the screen.
 */

public class SumOfNumbers {
    private int sum;

    public int sumNumbers(int inputValue) {
        for(int i = 1; i<=inputValue; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
