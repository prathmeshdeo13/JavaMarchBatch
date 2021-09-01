package string.caseTypeConversion;

import java.util.Locale;

public class CaseTypeConversionMethods {
    public static void main(String[] args) {

        //Case Conversion
        String s = "shekhar";
        System.out.println(s.toUpperCase(Locale.ROOT));

        String s1 = "MANISHA";
        System.out.println(s1.toLowerCase(Locale.ROOT));

        // Type Conversion.
        int a = 10 , b= 20;
        String s2 = String.valueOf(a);
        String s3 = String.valueOf(b);
        System.out.println(s2);
        System.out.println(a+b);
        System.out.println(s2+s3);

    }
}
