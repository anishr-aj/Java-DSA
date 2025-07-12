import java.util.*;

public class areaofcircle {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the value of radius = ");
        int radius = Sc.nextInt();
        float area = 3.14f *radius *radius;
        System.out.println("Area of circle is = " +area);
    }
}
