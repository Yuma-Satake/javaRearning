class Nest {
    public static void main(String[] args) {
        int i = 0, j = 0;
        for(i = 0; i < 3; i++) {
            System.out.print(i);
            //ループの後に;があるので何も処理しない
            for(j = 0; j < 3; j++);
            System.out.print(j);
        }
    }
}