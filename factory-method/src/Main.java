import framework.Factory;
import framework.Product;
import idcard.IDCradFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCradFactory();
        Product card1 = factory.create("Andrewpqc");
        Product card2 = factory.create("Bob");

        card1.use();
        card2.use();
    }
}
