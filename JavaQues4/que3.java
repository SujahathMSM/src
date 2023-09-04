import java.util.*;
public class que3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Chemistry marks here: ");
        int marksChemistry = input.nextInt();

        System.out.print("Enter the Physics marks here: ");
        int marksPhysics = input.nextInt();

        System.out.print("Enter the Combined Maths marks here: ");
        int marksCombinedMaths = input.nextInt();

        int totalMarks = marksChemistry + marksPhysics + marksCombinedMaths;
        float averageMarks = totalMarks / 3;

        if (averageMarks > 75.0) {
            System.out.println("Average is: "+ averageMarks);
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
