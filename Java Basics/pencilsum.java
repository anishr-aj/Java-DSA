import java.util.*;

public class pencilsum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        
        float sum = pencil + pen + eraser;
        System.out.println("Your total amount is = " +sum);

        float gst = sum + (sum * 0.18f);
        System.out.println("With gst = " +gst);
       

    }
}