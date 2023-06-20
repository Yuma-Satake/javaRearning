class Nest {
    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3 }; int[] num2 = { 4, 5, 6 };
        for(int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
            for(int j = 0; j < num2.length; j++)
                System.out.print(num2[j] + " ");
        }
    }
}