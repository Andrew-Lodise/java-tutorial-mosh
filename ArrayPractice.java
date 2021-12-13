//Arrays
import java.util.Arrays;

public class ArrayPractice{

    public static void main(String[] args){

        //initializing an Array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println("Numbers:");
        System.out.println(Arrays.toString(numbers));

        // easy way
        int[] easyList = {0, 1, 1, 2, 3};

        System.out.println("easyList:");
        System.out.println(Arrays.toString(easyList));

        // get length
        System.out.println("length of easyList:");
        System.out.println(easyList.length);

        // sort Arrays
        Arrays.sort(numbers);
        Arrays.sort(easyList);

        System.out.println("Both arrays sorted");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(easyList));

        // Multi-dimensional Arrays/ Matricies
        int[][] twoDArray = new int[2][3];
        twoDArray[0][0] = 1;

        // easier way to make 2d Arrays
        int[][] easyTwoDArray = {{1, 2, 3}, {4, 5, 6}};

        // how to print 2d arrays
        System.out.println("twoDArray:");
        System.out.println(Arrays.deepToString(twoDArray));

        System.out.println("easyTwoDArray:");
        System.out.println(Arrays.deepToString(easyTwoDArray));

        // Constants
        final float PI = 3.141f;
        System.out.println("constant example:");
        System.out.println("PI: " + PI);


    }
}
