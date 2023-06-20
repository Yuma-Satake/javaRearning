class Test {
    public static void main(String[] args) {
        String exam = "Bronze";
        String message = "";
        switch (exam.charAt(3)) {
        case 'o':
            message = "o";
            break;
        case 'n':
            message = "n";
            break;
        default:
            message = "other";
        }
        System.out.println(message);
    }
}