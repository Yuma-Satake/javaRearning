class Test {
    public static void main(String[] args) {
        char[] ary1 = new char[5];
        ary1[0] = 'S';
        ary1[1] = 'E';
        char[] ary2 = { 'S', 't', 'a', 'n', 'd', 'a', 'r', 'd' };
        ary1 = ary2; //アドレスコピー
        System.out.print(ary1);
    }
}