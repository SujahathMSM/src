import java.util.*;
public class que2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int absoluteNumber = Math.abs(number);
        System.out.println("The absolute number of the "+number+" is: "+absoluteNumber);
    }
}
