class AssignmentTest {
    public static void main(String args[]) {
        int a = 8;
        int b = 2;
        
        a += b; a -= b;
        b *= a; b %= a;
        
        int x = b; int y = a;
        
        System.out.println("x: " + x + " y: " + y);
    }
}