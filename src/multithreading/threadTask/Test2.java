package multithreading.threadTask;

//Performing multiple task on multiple thread.
class MyThread extends Thread{
    public void run(){
        System.out.println("In Thread 1");
    }
}

class MyThread1 extends Thread{
    public void run(){
        System.out.println("In Thread 2");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("In Thread 3");
    }
}

class MyThread3 extends Thread {
    public void run() {
        System.out.println("In Thread 4");
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        MyThread3 myThread3 = new MyThread3();
        myThread3.start();
    }
}
