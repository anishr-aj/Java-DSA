import java.util.*;

public class averageofnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();
        System.out.println("Enter value of c");
        int c = sc.nextInt();

        int sum = a + b + c;
        System.out.println("Sum of a,b,c is = " +sum);

        int avg = sum / 3;
        System.out.println("average of 3 numbers is = " +avg);
        

    }
    
}
