package Projects;
import java.util.*;

public class marks_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks: ");
        int marks = sc.nextInt();

        if (marks >= 33) {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

    }
    
}
