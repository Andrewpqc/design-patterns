import framework.Product;

public class UnderlinPen implements Product {
    private char underlineChar;

    public UnderlinPen(char ch) {
        underlineChar = ch;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        System.out.println(s);
        for (int i = 0; i < len; ++i) {
            System.out.print(underlineChar);
        }
        System.out.println();

    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
