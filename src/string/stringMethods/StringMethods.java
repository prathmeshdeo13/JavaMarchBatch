package string.stringMethods;

public class StringMethods {

    public static void main(String[] args) {
        String name = "patya";
        String address = "Pune";

        System.out.println(name.length());

        int i= name.length();
        if(i==0){
            System.out.println("String is empty");
        }else {
            System.out.println("valid name");
        }
    }
}
