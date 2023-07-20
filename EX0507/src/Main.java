public class Main {
    public static void main(String[] args) {

        Shape tri = new Triangle(10, 50);

        System.out.println("三角形の面積は" + tri.getArea() + "です。");


        Shape rec = new Rectangle(10, 50);

        System.out.println("四角形の面積は" + rec.getArea() + "です。");
    }
}
