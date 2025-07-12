package Loop;

import java.util.Scanner;

public class inputmulten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }    
            else {
                System.out.println("Enter the no which is divisible by 10");
            }
            System.out.println(n);
        }while(true);
        System.out.println("Congrulations You find it.");
    }
}
