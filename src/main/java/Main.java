// Importing StringUtils library
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter something: ");
        String userInput = input.nextLine();

        System.out.println("You entered: \"" + userInput + "\"");

        if (StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is a number.");
        } else if (!StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\" is not a number.");
        }

        // Printing user input in flipped case.
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));

        // Printing user input in reverse.
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
