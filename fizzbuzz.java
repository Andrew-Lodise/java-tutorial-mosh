// Fizzbuzz prgram
// Takes a number input
// if divisible by 3 return Buzz
// if divisible by 5 return fizz
// if divisible by both FizzBuzz
// if neither return the number

import java.util.Scanner;

public class FizzBuzz{

    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.print("Number: ");
        int userNumber = key.nextInt();

        if (userNumber % 3 == 0 && userNumber % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (userNumber % 5 == 0){
            System.out.println("Fizz");
        }
        else if (userNumber % 3 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(userNumber);
        }
    }
}
