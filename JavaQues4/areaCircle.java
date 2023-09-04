import java.text.DecimalFormat;
import java.util.*;
public class areaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle: ");
        int radius = input.nextInt();
        float Area = (float) (Math.PI * radius * radius);

        System.out.println("The area of the circle is: "+ Area);
    }
}
