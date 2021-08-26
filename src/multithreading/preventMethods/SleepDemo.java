package multithreading.preventMethods;

public class SleepDemo extends Thread{

    public void run(){
        for(int i=1;i<=10;i++){
            try {
                Thread.sleep(3000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        SleepDemo s = new SleepDemo();
        s.start();

    }
}

