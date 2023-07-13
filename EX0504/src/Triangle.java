public class Triangle extends Shape {
    public Triangle(double width, double height) {
        // super クラスのコンストラクタを呼び出し、setter の処理を行っている
        super(width, height);
    }

    // 三角形の面積取得
    @Override
    public double getArea() {
        // super クラスの幅と高さの変数の値から三角形の面積を求めている
        return this.width * this.height / 2;
    }
}
