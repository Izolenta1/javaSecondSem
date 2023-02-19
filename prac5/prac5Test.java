package prac5;

public class prac5Test {
    public static void main(String[] args) {
        System.out.println(SingletonVer1.getInstance().returnInfo());
        System.out.println(SingletonVer2.getInstance().returnInfo());
        System.out.println(SingletonVer3.getInstance().returnInfo());
    }
}
