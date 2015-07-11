import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Chizhov-AS on 27.04.2015.
 */

public class GetUserInput {

   private int[] numbers;

    public int[] readConsole() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        try {
            String string = bufferedReader.readLine();
            numbers = parseString(string);

        } catch (NumberFormatException nfe) {
            System.err.println("Invalid Format");
        }

        return numbers;

    }

    public int[] parseString(String string) {
        int[] numbers = new int[string.length()];

        for (int i=0; i<string.length(); i++){
            numbers[i] = Integer.parseInt(String.valueOf(string.charAt(i)));
        }
        return numbers;
    }
}