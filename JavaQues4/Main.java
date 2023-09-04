import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number1 = input.nextInt();
        System.out.print("Enter the number 2: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            int sum = number1 + number2;
            System.out.println("The total of number1 and number2 is: "+ sum);
        } else {
            System.out.println(number1+ " " + number2);
        }
    }
}