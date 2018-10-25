package framework;

public interface Product extends Cloneable {
    abstract void use(String s);

    abstract Product createClone();
}
