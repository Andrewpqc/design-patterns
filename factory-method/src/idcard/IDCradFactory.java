package idcard;

import framework.Factory;
import framework.Product;

public class IDCradFactory extends Factory {

    public IDCradFactory() {

    }

    @Override
    public Product createProduct(String owner) {
        Product p = new IDCard(owner);
        return p;
    }

    @Override
    public void registerProduct(Product p) {
        System.out.println("注册" + ((IDCard) p).getOwner() + "的ID Card");
    }
}
