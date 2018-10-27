### [Iterator](https://github.com/Andrewpqc/design-patterns/tree/master/builder/src) 
**Builder** :抽象基类，包含以下api:
``` java
public abstract void makeTitle(String title);
public abstract void makeStrng(String string);
public abstract void makeItems(String[] items);
public abstract void close();
```

**TextBuilder** :Builder类的基类，实现上面的4个接口，以Text的形式打印相关内容

**HTMLBuilder** :Builder类的另一个基类，以HTML格式打印相关内容

**Director** :监工类，用Builder类的接口描述`construct()`方法

**Main** :测试代码