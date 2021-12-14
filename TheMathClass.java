// Math class

public class TheMathClass{

    public static void main(String[] args){
        // round
        int a = Math.round(1.5F);
        System.out.println("round(1.5) -> " + a);

        int c = Math.round(1.4F);
        System.out.println("round(1.4) -> " + c);

        // ceil **double is default**
        double b = Math.ceil(2.2F);
        System.out.println("ceil(2.2) -> " + b);

        int d = (int)Math.ceil(4.5F);
        System.out.println("(int)ceil(4.5) -> " + d);

        // floor **double default**
        double e = Math.floor(3.8f);
        System.out.println("floor(3.8) -> " + e);

        int f = (int)Math.floor(5.5f);
        System.out.println("(int)floor(5.5) -> " + f);

        // max
        int g = Math.max(2, 4);
        System.out.println("max(2, 4) -> " + g);

        //min
        int h = Math.min(3, 6);
        System.out.println("min(3, 6) -> " + h);

        double i = Math.random();
        System.out.println("random() -> " + i);

        // to get integers from 0-10
        int j = (int)(Math.random() * 10);
        System.out.println("(int)random()*10 -> " + j);


    }
}
