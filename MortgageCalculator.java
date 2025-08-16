import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        double mortgage;
        double annualRateOfInterest;
        double monthlyRateOfInterest;
        double principal;
        double years;
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        principal = sc.nextDouble();
        System.out.print("Annual Rate of Interest: ");
        annualRateOfInterest = sc.nextDouble();
        monthlyRateOfInterest = annualRateOfInterest/1200;
        System.out.print("Period (Years): ");
        years = sc.nextDouble();
        double monthlyPayments = 12 * years;
        mortgage = principal * (monthlyRateOfInterest * Math.pow(1+monthlyRateOfInterest, monthlyPayments))/(Math.pow(1+monthlyRateOfInterest, monthlyPayments)-1);
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
