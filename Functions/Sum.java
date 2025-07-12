package Functions;

import java.util.*;

public class Sum {
    public static void calculateSum(int a, int b) {
        System.out.println(a + b);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}
