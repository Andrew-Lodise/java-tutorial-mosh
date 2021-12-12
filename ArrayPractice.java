//Arrays
import java.util.Arrays;

public class ArrayPractice{

    public static void main(String[] args){

        //initializing an Array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(Arrays.toString(numbers));

        // easy way
        int[] easyList = {0, 1, 1, 2, 3};
        System.out.println(Arrays.toString(easyList));

        // get length
        System.out.println(easyList.length);

        // sort Arrays
        Arrays.sort(numbers);
        Arrays.sort(easyList);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(easyList));

    }
}
