package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
       C c = new C();
       c.a();
       c.c();
    }
}

class A{

    public void a(){
        System.out.println("In method A");
    }

}

class B extends A{

    public void b(){
        System.out.println("In method B");
    }
}

class C extends A{

    public void c(){
        System.out.println("In method C");
    }
}