class Main {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        s1.test1();
        s1.test2();
        s1.test1("test1");

        System.out.println(s1.test1("太郎"));
        s1.msg1();
        s1.msg2();
    }
}
