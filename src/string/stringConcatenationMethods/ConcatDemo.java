package string.stringConcatenationMethods;

public class ConcatDemo {
    public static void main(String[] args) {

        String s1 = "Aditi";
        String s2 = " python";

        s2 = s2.concat("java");
        System.out.println(s1.concat(s2));
//        System.out.println(s2.concat(s1));
    }
}