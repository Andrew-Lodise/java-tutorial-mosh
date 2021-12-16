// Mortgage Calculator Project
import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator{

    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner key = new Scanner(System.in);
        double P = 0;
        double r = 0;
        double n = 0;

        while(true){
            System.out.print("Principle: ");
            P = key.nextDouble();
            if (P >= 1_000 && P <= 1_000_000)
                break;
            else
                System.out.println("Principle must be betweet 1,000 and 1,000,000");
        }

        while(true){
            System.out.print("Annual interest rate: ");
            r = key.nextDouble();
            if (r >= 1 && r <=30){
                r = r / (MONTHS_IN_YEAR * PERCENT);
                break;
            }
            else
                System.out.println("Rate must be between 1 and 30");
        }

        while(true){
        System.out.print("Period (Years): ");
        n = key.nextDouble();
        if (n >=1 && n <=30){
            n = n * MONTHS_IN_YEAR;
            break;
        }
        else
            System.out.println("Years must be between 0 and 30");

        }

        double numerator = P * r * Math.pow((1 + r), n);
        double demononator = Math.pow((1 + r), n) - 1;

        double Mortgage = (numerator/demononator);
        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance();
        String result = dollarFormat.format(Mortgage);
        System.out.println("Mortgage: " + result);
    }
}
