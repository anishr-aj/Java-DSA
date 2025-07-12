package conditional_statement;
import java.util.*;

public class q_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");

        int a = sc.nextInt();

        if (a >= 0) {
            System.out.println("Postive");
        }
        else {
            System.out.println("Negative");
        }
    }
    
}
