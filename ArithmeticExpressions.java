// Arithmetic expressions

public class ArithmeticExpressions{

    public static void main(String[] args){
        // addition
        int A = 4 + 5;
        System.out.println("4 + 5 = " + A);

        // subtraction
        int B = 4 - 5;
        System.out.println("4 - 5 = " + B);

        // multiplication
        int C = 4 * 5;
        System.out.println("4 * 5 = " + C);

        // division
        int D = 4 / 5;
        System.out.println("4 / 5 = " + D);
        // default give you integer division

        // double division
        double E = 4.0 / 5.0;
        System.out.println("4.0 / 5.0 = " + E);

        // increment operators
        //addition
        int F = 1;
        F++;
        System.out.println("1++ = " + F);

        //subtraction
        int G = 2;
        G--;
        System.out.println("2-- = " + G);

        //multistep increments
        int H = 3;
        H += 3;
        System.out.println("3 += 3 = " + H);

        int I = 4;
        I -= 2;
        System.out.println("4 -= 2 = " + I);
    }
}
