package Projects;
import java.util.*;

public class week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1-7: ");
        int a = sc.nextInt();

        switch(a) {
            case 1 : System.out.println("Monday");
            break;
            case 2 : System.out.println("Tuesday");
            break;
            case 3 : System.out.println("Wednesday");
            break;
            case 4 : System.out.println("Thrusday");
            break;
            case 5 : System.out.println("Friday");
            break;
            case 6 : System.out.println("Saturaday");
            break;
            case 7 : System.out.println("Sunnday");
            break;
            default : System.out.println("Please enter between 1-7: ");
            break;

        }
    }
}
