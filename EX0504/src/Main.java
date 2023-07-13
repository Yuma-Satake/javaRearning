
public class Main {
    public static void main(String[] args) {
        // Triangle 型のオブジェクトを代入（アップキャスト）
        Shape tri = new Triangle(10, 50);
        // Rectangle 型のオブジェクトを代入（アップキャスト）
        Shape rec = new Rectangle(10, 50);
        System.out.println(tri.getArea()); // 250.0
        System.out.println(rec.getArea()); // 500.0
    }
}
