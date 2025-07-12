package Loop;
import java.util.*;

public class inrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit + "");
            n = n / 10;
        }
    }
}
