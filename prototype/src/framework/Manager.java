package framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> hm = new HashMap();


    public void register(String s, Product p) {
        hm.put(s, p);
    }

    public Product create(String s) {
        Product p = (Product) hm.get(s);
        return p.createClone();
    }

}
