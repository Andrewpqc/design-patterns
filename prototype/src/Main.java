import framework.Manager;
import framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("~underlinepen", new UnderlinPen('~'));
        manager.register("*messagebox", new MessageBox('*'));
        manager.register("#messagebox", new MessageBox('#'));

        Product p = manager.create("~underlinepen");
        p.use("hello, world");

        Product p2 = manager.create("*messagebox");
        p2.use("hello, world");

        Product p3 = manager.create("#messagebox");
        p3.use("hello, world");
    }
}
