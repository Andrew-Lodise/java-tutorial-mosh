// If Statements

public class IfStatements{

    public static void main(String[] args){
        // if Statements

        int temperature = 30;
        if(temperature > 80){
            System.out.println("It's a hot day");
            System.out.println("Drink water");}
        else if(temperature < 60 && temperature > 40){
            System.out.println("Perfect wether!");}
        else {
            System.out.println("Cold Day");}

        // Simplifying if IfStatements

        int income = 99_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        // the Ternary Operators
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

        int networth = 1_200_000;
        char weathly = networth > 1_000_000 ? 'Y' : 'N';
        System.out.println(weathly);


    }
}
