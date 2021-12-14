// Mortgage Calculator Project
import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator{

    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner key = new Scanner(System.in);

        System.out.print("Principle: ");
        double P = key.nextDouble();

        System.out.print("Annual interest rate: ");
        double r = key.nextDouble() / MONTHS_IN_YEAR / PERCENT;

        System.out.print("Period (Years): ");
        double n = key.nextDouble() * MONTHS_IN_YEAR;

        double numerator = P * r * Math.pow((1 + r), n);
        double demononator = Math.pow((1 + r), n) - 1;

        double Mortgage = (numerator/demononator);
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();
        String result = dollarFormat.format(Mortgage);
        System.out.println("Mortgage: " + result);
    }
}
