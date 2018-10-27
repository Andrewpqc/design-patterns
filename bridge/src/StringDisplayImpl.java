public class StringDisplayImpl extends DispalyImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        System.out.print('+');
        for (int i = 0; i < width; ++i)
            System.out.print('-');
        System.out.println('+');
    }

    @Override
    public void rawPrint() {
        System.out.println('|' + string + '|');
    }

    @Override
    public void rawClose() {
        System.out.print('+');
        for (int i = 0; i < width; ++i)
            System.out.print('-');
        System.out.println('+');
    }
}
