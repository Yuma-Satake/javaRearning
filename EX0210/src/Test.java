class Test {
    int num = 5;
    public static void main(String args[]) {
        int num = 10;
//        System.out.println(num);
        System.out.println(calc(num, num));
    }
    
    public static int calc(int num1, int num2) {
        int num = num1 + num2;
        return num;
    }
}