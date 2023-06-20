class Test {
    public static void main(String[] args) {
        int i = 1;
        do {
            i++;
            if(i % 2 == 0)
                i++;
            System.out.print(i + " ");
        } while(i <= 10);
    }
}