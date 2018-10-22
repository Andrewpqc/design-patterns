public class Main {
    public static void main(String[] args) {
        Print p1 = new PrintAdapter1("adapter1");
        Print p2 = new PrintAdapter2("adapter2");

        p1.printStrong();
        p1.printWeak();

        p2.printStrong();
        p2.printWeak();
    }
}
