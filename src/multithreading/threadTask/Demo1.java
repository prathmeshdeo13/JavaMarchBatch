package multithreading.threadTask;

//Performing Single Task on Single Thread.
public class Demo1 extends Thread{
    public  void  run(){
        System.out.println("In Thread 1");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.start();
    }
}
