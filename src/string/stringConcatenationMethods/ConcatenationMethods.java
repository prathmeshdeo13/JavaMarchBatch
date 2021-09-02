package string.stringConcatenationMethods;

public class ConcatenationMethods {
    public static void main(String[] args) {

        String s1 = "prathmesh";
        String s2 = " java";

        System.out.println(s1+s2);       //prathmesh java
        System.out.println(s1+10);       // prathmesh10
        System.out.println(s1+10+20);    //prathmesh1020
        System.out.println(10+s1+20);    // 10prathmesh20
        System.out.println(10+20+s1);    //30prathmesh
        System.out.println(s1+20/2);     //prathmesh10
        System.out.println(s1+10*20);    //prathmesh200
    }
}
