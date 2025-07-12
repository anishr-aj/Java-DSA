package conditional_statement;
import java.util.*;

public class three_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            System.out.println("A is greater.");
        }
        else if( a < c) {
            System.out.println("C is greater.");
        }
        else {
            System.out.println("B is greater.");
        }
    }

    
}
