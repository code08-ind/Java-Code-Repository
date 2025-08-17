import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        double mortgage;
        double annualRateOfInterest = 0;
        double monthlyRateOfInterest;
        double principal = 0;
        int years = 0;
        Scanner sc = new Scanner(System.in);

        while (!(principal >= 1000 && principal <= 1_000_000)) {
            System.out.print("Principal ($1K - $1M): ");
            principal = sc.nextDouble();
            if (!(principal >= 1000 && principal <= 1_000_000)) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
            }
        }

        while (!(annualRateOfInterest > 0 && annualRateOfInterest <= 30)) {
            System.out.print("Annual Rate of Interest (%): ");
            annualRateOfInterest = sc.nextDouble();
            if (!(annualRateOfInterest > 0 && annualRateOfInterest <= 30)) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
            }
        }

        while (!(years >= 1 && years <= 30)) {
            System.out.print("Period (Years): ");
            years = sc.nextInt();
            if (!(years >= 1 && years <= 30)) {
                System.out.println("Enter a value between 1 and 30");
            }
        }

        monthlyRateOfInterest = annualRateOfInterest / 1200; // annual % → monthly decimal
        int numberOfPayments = years * 12;

        mortgage = principal *
                (monthlyRateOfInterest * Math.pow(1 + monthlyRateOfInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyRateOfInterest, numberOfPayments) - 1);

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
