
class ComparingTest {
    public static void main(String args[]) {
        // ショートサーキットにより(a2 <= b2++）の処理は行われないのでb2は2のまま
        int a1 = 1, b1 = 2, a2 = 1, b2 = 2;
        System.out.print((a1 >= b1) && (a2 <= b2++));
        System.out.println(b2);

        a1 = 1;
        b1 = 2;
        a2 = 1;
        b2 = 2;
        System.out.print((a1 >= b1) & (a2 <= b2++));
        System.out.println(b2);
        // 再確認3
        // 前置演算子と後置演算子の違い
        a1 = 1;
        // alは1増えてから表示
        System.out.println(++a1);
        a1 = 1;
        // alは表示してから1増える
        System.out.println(a1++);
        // 再確認4（優先順位：｜は｜｜より優先順位が高い）
        a1 = 1;
        b1 = 2;
        a2 = 1;
        b2 = 2;
        System.out.println(b1 <= a1 || b1 <= a1 | a2 <= b2);
        // ビット演算(論理積、論理和、排他的論理和、否定）
        a1 = 241;
        b1 = 192;
        int c1 = a1 & b1;
        System.out.println(c1);
        c1 = a1 | b1;
        System.out.println(c1);
        c1 = a1 ^ 61;
        System.out.println(c1);
        c1 = ~a1;
        System.out.println(c1);
        a1 = 1;
        System.out.println(a1 < 3);

        a1 = 8;
        System.out.println(a1 >> 3);
        // 比較処理
        a1 = 1;
        b1 = 1;
        if (a1 == b1) {
            System.out.println("比較処理");
        }
        if (a1 == b1) {
            System.out.println("Javaでは代入処理は判定に使用できない");
        }
        if (a1 == b1) {
            System.out.println("Javaには==はない");
        }
    }
}
