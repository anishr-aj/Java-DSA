package Loop;
public class nrev {
    
    public static void main(String[] args) {
        int n = 2749;
       while (n > 0) {
        int lastdigit = n % 10;
        System.out.println(lastdigit + "");
        n = n / 10 ;

       }
       System.out.println();
    }
}
