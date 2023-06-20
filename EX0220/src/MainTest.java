class MainTest {
    public static void main(int[] args) {
        System.out.println("result : " + (args[0] + args[1]));
    }
    //このmainメソッドしか呼び出されない（オーバーロード）
    public static void main(String[] args) {
        System.out.println("result = " + args[2] + args[3]);
    }
    public static void main(char[] args) {
        System.out.println("result = " + args[4] + args[5]);
    }
}