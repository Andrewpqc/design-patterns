public class Banner {
    private String s;

    public Banner(String s) {
        this.s = s;
    }

    public void printWithWeak() {
        System.out.println("(" + s + ")");
    }

    public void printWithStrong() {
        System.out.println("*" + s + "*");
    }

    public String getS() {
        return s;
    }
}
