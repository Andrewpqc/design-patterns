public class Main {
    public static void main(String[] args){
        TextBuilder textBuilder = new TextBuilder();
        HTMLBuilder htmlBuilder = new HTMLBuilder();

        Director textDirector = new Director(textBuilder);
        Director HTMLDirector = new Director(htmlBuilder);

        textDirector.construct();

        HTMLDirector.construct();
    }
}
