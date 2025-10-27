import java.util.Scanner;
public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double initialBalance;
        System.out.print("Enter initial bank balance : ");
        initialBalance = sc.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};
        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            double balance = initialBalance;
            System.out.println("\nWith an initial balance of $" + initialBalance +
                                " at an interest rate of " + rate);

            for (int year = 1; year <= 4; year++) {
                balance += balance * rate;
                System.out.println("After year " + year + " balance is $" + balance);
            }
        }
        sc.close();
    }
