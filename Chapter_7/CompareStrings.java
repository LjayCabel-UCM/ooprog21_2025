import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String predefinedString = "Carmen";

        System.out.print("Enter your name > ");
        String input = sc.nextLine();

        if (predefinedString.equals(input)) {
            System.out.println(predefinedString + " equals " + input);
        } else {
            System.out.println(predefinedString + " does not equal " + input);
        }

        sc.close();
    }
}
