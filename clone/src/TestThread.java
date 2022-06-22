public class TestThread implements Runnable{
    @Override
    public void run() {
        Clone clone = new Clone("Hello World!");
        Clone clone2 = clone.clone();
        System.out.println(clone2.getStr());
    }
}
