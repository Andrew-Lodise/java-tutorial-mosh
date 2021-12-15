// Control Flow

public class ControlFlow{

    public static void main (String[] args){
        // Comparison Operators

        int x = 1;
        int y = 2;

        System.out.println("1 > 2:");
        System.out.println(x > y);
        //      == equal to
        //      != not equal to
        //      > greater than
        //      >= greater than or equal to
        //      < less than
        //      <= less than or equal to

        // Logical Operators
        int temperature = 23;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("23 > 20 && 23 < 30:");
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println("false || true:");
        System.out.println(isEligible);

        boolean hasCriminalRecord = false;
        boolean noCriminalRecord = !hasCriminalRecord;
        System.out.println("!false:");
        System.out.println(noCriminalRecord);

        //      && and
        //      || or
        //      ! not

    }
}
