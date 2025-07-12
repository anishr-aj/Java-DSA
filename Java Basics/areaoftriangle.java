import java.util.*;

public class areaoftriangle {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of Base = ");
    int base = sc.nextInt();
    System.out.println("Enter length of height = ");
    int height = sc.nextInt();
     
    float sum = 0.5f * base * height;
    System.out.println("Area of Triangle = "+sum);

    }

    
}
