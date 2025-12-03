import java.util.Scanner;

public class ForexExchangeSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};

        
        double[][] rates = new double[5][5];

        System.out.println("=========== FOREX EXCHANGE SYSTEM ===========");
        System.out.println("Enter exchange rates for 5 days.\n");

        
        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Enter rates for " + currencies[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                rates[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        System.out.println("\n----------------- FOREX SUMMARY (Nov 1 – Nov 5) ----------------");
        System.out.println("Currency |  Nov1   Nov2   Nov3   Nov4   Nov5  |  Peak   Lowest");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < currencies.length; i++) {
            double peak = rates[i][0];
            double low = rates[i][0];

            System.out.printf("%-8s |", currencies[i]);

            for (int j = 0; j < 5; j++) {
                System.out.printf(" %6.2f", rates[i][j]);

                if (rates[i][j] > peak) peak = rates[i][j];
                if (rates[i][j] < low) low = rates[i][j];
            }

            System.out.printf(" | %6.2f %6.2f\n", peak, low);
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("\n--- DAILY CHANGES (Comparison From Previous Day) -----");
        System.out.println("(+ increase / - decrease / No change for same value)\n");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Currency: " + currencies[i]);

            for (int j = 0; j < 4; j++) {
                double prev = rates[i][j];
                double curr = rates[i][j + 1];

                System.out.print("Nov " + (j + 1) + " -> Nov " + (j + 2) + ": ");

                if (curr > prev)
                    System.out.printf("+ %.2f\n", curr - prev);
                else if (curr < prev)
                    System.out.printf("- %.2f\n", prev - curr);
                else
                    System.out.println("No Change");
            }

            System.out.println();
        }

        sc.close();
    }
}
