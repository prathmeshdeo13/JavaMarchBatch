package string.comparsionMethods;

public class EqualsMethod {

    public static void main(String[] args) {
        String s1 = "kiara";
        String s2 ="kiara";

        System.out.println(s1.equals(s2));

        String s4 = "rucha";
        String s5 = "Rucha";

        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));


        //Validations
        String name ="aditya";
        String password = "aditya123";

        if(name.equals("")){
            System.out.println("Enter the name");
        }else if(password.equals("")){
            System.out.println("Enter the password");
        }else {
            System.out.println("valid....!");
        }
    }


}
