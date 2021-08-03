package inheritance;

public class Calculator {

    public static void main(String[] args) {
      Multiplication multiplication = new Multiplication();
      multiplication.a=(25);
      multiplication.b=(20);
      multiplication.sub();
      multiplication.multi();

      multiplication.sub();
        System.out.println("Subtraction=> "+multiplication.c);

      multiplication.multi();
        System.out.println("Multiplication=> "+multiplication.c);
    }
}

class Addition{

    int a,b,c;

    public void add(){
        c=a+b;
    }
}

class Subtraction extends Addition{

    public void sub(){
        c=a-b;
    }
}

class Multiplication extends Subtraction{

    public void multi(){
        c=a*b;
    }
}
