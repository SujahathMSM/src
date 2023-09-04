import java.util.*;
public class que8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int currentBalance = 12000;
        int dailyLimit = 10000;
        int charge = 2;
        System.out.print("Enter the amount to withdraw: ");
        int withdrawAmount = input.nextInt();

        if (withdrawAmount <= currentBalance && withdrawAmount <= dailyLimit) {
            System.out.println("You can withdraw");

            if (withdrawAmount < 5000) {
                float totalCharge = (withdrawAmount* charge)/100;
                System.out.println("Total charge: "+ totalCharge);
            } else {
                System.out.println("No charge");
            }
        } else {
            System.out.println("You cannot withdraw");}
    }
}
