package control_statement;

public class LeapYearProgram {
    public static void main(String[] args) {

        int year=2020;
        if((year%400==0) || (year%4==0) && (year%100!=0)){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap year");
        }
    }
}
