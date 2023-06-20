class Calc {
    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        b += (a + a) * b;
        a += b += a;
        System.out.println("a: " + a + " b: " + b);
    }
}