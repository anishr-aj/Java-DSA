import java.util.*;

public class uniary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = ++a;
        System.out.println("New value = " +sum);

        int b = sc.nextInt();
        int sum2 = --b;
        System.out.println("New value = " +sum2);
    }

    
}
