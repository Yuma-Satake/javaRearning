class ExForTest {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 0;
        num[1] = 1;
        //拡張for文なのですべての要素を出力　初期値は型が整数値なので０
        for(int i : num) {
            System.out.print(i + " ");
        }
    }
}