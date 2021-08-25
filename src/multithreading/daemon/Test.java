package multithreading.daemon;

public class Test extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println("Child Thread");
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        Test test = new Test();
        test.setDaemon(true);
        test.start();
    }
}
