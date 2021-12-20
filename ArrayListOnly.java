// This will be everything I need to use ArrayLists

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOnly{
    public static void main(String[] args){

        // Initializing
        ArrayList<String> foodArrayList = new
            ArrayList<>(Arrays.asList("Eggs", "Yogurt", "Toast"));

        System.out.println("\nAfter initializing...");
        System.out.println(foodArrayList + "\n");

        // Adding elemts
        foodArrayList.add("Apple");
        foodArrayList.add(1, "Hot Sauce");
        foodArrayList.add(3, "Granola");
        foodArrayList.add(foodArrayList.size() - 1, "Guacamole" + "\n");

        System.out.println("After adding elements...");
        System.out.println(foodArrayList + "\n");

        // Check if ArrayList contains element
        System.out.print("foodArrayList.contains(\"Apple\") -> ");
        System.out.println(foodArrayList.contains("Apple"));

        // Getting element at an index
        System.out.print("foodArrayList.get(3) -> ");
        System.out.println(foodArrayList.get(3));

        // Getting index of an element in ArrayList
        System.out.print("foodArrayList.indexOf(\"Toast\") -> ");
        System.out.println(foodArrayList.indexOf("Toast"));

        // Checking if ArrayList is empty
        System.out.print("foodArrayList.isEmpty() -> ");
        System.out.println(foodArrayList.isEmpty());

        // Getting the last index of an element
        System.out.print("foodArrayList.lastIndexOf(\"Yogurt\") -> ");
        System.out.println(foodArrayList.lastIndexOf("Yogurt"));

        // Removing elements
        // one at a time
        foodArrayList.remove(0);
        System.out.println("\nAfter removing first element...");
        System.out.println(foodArrayList + "\n");

        // from x to y
        int x = 1, y = 3;
        foodArrayList.subList(x, y).clear();
        System.out.println("\nAfter removing (1, 3) element...");
        System.out.println(foodArrayList + "\n");

    }
}
