public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeStrng("白天");
        builder.makeItems(new String[]{"早上好", "中午好", "下午好"});
        builder.makeStrng("黑夜");
        builder.makeItems(new String[]{"傍晚好","晚安"});
        builder.close();
    }
}
