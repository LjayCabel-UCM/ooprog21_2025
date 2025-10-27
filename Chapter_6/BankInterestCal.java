import java.util.Scanner;

public class BankInterestCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double startingAmount = scanner.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (double rate : rates) {
            double currentBalance = startingAmount;
            System.out.println("\nWith an initial balance of $" + currentBalance +
                    " at an interest rate of " + rate);

            for (int yearCount = 1; yearCount <= 4; yearCount++) {
                currentBalance += currentBalance * rate;
                System.out.println("After year " + yearCount + " balance is $" + currentBalance);
            }
        }

        scanner.close();
    }
}
