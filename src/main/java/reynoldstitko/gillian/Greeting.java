package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/13/17.
 */
public class Greeting {

    public String compareInputNames(String inputName){
        if(inputName.equals("Alice") || inputName.equals("Bob")) {
            return "Hello " + inputName;
        } else return "Hi";
    }

}
