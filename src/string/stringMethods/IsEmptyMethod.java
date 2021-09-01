package string.stringMethods;

public class IsEmptyMethod {
    public static void main(String[] args) {
        String name = "aditya";
        String address = "nagpur";

        System.out.println(address.isEmpty());

        if(address.isEmpty()==true){
            System.out.println("String is empty");
        }else {
            System.out.println("valid address");
        }

        boolean b = address.isEmpty();
        if(b==true){
            System.out.println("String is empty");
        }else {
            System.out.println("valid address");
        }

        boolean c=address.isEmpty();
        if(c){
            System.out.println("address is empty");
        }else {
            System.out.println("valid address");
        }
    }
}
