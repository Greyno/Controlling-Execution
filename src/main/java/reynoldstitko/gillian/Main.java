package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {

//        SumOfNumbers summer = new SumOfNumbers();
//        int resultValue;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer value: ");
//        int inputNumber = scanner.nextInt();
//        scanner.close();
//
//        resultValue = summer.sumNumbers(inputNumber);
//        System.out.println(resultValue);

        //------------------

//        Greeting greeting = new Greeting();
//        String resultValue;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String inputName = scanner.next();
//        scanner.close();
//
//        resultValue = greeting.compareInputNames(inputName);
//        System.out.println(resultValue);

        //--------------------------

        SumProduct value = new SumProduct();
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the number you wnat to use for evaluation? ");
        int inputNumber = scanner.nextInt();

        System.out.print("Do you want to find the Sum or the Product? ");
        String inputType = scanner.next().toLowerCase();
        scanner.close();

        if(inputType.equals("sum")) {
            result = value.product(inputNumber);
            System.out.println(result);
        } else {
            result = value.product(inputNumber);
            System.out.println(result);
        }


    }

}
