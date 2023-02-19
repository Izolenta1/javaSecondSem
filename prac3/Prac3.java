package prac3;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;

public class Prac3 {
    public static void main(String[] args) throws Exception {
        MapOnLock myMap = new MapOnLock();
        myMap.addEntry(new MapOnLockCore(123, "123"));
        myMap.addEntry(new MapOnLockCore(101, "154"));
        myMap.addEntry(new MapOnLockCore(333, "657"));

        Thread one = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                myMap.addEntry(new MapOnLockCore(123, "123"));
                myMap.addEntry(new MapOnLockCore(101, "154"));;
            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                myMap.addEntry(new MapOnLockCore(101, "154"));
                myMap.addEntry(new MapOnLockCore(333, "657"));
            }
        });
        one.start();
        two.start();
        Thread.sleep(2000);

        System.out.println(myMap.getCount());

        SetOnSemaphore mySet = new SetOnSemaphore();
        mySet.addValue(124);
        mySet.addValue(154);
        mySet.addValue(134);

        Thread three = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                mySet.addValue(i);
                mySet.addValue(10000 - i);
            }
        });
        Thread four = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                mySet.addValue(i);
                mySet.addValue(20000 - i);
            }
        });
        three.start();
        four.start();
        Thread.sleep(2000);

        System.out.println(mySet.getSize());

    }
}
