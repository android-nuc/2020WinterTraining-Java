package code3_5;

public class Son extends Father {

    // 重写/覆写
    @Override
    public void eat() {
        System.out.println("儿子在吃饭");
    }

    // 重载
    public void eat(String food) {
        System.out.println("儿子在吃" + food);
    }
}
