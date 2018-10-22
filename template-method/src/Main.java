public class Main {
    public static void main(String[] args) {
        AbstractDisplay ad1 = new StringDisplay("hello");
        AbstractDisplay ad2 = new CharDisplay('A');

        ad1.display();
        ad2.display();
    }

}
