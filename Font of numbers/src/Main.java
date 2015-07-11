import java.io.IOException;

/**
 * Created by Chizhov-AS on 14.03.2015.
 */
public class Main {
    public static void main(String[] args) {

        GetUserInput getUserInput = new GetUserInput();

        int[] numbers = null;

        try {
            numbers  = getUserInput.readConsole();

        } catch (IOException ex){
            ex.printStackTrace();
        }

        WriteResult writeResult = new WriteResult();
        writeResult.writeResult(numbers);
    }
}