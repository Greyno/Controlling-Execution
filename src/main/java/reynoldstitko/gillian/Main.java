package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {

        SumOfNumbers summer = new SumOfNumbers();
        int resultValue;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        resultValue = summer.sumNumbers(inputNumber);
        System.out.println(resultValue);
    }

}
