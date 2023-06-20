class WhileTest {
    public static void main(String[] args) {
        int num = 0;
        while (++num < 3) {
            System.out.print("+ ");
            if (num == 2) {
                System.out.print("- ");
            }
        }
    }
}