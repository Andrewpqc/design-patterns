public class CountDisplay extends Display {
    public CountDisplay(DispalyImpl dispalyImpl) {
        super(dispalyImpl);
    }

    public void countDisplay(int count) {
        this.open();
        for (int i = 0; i < count; ++i) {
            this.print();
        }
        this.close();
    }
}
