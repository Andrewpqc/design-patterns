//使用继承的适配器模式

public class PrintAdapter1 extends Banner implements Print {
    public PrintAdapter1(String s) {
        super(s);
    }

    @Override
    public void printStrong() {
        printWithStrong();
    }

    @Override
    public void printWeak() {
        printWithWeak();
    }
}
