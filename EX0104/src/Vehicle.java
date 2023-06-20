class Taxi {
    public void drive() {
        System.out.println("drive a taxi.");
    }
}
class Plane {
    public void fly() {
        System.out.println("fly a plane.");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Taxi tx = new Taxi();
        tx.drive();
    }
}