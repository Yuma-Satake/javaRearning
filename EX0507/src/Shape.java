public class Shape {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // コンストラクタがsetterの役割を果たす
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 図形の面積を取得
    public double getArea() {
        return width * height;
    }
}
