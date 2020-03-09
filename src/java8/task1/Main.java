package java8.task1;

public class Main {
    public static void main(String[] args) {
        startThreads(defineTasks());
    }

    /**
     * Defined some tasks as Runnable objects using lambda expressions.
     *
     * @return an array of Runnable tasks
     */
    static Runnable[] defineTasks() {
        Runnable task1 = () -> System.out.println("Doing task 1");
        Runnable task2 = () -> System.out.println("Doing task 2");
        Runnable task3 = () -> System.out.println("Doing task 3");
        return new Runnable[]{task1, task2, task3};
    }

    /**
     * Passes the tasks from task array to Thread constructors and tarts the threads.
     *
     * @param tasks represent an array of Runnable objects
     */
    static void startThreads(Runnable[] tasks) {
        Thread t1 = new Thread(tasks[0]);
        Thread t2 = new Thread(tasks[1]);
        Thread t3 = new Thread(tasks[2]);
        t1.start();
        t2.start();
        t3.start();
    }
}
