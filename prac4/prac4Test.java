package prac4;

import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.List;

public class prac4Test {
    public static void main(String[] args) throws Exception {
        MyExecuterService executerService = new MyExecuterService(3);
        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Поток: " + Thread.currentThread().getName();
        };

        List<Callable<String>> taskList = new LinkedList<>();
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);

        List<Future<String>> futureList = executerService.invokeAll(taskList);
        for (var i : futureList) {
            System.out.println(i.get());
        }

        executerService.shutdown();
    }
}
