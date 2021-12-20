// Array vs **ArrayLists**
// mostly ArrayLists

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice{

    public static void main(String[] args){

        //      Initializing

        // Array **Can never change size**
        String[] friendsArray = new String[4];
        /* if declared like this all
        elements are null */

        // 2nd way
        String[] foodArray = {"Apple", "Banana", "Cookie"};
        // Will always be length 4

        // ArrayList
        ArrayList<String> friendArrayList = new ArrayList<>();
        // Do not need to specify a size

        // 2nd way
        ArrayList<String> foodArrayList = new
        ArrayList<>(Arrays.asList("Chicken", "Steak", "Tofu"));

        // Arrays can hold primatives and objects
        // ArrayLists can **only hold objects**
        // but can just use Integer for ints

        // Example
        ArrayList<Integer> integerArrayList = new
        ArrayList<>(Arrays.asList(12, 54, 312));

        //      Getting values

        // Array
        System.out.println(foodArray[1]);

        // ArrayList
        System.out.println(foodArrayList.get(1));

        //      Getting size

        // Array
        System.out.println(foodArray.length);

        // ArrayList
        System.out.println(foodArrayList.size());

        //      Adding an element
        // *cant with normal arrays*

        //ArrayList
        foodArrayList.add("Pork");

        //      Set an element

        // Array
        friendsArray[0] = "Connor";
        System.out.println(friendsArray[0]);

        // ArrayList
        foodArrayList.set(0, "Eggs");
        System.out.println(foodArrayList.get(0));

        //      Remove elemts
        // cant do it with arrays

        //ArraysLists
        foodArrayList.remove(0);
        foodArrayList.remove("Tofu");
        System.out.println(foodArrayList.get(0));

        //      Printing

        // Arrays
        System.out.println(Arrays.toString(foodArray));

        // ArrayList
        System.out.println(foodArrayList);




    }
}
