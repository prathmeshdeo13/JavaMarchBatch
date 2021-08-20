package polymorphism;

public class Overriding {
    public void show(){
        System.out.println("In show method1");
    }
}
class Xyz extends Overriding{
    public void show(){
        System.out.println("In show method2");
    }

    public static void main(String[] args) {
        Overriding o = new Overriding();
        o.show();

        Xyz x = new Xyz();
        x.show();
    }
}