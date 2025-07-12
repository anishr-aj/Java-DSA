package Projects;
import java.util.*;

import conditional_statement.elseif;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income: ");
        int income = sc.nextInt();

        if (income < 500000) {
            System.out.println("You have to pay 0% tax");
        }
        else if(income > 500000 && income < 1000000) {
            System.out.println("You have to pay 20% tax");
        }
        else {
            System.out.println("You have to pay 30% tax");
        }
    }

    
}
