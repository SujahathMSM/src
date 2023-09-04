import java.util.*;
public class que5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the unit price here: ");
        int unitPrice = input.nextInt();

        System.out.print("Enter the amount bought: ");
        int amountBought = input.nextInt();

        int total = unitPrice * amountBought;
        int discount = 5;
        int discountAmount = (total * discount) / 100;

        if (total > 500) {
            int totalAfterDiscount = total - discountAmount;
            System.out.println("Discount Amount is: "+ discountAmount);
            System.out.println("Total after discount: "+ totalAfterDiscount);

        } else {
            System.out.println("No discount given");
        }
    }
}
