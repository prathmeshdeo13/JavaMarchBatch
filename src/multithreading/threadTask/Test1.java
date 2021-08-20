package multithreading.threadTask;


//Performing Single task on multiple thread
public class Test1 extends Thread{

    public void run(){
        System.out.println("Single task Thread");
    }

    public static void main(String[] args) {
        Test1 thread1 = new Test1();
        thread1.start();

        Test1 thread2 = new Test1();
        thread2.start();

        Test1 thread3 = new Test1();
        thread3.start();

        Test1 thread4 = new Test1();
        thread4.start();
    }
}
