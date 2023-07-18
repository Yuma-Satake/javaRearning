public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        // super クラスのコンストラクタを呼び出す
        super(width, height);
    }

    // 四角形の面積を取得
    @Override
    public double getArea() {
        // Super クラスから引き継いだ幅と高さを掛け算している
        return this.width * this.height;
    }
}
