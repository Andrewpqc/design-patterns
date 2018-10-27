public class TextBuilder extends Builder {
    @Override
    public void makeItems(String[] items) {
        for(String s :items){
            System.out.println("    "+s);
        }
    }

    @Override
    public void makeStrng(String string) {
        System.out.println("**"+string+"**");
    }

    @Override
    public void makeTitle(String title) {
        System.out.println("---"+title+"---");
    }

    @Override
    public void close() {
        System.out.println("---------end--------");
    }
}
