package multithreading.preventMethods;

public class YieldDemo extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }

    public static void main(String[] args) {
        YieldDemo y = new YieldDemo();
        y.start();

        Thread.yield();
        for (int i=1;i<=5;i++){
            System.out.println("main thread"+"-"+i);
        }
    }
}
