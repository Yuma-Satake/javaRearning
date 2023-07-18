public class Shape {
    protected double width;
    protected double height;

    // コンストラクタがセッタの役目をしている
    public Shape(double pwidth, double pheight) {
        this.width = pwidth;
        this.height = pheight;
    }

    // 図形の面積を取得（サブクラスでオーバーライドする）
    public double getArea() {
        return 0;
    }
}
