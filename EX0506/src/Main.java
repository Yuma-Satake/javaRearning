import java.time.LocalDate;

class Foo {
    public void show() {
        System.out.println("FooClassのインスタンス");
    }

    public void show1() {
        System.out.println("FooClassにしかない");
    }
}


class Bar extends Foo {
    public void show() {
        System.out.println("BarClass・ダイナミックバインディング");
    }

    public void show2() {
        System.out.println("BarClassにしかない");
    }
}


public class Main {
    public static void main(String[] args) {

        // Foo foo = new Foo();
        // foo.show();
        // foo.show1();

        // Bar bar = new Bar();
        // bar.show();
        // bar.show1();
        // bar.show2();

        Foo foo2 = new Bar();
        foo2.show();
        foo2.show1();
        // foo2.show2(); // コンパイルエラー

        // Bar bar2 = new Foo(); // コンパイルエラー


    }
}
