package exception_handling;

public class UnderAgeException1 {
    public static void main(String[] args) {

        int age = 25;
        try {
            if (age < 18) {
                throw new AgeException1("You cannot vote as you are under age");
            } else {
                System.out.println("You can vote");
            }

        } catch (AgeException1 e) {
            e.printStackTrace();
        }
    }
}

class AgeException1 extends RuntimeException{

    public AgeException1(String message) {
        super(message);
    }
}
