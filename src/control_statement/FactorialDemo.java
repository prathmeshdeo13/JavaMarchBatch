package control_statement;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the No: ");
        int no = scanner.nextInt();
        int fact = 1;
        for (int i=1;i<=no;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+no+ " is "+ fact);
    }
}
