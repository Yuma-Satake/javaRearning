class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println(e1.getMsg());
        e1.setMsg("公開データ");
        System.out.println(e1.getMsg());
        Employee e2 = new Employee();
        System.out.println(e2.getMsg());
    }
}
