class WhileTest {
    public static void main(String[] args) {
        boolean x = false;
        if (x = true) {
            while (x) {
                System.out.print("true");
                x = false;
            }
        } else {
            System.out.print("false");
        }
    }
}