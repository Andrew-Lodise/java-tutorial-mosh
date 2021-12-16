// for loops
// While loops

public class Loops{

    public static void main(String[] args){

        // for loops
        for (int i = 0; i < 5; i++){
            System.out.println("for loop " + i);
        }

        // while loop
        int j = 0;
        while(j < 5){
            System.out.println("while loop # " + j);
            j++;
        }

        // do-while
        int k = 0;
        do {
            System.out.println("do-while loop # " + k);
            k++;
        } while (k < 5);

        // break and continue
        // break breaks you out of a loop
        // continue pushes control to beginning of loop

        // for-each **forward only**
        String[] fruits = {"apple", "mango", "orange"};

        for (String fruit : fruits){
            System.out.println(fruit);
        }


    }
}
