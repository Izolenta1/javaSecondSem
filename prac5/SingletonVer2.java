package prac5;

public class SingletonVer2 {
    private static SingletonVer2 INSTANCE;
    String info;

    private SingletonVer2() {
        this.info = "I am second Singleton";
    }

    public static SingletonVer2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonVer2();
        }
        return INSTANCE;
    }

    public String returnInfo() {
        return info;
    }
}
