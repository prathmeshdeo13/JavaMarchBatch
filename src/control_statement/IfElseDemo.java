package control_statement;

public class IfElseDemo {
    public static void main(String[] args) {

        int i, j, k, l;
        i = 1020;
        j = 950;
        k = 550;
        l = 250;

        if (i > j && i > k && i > l) {
            System.out.println("I is the biggest number");
        } else if (j > k && j > l) {
            System.out.println("J is the biggest number");
        } else if (k > l) {
            System.out.println("K is the biggest number");
        } else {
            System.out.println("L is the biggest number");
        }

        //Single condition
        int a = -5;
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a == 0) {
            System.out.println("Number is 0");
        } else {
            System.out.println("Number is negative");
        }

        //multiple conditions...
        int age = 17;
        String nationality = "American";
        if (age > 18) {
            if (nationality == "Indian") {
                System.out.println("you can vote");
            } else {
                System.out.println("Not indian");
            }
        } else {
            System.out.println("you cannot vote");
        }


        if (i % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }
}
