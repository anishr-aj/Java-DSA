public class operatorsprogram3 {
    public static void main(String args[])  {
        int x;
        int y;
        int z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x+y);
        System.out.println(x+" "+y+z);
    }
}
