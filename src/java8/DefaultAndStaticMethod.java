package java8;

public class DefaultAndStaticMethod implements MyInterface1,MyInterface2 {
    public static void main(String[] args) {
    DefaultAndStaticMethod defaultAndStaticMethod = new DefaultAndStaticMethod();
        System.out.println(defaultAndStaticMethod.show());
        System.out.println(defaultAndStaticMethod.display());
        System.out.println(MyInterface1.send());

    }

    @Override
    public String show() {
        return "Bonjour";
    }

    @Override
    public String display() {
        return "Ciao";
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