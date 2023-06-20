class SwitchTest {
    public static void main(String args[]) {
        String str = "B";
        
        switch (str) {
        case "A":
            System.out.print("A ");
        case "B":
            System.out.print("B ");
        default:
            System.out.print("default");
        }
    }
}