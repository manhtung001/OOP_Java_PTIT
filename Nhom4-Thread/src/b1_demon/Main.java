package b1_demon;

public class Main {
    public static void main(String[] args) {
        CucCu t1 = new CucCu();
        Dog t2 = new Dog();
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
