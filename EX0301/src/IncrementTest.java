public class IncrementTest {
    public static void main(String args[]) {
        int a = 5;
        int b = 6;
        
        int x = ++a;
        int y = b++;
        
        x = y++;
        y = x++;
        
        System.out.println("x: " + x + " y: " + y);
    }
}