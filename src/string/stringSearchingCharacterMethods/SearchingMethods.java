package string.stringSearchingCharacterMethods;

public class SearchingMethods {
    public static void main(String[] args) {

        String str = "prathmesh";

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('m',5));       // returns integer value
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf('m'));             // returns integer value
        System.out.println(str.lastIndexOf('h',9));
        System.out.println(str.lastIndexOf('h',9));
        System.out.println(str.charAt(5));                      // returns char value
        System.out.println(str.contains("mesh"));               // returns boolean value
        System.out.println(str.startsWith("p"));                // returns boolean value
        System.out.println(str.endsWith("h"));                  // returns boolean value
    }
}
