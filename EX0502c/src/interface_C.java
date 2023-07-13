public interface interface_C extends interface_A, interface_B {
    public int test1(String msg);

    public default void msg1() {
        System.out.println("具象メソッド1");
    }

    public default void msg2() {
        System.out.println("具象メソッド2");
    }
}
