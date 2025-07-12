package conditional_statement;
import java.util.*;

public class elseif {
    public static void main(String[] args) {
        int a = 13;

        if (a >= 18) {
            System.out.println("adult");
        }
        else if (a > 13 && a < 18) {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }
    }
}
