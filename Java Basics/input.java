import java.util.*;
public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //for single word we use next()
        String name1 = sc.next();
        System.out.println(name1);

        //for multiple word or paragraph we use nextLine()
        String name = sc.nextLine();
        System.out.println(name);

    }
    
}

// This will give this output - My name is Anish
//My
//name is Anish
