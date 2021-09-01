package string.stringMethods;

public class TrimMethod {

    public static void main(String[] args) {
        String name ="akshay hiwale";
        String address = "buldhana";
        char[] c= {12334};
        String pass = new String(c);

//        System.out.println(name);
        System.out.println(name.trim());

        if(name.trim().length()==0){
            System.out.println("string is empty");
        }else {
            System.out.println("valid name");
        }


        if (name.trim().length()==0 || name.trim().isEmpty()){
            System.out.println("name cannot empty");
        }else if (address.trim().length()==0 || address.trim().isEmpty()){
            System.out.println("address cannot empty");
        }else if (pass.trim().isEmpty()){
            System.out.println("password cannot empty");
        }else {
            System.out.println("valid....!");
        }
    }
}
