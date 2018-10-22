//使用委托的适配器模式

public class PrintAdapter2 implements Print {
    private Banner banner;

    public PrintAdapter2(String s) {
        banner = new Banner(s);
    }

    @Override
    public void printWeak() {
        banner.printWithWeak();
    }

    @Override
    public void printStrong() {
        banner.printWithStrong();
    }
}
