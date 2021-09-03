package java8;

public class DefaultAndStaticMethod implements MyInterface1,MyInterface2,MyInterface3 {
    public static void main(String[] args) {
    DefaultAndStaticMethod defaultAndStaticMethod = new DefaultAndStaticMethod();
        System.out.println(defaultAndStaticMethod.show());
        System.out.println(defaultAndStaticMethod.display());
        System.out.println(MyInterface1.send());
        System.out.println(defaultAndStaticMethod.add(5,1));
        System.out.println(defaultAndStaticMethod.msg());

    }

    @Override
    public String show() {
        return "Bonjour";
    }

    @Override
    public String display() {
        return "Ciao";
    }


    @Override
    public Integer add(int a, int b) {
        return (a+b);
    }
}

interface MyInterface1{
    String show();
    default String display(){
        return "Enchanter";
    }

    static String send(){
        return "In send method";
    }
}

interface MyInterface2{
    default String display(){
        return "custom implementation";
    }
}

interface MyInterface3{
    Integer add(int a, int b);
    default String msg(){
        return "In show method22";
    }
}