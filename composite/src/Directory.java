import java.util.ArrayList;

public class Directory extends Entity {
    private String name;
    private ArrayList<Entity> directoryItems;

    public Directory(String name){
        this.name=name;
        directoryItems = new ArrayList();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        for(Entity entity:directoryItems){
            size+=entity.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+'/'+this);
        for(Entity entity:directoryItems)
            entity.printList(prefix+'/'+name);

    }


    public Entity add(Entity entity){
        directoryItems.add(entity);
        return this;
    }
}
