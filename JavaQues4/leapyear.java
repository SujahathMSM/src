import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner inyear = new Scanner(System.in);
        System.out.print("Enter the year here: ");
        int year = inyear.nextInt();

        if (year % 4 == 0 && year %100 != 0) {
            System.out.println("Leap");
        } else if (year% 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Not Leap");
        }
    }
}
