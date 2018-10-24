### [Factory Method](https://github.com/Andrewpqc/design-patterns/tree/master/factory-method/src) 
父类决定实例的生成方式，但不决定所要生成的具体的类

**framework.Product** :产品抽象类，有下面的api
``` java
public abstract void use();
```

**framework.Factory** :工厂抽象类，有下面的api
``` java
public abstract Product createProduct(String owner);

public abstract void registerProduct(Product p);

public final Product create(String owner) {
    Product p = createProduct(owner);
    registerProduct(p);
    return p;
}
```
`createProduct()`、`registerProduct()`为抽象方法，留给子类实现，`create()`被final修饰，自类不能重写，即创建对象的方式已经规定死了，这一点有[Template Method](https://github.com/Andrewpqc/design-patterns/tree/master/template-method/src)的意味。

**idcard.IDCard** :framework.Product的子类，实现了`use()`方法

**idcard.IDCardFactory** :framework.Factory类的子类，实现了`createProduct()`、`registerProduct()`方法

**Main** : 测试代码