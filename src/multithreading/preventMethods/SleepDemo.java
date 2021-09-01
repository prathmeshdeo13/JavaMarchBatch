package multithreading.preventMethods;

public class SleepDemo extends Thread{

    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        SleepDemo s = new SleepDemo();
        System.out.println(Thread.currentThread().getName());
        s.start();

    }
}

