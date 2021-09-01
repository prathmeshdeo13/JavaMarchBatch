package string.comparsionMethods;

public class CompareToMethods {
    public static void main(String[] args) {
        String s1 = "a";  //97 (ASCII value or decimal value)
        String s2 = "A";  // 65 (ASCII value or decimal value)

        System.out.println(s1.compareTo(s2)); //32

        String s3 = "Ab";
        String s4 = "aB";

        System.out.println(s3.compareTo(s4)); //-32


        String s5 = "AB";
        String s6 = "aB";

        System.out.println(s5.compareToIgnoreCase(s6));  //0
    }
}

//compareTo: compare two string into lexographically.
// 0 =>s1=s2
// + => s1>s2
// - => s1<s2