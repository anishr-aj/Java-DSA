package conditional_statement;
import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        int age = 22;
        if (age >= 18) {
            System.out.println("You are adult");

        if (age > 13 && age < 18) {
            System.err.println("Teenager");
            
        }    
        } else {
            System.out.println("You are not adult");
        }
    }
}