public class StringDisplay extends AbstractDisplay {
    private String s;

    public StringDisplay(String str){
        s =str;
    }

    @Override
    public void open() {
        System.out.println("<---------");
    }

    @Override
    public void print() {
        System.out.println(s);
    }

    @Override
    public void close() {
        System.out.println("--------->");
    }
}
