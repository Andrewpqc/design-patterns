### [Iterator](https://github.com/Andrewpqc/design-patterns/tree/master/iterator/src) 
**Aggregate** :集合接口，有下面的api
``` java
Iterator iterator()
```

**Iterator** :迭代器接口，有下面的api
``` java
abstract boolean hasNext();
abstract Item  next();
```

**BookShelfIterator** :具体的一个迭代器，实现了Iterator接口

**BookShelf** :书架，具体的一个集合,用于存放书，实现了Aggregate接口，即实现了`iterator()`方法，该方法返回一个BookShelfIterator实例

**Main** :测试代码