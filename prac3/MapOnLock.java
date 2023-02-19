package prac3;

import java.util.List;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MapOnLock {
    private List<MapOnLockCore> entries;
    private static final Lock lock = new ReentrantLock();

    public MapOnLock() {
        if(entries == null) {
            entries = new LinkedList<>();
        }
    }

    public String getEntrie(int i) {
        return entries.get(i).MapReturn();
    }

    public int getCount() {
        return entries.size();
    }

    public void addEntry(MapOnLockCore entry) {
//        lock.lock();
        this.entries.add(entry);
//        lock.unlock();
    }

    public void removeEntry(MapOnLockCore entry) {
        lock.lock();
        this.entries.remove(entry);
        lock.unlock();
    }
}