public class Main {
    public static void main(String[] args){
        Directory root=new Directory("root");
        root.add(new Directory("usr"));
        root.add(new Directory("tmp"));
        root.add(new File("hello.md",200));

        root.printList();
    }
}
