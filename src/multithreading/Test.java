package multithreading;

public class Test extends Thread {

    public void run(){
        System.out.println("In Thread method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();
    }
}
