public class IfTest {
    public static void main(String args[]) {
        int num1 = 2;
        int num2 = 3;
        if (num1 != 2)
            System.out.print("if");
        else if (num2 > num1)
            System.out.print("else if");
        else
            System.out.print("else");
    }
}