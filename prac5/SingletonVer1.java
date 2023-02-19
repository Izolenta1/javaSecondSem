package prac5;

public class SingletonVer1 {
    private static final SingletonVer1 INSTANCE = new SingletonVer1();
    String info;

    private SingletonVer1() {
        this.info = "I am first Singleton";
    }

    public static SingletonVer1 getInstance() {
        return INSTANCE;
    }

    public String returnInfo() {
        return info;
    }
}