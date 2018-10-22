### [Template Method](https://github.com/Andrewpqc/design-patterns/tree/master/template-method/src) 
**在父类中定义处理流程框架，在子类中实现具体处理。**

**AbstractDisplay** :抽象基类，定义了下面的api
``` java
public abstract void open();
public abstract void print();
public abstract void close();
public final void display();
```
其中`open()`, `print()`, `close()`为抽象方法，在父类中未给出实现。`display()`方法被`final`修饰，表明在子类中不能被重写，`display()`在父类中已经定义好了,即先调用`open()`一次，然后调用`print()`五次，最后调用`close()`一次

**CharDisplay** :AbstractedDisplay的子类，需要实现`open()`, `print()`, `close()`.

**StringDisplay** :AbstractedDisplay的另一个子类

**Main** :测试代码