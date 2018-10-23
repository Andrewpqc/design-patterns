package idcard;

import framework.Product;

public class IDCard extends Product {
    private final String owner;

    public IDCard(String owner) {
        this.owner = owner;
        System.out.println("制作" + owner + "的ID Card");
    }

    @Override
    public void use() {
        System.out.println(owner + "使用了ID Card");
    }

    public String getOwner() {
        return owner;
    }
}
