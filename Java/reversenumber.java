import java.util.*;

public class reversenumber {
    public static void main(String[] args) {
        int n = 220506;
        int reverse = 0;

        while(n > 0)  {
            int lastDigit = n % 10;
            reverse = (reverse*10) + lastDigit;
            n = n/10;
        }
        System.out.println(reverse);
    }


    
}
