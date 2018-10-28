public abstract class Entity {
    public abstract String getName();
    public abstract int getSize();

    //向文件add要报错
    public Entity add(Entity entity) throws Exception{
        throw new Exception();
    }

    public void printList(){
        printList("");
    }

    abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName()+" ("+getSize()+')';
    }
}
