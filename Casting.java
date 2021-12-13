// Casting

public class Casting{

    public static void main(String[] args){

        // Implicit casting
//byte > short > int > long > float > double
        short x = 1;
        int y  = x + 2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

        // Explicit Casting
        double c = 1.1;
        int d = (int)c + 2;
        System.out.println(d);

        // string to integer
        String e = "123";
        System.out.println(Integer.parseInt(e));

        // string to double
        String f = "8.3";
        System.out.println(Double.parseDouble(f));

        // char to Strings
        char myChar = 'z';
        String myString = Character.toString(myChar);
        System.out.println(myString);





    }
}
