package SingletonPattern;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("Created singleton");
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public void doSomething() {
        System.out.println("Do Something");
    }
}
