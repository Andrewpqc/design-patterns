public class File extends Entity {
    private String name;
    private int size;

    public File(String name, int size){
        this.name=name;
        this.size=size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+'/'+this);
    }
}
