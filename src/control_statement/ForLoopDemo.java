package control_statement;

public class ForLoopDemo {

    public static void main(String[] args) {


//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }
//
//        for(int i=10;i>=0;i--) {
//            System.out.println(i);
//        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }



        //Multiplication table program
        int t=5;

        for(int i=1;i<=10;i++){
            System.out.println(t + "*" + i + "=" + t*i);
        }


        int no=37;
        if(no%2==0){
            System.out.println("Even Number : "+no);
        }else {
            System.out.println("Odd Number: "+no);
        }
    }
}
