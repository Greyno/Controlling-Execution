package reynoldstitko.gillian;

import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class Main {

    public static void main(String[] args) {

        int chooseProblem;
        Scanner scanner = new Scanner(System.in); //Open the scanner for overall input
        System.out.print("Choose a lab to run (1, 2, 3, 4): ");
        chooseProblem = scanner.nextInt();


        switch (chooseProblem) {
            case 1: {
                SumOfNumbers summer = new SumOfNumbers();
                int resultValue;

                System.out.print("Sum of Numbers Lab (CD10): Enter an integer value: ");
                int inputNumber = scanner.nextInt();
                scanner.close();

                resultValue = summer.sumNumbers(inputNumber);
                System.out.println(resultValue);
                break;
            }

            case 2: {

                Greeting greeting = new Greeting();
                String resultValue;

                System.out.print("Greeting Lab (CD11): Enter your name: ");
                String inputName = scanner.next();
                scanner.close();

                resultValue = greeting.compareInputNames(inputName);
                System.out.println(resultValue);
                break;
            }

            case 3: {
                SumProduct value = new SumProduct();
                int result;

                System.out.print("SumProduct Lab (CD12): What is the number you want to use for evaluation? ");
                int inputNumber = scanner.nextInt();

                System.out.print("Do you want to find the Sum or the Product? ");
                String inputType = scanner.next().toLowerCase();
                scanner.close();

                if (inputType.equals("sum")) {
                    result = value.product(inputNumber);
                    System.out.println(result);
                } else {
                    result = value.product(inputNumber);
                    System.out.println(result);
                }
                break;
            }

            case 4: {
                TooLargeTooSmall tooLargeTooSmall = new TooLargeTooSmall();
                System.out.print("Lab CD13: What is your guess? ");
                int inputNumber = scanner.nextInt();

                String output = "";

                do  {
                    int result = tooLargeTooSmall.compareNumbers(inputNumber);
                    output = tooLargeTooSmall.showResultOfComparison(result);
                    System.out.println(output);

                    System.out.println("Lab CD13: What is your guess? ");
                    inputNumber = scanner.nextInt();

                } while (inputNumber != tooLargeTooSmall.computerGuess);
                break;
            }

        }
    scanner.close();
    }
}
