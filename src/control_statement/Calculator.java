package control_statement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        String yn;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the First no: ");
            int no1 = scanner.nextInt();
            System.out.println("Enter the Second no: ");
            int no2 = scanner.nextInt();
            System.out.println("Enter the symbol(+,-,*,/)");
            String sym = scanner.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Addition is: " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("Subtraction is: " + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("Multiplication is: " + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("Division is: " + res);
                    break;
                default:
                    System.out.println("Invalid Symbol");

                    System.out.println("Do you want to continue (Press Y for Yes and n for No)");

            }
            System.out.println("Do you want to continue (Press Y for Yes and n for No)");
            yn = scanner.next();
        } while (yn.equals("Y") || yn.equals("y"));

    }
}
