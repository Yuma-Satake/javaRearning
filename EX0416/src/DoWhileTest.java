class DoWhileTest {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.print("A");
        } while(++num - num++ < 0);
        //num++は後置演算子なので判定処理後、インクリメント
    }
}