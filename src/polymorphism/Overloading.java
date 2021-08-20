package polymorphism;

public class Overloading {

    public void show(String a){
        System.out.println("In Show method1");
    }

    public void show(int a){
        System.out.println("In show method2");
    }
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.show("Aditya");
        o.show(18);
    }
}
