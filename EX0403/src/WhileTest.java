class WhileTest {
    public static void main(String[] args) {
        boolean x = true;
        while (x) {
            x = false;
            if (!x) {
                System.out.print("A");
                x = true;
                continue;
            }
            System.out.print("B");
            break;
        }
    }
}