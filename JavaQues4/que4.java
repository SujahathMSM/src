import java.util.*;
public class que4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit price here: ");
        int unitPrice = input.nextInt();

        System.out.print("Enter the amount bought: ");
        int amountBought = input.nextInt();

        int total = unitPrice * amountBought;

        if (total > 1500) {
            System.out.println("You are entitled to the super draw" +
                    "1");
        } else {
            System.out.println("Try again!");
        }
    }
}
