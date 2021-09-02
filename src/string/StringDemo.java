package string;

public class StringDemo {

    public static void main(String[] args) {
        char[] c = {'p', 'r', 'a', 't', 'h', 'm', 'e', 's', 'h'};
        String str = new String(c);
        System.out.println(str);


        String s1 = new String("Prathmesh");
        String s2 = new String("Sejal");
        s2.concat("love");
        s2= s2.concat("love");
        System.out.println(s2);
        System.out.println(s2.concat(s1));

        String s3 = new String("aditi");
        String s4 = new String("aditi");


        System.out.println(s3==s4);

        String s5 = "kiara";
        String s6 = "kiara";

        System.out.println(s5==s6);

        String s7 = new String("uravshi");
        String s8 = new String("uravshi");

        System.out.println(s7.equals(s8));

    }
}
