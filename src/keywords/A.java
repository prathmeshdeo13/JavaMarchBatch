package keywords;

public class A {
    int i = 10;
}

class B extends A{
    int i = 20;
    public void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        B b = new B();
        b.show(30);

    }
}


//                       Difference between "this" && "super" keywords
//               this                                         super
//    * this keyword is reference variable            *   super keyword is reference variable
//      which refers to the current class                 which refers to the parent class of objects.
//      of objects.
