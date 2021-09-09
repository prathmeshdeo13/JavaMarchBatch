package exception_handling;

public class CustomException {
    public static void main(String[] args) {

        int age = 15;
        try{
            if(age<18){
                throw new UnderAgeException("You cannot vote as your age is not 18");
            }else {
                System.out.println("You can vote");
            }
        }catch (UnderAgeException u){
            u.printStackTrace();
        }

    }
}

class UnderAgeException extends Exception{

    public UnderAgeException(String message) {
        super(message);
    }
}
