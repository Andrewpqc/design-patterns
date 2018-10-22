### [Adapter](https://github.com/Andrewpqc/design-patterns/tree/master/adapter/src) 
**Print** :Print接口，有下面的api
``` java
void printWeak(); //将一个字符串头尾添加"*",然后打印
void printStrong(); //讲一个字符串用小括号括起来并打印出来
```

**Banner** :具有和Print接口所描述的相同的功能的类，但是并没有实现Print接口。

**PrintAdapter1** :基于继承的适配器。继承了Banner类，实现了Print接口，使用继承得来的方法完成具体的打印工作。

**PrintAdapter2** :基于委托的适配器。实现了Print接口，将Banner类的一个对象作为自己的私有成员，然后将打印任务委托给该对象完成。

**Main** :测试代码