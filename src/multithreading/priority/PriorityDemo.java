package multithreading.priority;

public class PriorityDemo extends Thread{

    public void run(){
        Thread.currentThread().setPriority(MIN_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        PriorityDemo p = new PriorityDemo();
        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        p.start();
    }
}
