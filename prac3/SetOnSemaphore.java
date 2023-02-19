package prac3;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.Semaphore;

public class SetOnSemaphore {
    private List<Integer> entries;
    private static final Semaphore semaphore = new Semaphore(1);

    public SetOnSemaphore() {
        entries = new ArrayList<>();
    }

    public void addValue(int value) {
        try {
            semaphore.acquire();
            entries.add(value);
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getSize() {
        return entries.size();
    }
}
