public class Display {
    private DispalyImpl impl; //这里的impl就充当了bridge

    public Display(DispalyImpl dispalyImpl) {
        this.impl = dispalyImpl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }
}
