package multithreading;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("In Runnable Method");
    }

    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r);
        t.start();
    }
}
