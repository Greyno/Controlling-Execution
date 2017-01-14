package reynoldstitko.gillian;



/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class TooLargeTooSmall {

    private int userInput;
    private int numberOfTries;
    private int currentValue;
    private String statement;

   //double computerGuess = (Math.random()*10.0) + 1.0;
    double computerGuess = 10;

    public int compareNumbers(int userInput){
        int comparisonResult;
        if(userInput < computerGuess){
            comparisonResult = 1;
        } else if (userInput > computerGuess) {
            comparisonResult = 2;
        } else comparisonResult = 3;
        return comparisonResult;
    }

    public String showResultOfComparison(int caseValue) {

        switch (caseValue) {
            case 1: {
                statement = "Your guess was too low.";
                break;
            }
            case 2: {
                statement = "Your guess was too high.";
                break;
            }
            case 3: {
                statement = "Your guess was just right! You won!";
                break;
            }
        }
        return statement;
    }

}
