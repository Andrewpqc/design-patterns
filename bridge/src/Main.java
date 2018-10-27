public class Main {
    public static void main(String[] args){
        StringDisplayImpl stringDisplayImpl= new StringDisplayImpl("hello,world");
        Display display = new Display(stringDisplayImpl);
        display.open();
        display.print();
        display.close();

        CountDisplay countDisplay = new CountDisplay(stringDisplayImpl);
        countDisplay.countDisplay(5);
    }
}
