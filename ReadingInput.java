// Reading Input

import java.util.Scanner;

public class ReadingInput{

    public static void main(String[] args){
        // to read a number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();

        // to read a string
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner2.nextLine();
        System.out.println(name + " is " + age + "!");

    }
}
