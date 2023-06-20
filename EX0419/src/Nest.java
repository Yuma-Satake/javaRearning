class Nest {
    public static void main(String[] args) {
        String[] var = { "x", "y", "z" };
        for(int i = 0; i < var.length; ++i)
            for(String s : var)
                System.out.print(s);
    }
}