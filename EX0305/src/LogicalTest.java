class LogicalTest {
    public static void main(String args[]) {
        int a = 2, b = 4, c = 6, d = 8;
        
        System.out.print((a < b) && (d >= c));
        System.out.print(" : ");
        System.out.print((c > a) || !(c < b));
    }
}