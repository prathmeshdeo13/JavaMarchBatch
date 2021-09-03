package exception_handling;

public class CustomizeException {
    public static void main(String[] args) {
        int age = 15;

        try {
            if (age <= 18) {
                throw new AgeException("You cannot vote as your age is below 18");
            } else {
                System.out.println("You can vote");
            }
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}

