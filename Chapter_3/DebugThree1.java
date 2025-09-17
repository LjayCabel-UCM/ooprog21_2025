// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
 
public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);
 
        // Prompt the user to enter the amount of the first check
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble(); // Changed from nextInt() to nextDouble() to handle decimal values
 
        // Prompt the user to enter the amount of the second check
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble(); // Fixed typo 'inputnextInt()' to 'input.nextDouble()'
 
        // Calculate and display the tip for both checks
        calcTip(check1); 
        calcTip(check2);
    }
 
    // Method to calculate the tip based on the bill amount
    public static void calcTip(double bill) {
        final double RATE = 0.15; // Tip rate is 15%
        double tip;
        tip = bill * RATE; // Corrected formula to calculate tip: bill * RATE (not bill / RATE)
        System.out.println("The tip should be at least $" + tip); // Output the calculated tip
    }
}
