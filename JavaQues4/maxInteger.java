import java.util.*;
public class maxInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The first number "+ firstNumber+" is the greatest");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The second number "+ secondNumber+" is the greatest");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The third number " + thirdNumber+ " is the greatest");
        } else {
            System.out.println("All numbers are equal");
        }
        
    }
}

// A code by Sujahath MSM 