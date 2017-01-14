package reynoldstitko.gillian;



/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class TooLargeTooSmall {

    private int lastInput;
    private String statement;
    int currentGuess;
    int trials;

   //double computerGuess = (Math.random()*10.0) + 1.0;
    double computerGuess = 10;

    public int compareNumbers(int userInput){
        this.currentGuess = userInput;
        int comparisonResult;
        if(userInput < computerGuess){
            numberOfTrials();
            comparisonResult = 1;
        } else if (userInput > computerGuess) {
            numberOfTrials();
            comparisonResult = 2;

        } else {
            numberOfTrials();
            comparisonResult = 3;
        }
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
                statement = "Your guess was right! You guessed it in " + trials + "!";
                break;
            }
        }
        return statement;
    }

    public int numberOfTrials() {
        if(lastInput == currentGuess){
            trials = trials;
        } else {
            trials = trials + 1;
        }
        this.lastInput = currentGuess;
        return trials; //Got help from Jalisa
    }
}
