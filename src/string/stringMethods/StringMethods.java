package string.stringMethods;

public class StringMethods {

    public static void main(String[] args) {
        String name = "patya";
        String address = "pune";

        System.out.println(name.length());
        System.out.println(address.length());

        int i= name.length();
        if(i==0){
            System.out.println("name is empty");
        }else {
            System.out.println("valid name");
        }

        if(address.length()==0){
            System.out.println("address is empty");
        }else {
            System.out.println("valid address");
        }
    }
}
