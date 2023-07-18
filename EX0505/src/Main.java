import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("A100", "XenPad", 35670, LocalDate.of(2021, 1, 1), true);
        Product p2 = new Product("A101", "CoolPad", 22898, LocalDate.of(2021, 2, 2), false);
        Product p3 = new Product("A102", "iPad", 68000, LocalDate.of(2021, 3, 3), true);
        Product p4 = new Product("A104", "iPadAir2", 45199, LocalDate.of(2021, 4, 4), false);
        Product p5 = new Product("A105", "ASUSBook", 32000, LocalDate.of(2021, 5, 5), true);


        // setterメソッド（値の変更）
        p1.setPrice(40000);
        p1.setDate(LocalDate.of(2021, 6, 6));
        // getterメソッド（値の取得）
        System.out.println(p1.getNumber());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p1.getDate());
        System.out.println(p1.isStock());

        // インスタンスの内容を一括して表示
        System.out.println(p1.toString());

        // 追加メソッドのテスト
        System.out.println(p1.totalPrice(10));
    }
}
