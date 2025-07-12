import java.util.*;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int tax;
        if(number<500000) {
            tax = 0;
        } 
        else if(number>=500000 && number>1000000) {
            tax = (int) (number * 0.2);
        } 
        else {
            tax = (int) (number * 0.3);
        }
        System.out.println("Your tax = " + tax);
            
        


    }
    
}
