public class Main {
    public static void main(String[] args) {
        /**
         * 得到的两个实例其实是同一个实例,只调用了一次构造函数
         */
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
        /* singleton1,singleton2为两个引用，指向的是同一个实例对象 */
    }
}
