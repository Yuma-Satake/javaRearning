class ComparingTest {
    public static void main(String args[]) {
        int a = 7, b = 5, c = 4, d = 6;

        //ショートサーキットにより(a <= c++）の処理は行われない
        System.out.print((b >= d) && (a <= c++));
        System.out.print(" : ");
        // ( a == ++d)の処理は行われる
        System.out.print((c <= b) | (a == ++d));
        System.out.print(" : ");
        System.out.print(c + " : " + d);
    }
}