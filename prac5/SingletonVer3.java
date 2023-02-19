package prac5;

public class SingletonVer3 {
    private static SingletonVer3 INSTANCE;
    String info;

    private SingletonVer3() {
        this.info = "I am third Singleton";
    }

    public static synchronized SingletonVer3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonVer3();
        }
        return INSTANCE;
    }

    public String returnInfo() {
        return info;
    }
}
