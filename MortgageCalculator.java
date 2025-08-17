import java.text.NumberFormat;
import java.util.Scanner;

//Ideally a method should not have more than 25 lines otherwise we need to refactor the code.
public class MortgageCalculator {
    public static void main(String[] args) {
        double mortgage;
        double annualRateOfInterest = 0;
        double principal = 0;
        double years = 0;

        Scanner sc = new Scanner(System.in);

        principal = readNumber(sc, "Principal ($1K - $1M): ", 1000, 1_000_000);
        annualRateOfInterest = readNumber(sc, "Annual Rate of Interest (%): ", 1, 30);
        years = (int) readNumber(sc, "Period (Years): ", 1, 30);
        mortgage = getMortgage(principal, annualRateOfInterest, years);


        System.out.println("Mortgage");
        System.out.println("--------");
        System.out.println("Monthly Payment: " + NumberFormat.getCurrencyInstance().format(mortgage));
        System.out.println("Payment Schedule");
        System.out.println("----------------");
        balance(principal, mortgage);
    }

    private static void balance(double principal, double mortgage) {
        double balanceAmount = principal;
        while (balanceAmount > 0) {
            balanceAmount -= mortgage;
            if (balanceAmount < 0) break;
            System.out.println("$" + Math.round(balanceAmount));
        }
    }

    private static double readNumber(Scanner sc, String prompt, double low, double high) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = sc.nextDouble();
            if (value >= low && value <= high) {
                break;
            }
            System.out.println("Enter a number between " + low + " and " + high + ".");
        }
        return value;
    }

    private static double getMortgage(double principal, double annualRateOfInterest, double years) {
        double monthlyRateOfInterest;
        double mortgage;

        monthlyRateOfInterest = annualRateOfInterest / 1200; // annual % → monthly decimal
        double numberOfPayments = years * 12;

        mortgage = principal * (monthlyRateOfInterest * Math.pow(1 + monthlyRateOfInterest, numberOfPayments)) / (Math.pow(1 + monthlyRateOfInterest, numberOfPayments) - 1);
        return mortgage;
    }
}
