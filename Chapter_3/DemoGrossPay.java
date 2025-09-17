public class DemoGrossPay {

    public static double calculateGross(double hoursWorked) {
        double hourlyRate = 22.75;
        return hoursWorked * hourlyRate;
    }

    public static void main(String[] args) {
        double[] hoursWorked = {10.0, 25.0, 37.5}; 
        for (double hours : hoursWorked) {
            double grossPay = calculateGross(hours);
            System.out.printf("%.1f hours at $22.75 per hour is $%.2f\n", hours, grossPay);
        }
    }
}
