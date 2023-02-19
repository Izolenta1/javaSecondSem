package prac4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyExecuterService extends ThreadPoolExecutor implements ExecutorService {
    public MyExecuterService(int threadCount) {
        super(threadCount, threadCount * 2, 10, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(2));
    }
}