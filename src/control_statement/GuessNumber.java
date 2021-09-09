package control_statement;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int num;

        int guess;

        int trail = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the guess no :");
        num = (int) (Math.random() * 100);

        do{
            System.out.println("Enter the number: ");
            guess = scanner.nextInt();
            trail++;
                if(guess<num){
                    System.out.println("too low");
                }else if(guess>num){
                    System.out.println("too high");
                }else{
                    System.out.println("Guess is correct after trail " +trail);
                }
        }while (guess!=0);
    }
}
