将类的功能层次结构与类的实现层次结构分离

### [Bridge](https://github.com/Andrewpqc/design-patterns/tree/master/bridge/src) 
**Display** :一个具有展示功能的类，它将一个DisplayImpl类对象作为其私有成员(构造函数中传入),正是这个对象在整个程序中起了bridge的作业，然后以委托的方式将展示任务交给该对象

**DisplayImpl** :抽象基类
``` java
public abstract void rawOpen();
public abstract void rawPrint();
public abstract void rawClose();
```

**CountDisplay** :Display类的自类，它在Display的基础上添加了`void countDisplay(int count)`方法，用于展示指定的次数。CountDisplay与Display之间的这种类结构关系是**类的功能层次结构**.

**StringDisplayImpl** :DisplayImpl抽象类的子类，实现了相应的方法。StringDisplayImpl与DisplayImpl的类结构关系是**类的实现层次结构**

**Main** :测试代码