class Ary {
    public static void main(String[] args) {
        String s[] = { "foo", "bar", "baz" };
        int i[] = new int[3];
        char c[] = new char[5];
        
        i[1] = 100;
        i[2] = 200;
        
        c[0] = 'A';
        c[1] = 'B';
        c[2] = 'C';
        c[3] = 'D';
        
        System.out.println("length : " +
            (s.length + i.length + c.length));
    }
}