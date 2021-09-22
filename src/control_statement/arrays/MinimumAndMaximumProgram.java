package control_statement.arrays;

public class MinimumAndMaximumProgram {
    public static void main(String[] args) {

//        int[] a={4,2,5,8,1,9,6};
//
//        int max=a[0];
//        for(int i=1;i<a.length;i++) {
//
//            if (max < a[i])
//            {
//                max = a[i];
//            }
//        }
//        System.out.println("Maximum element is: "+max);
//

        int[] a={4,2,5,8,1,9,6};

        int min=a[0];

        for(int i=1;i<a.length;i++){

            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Minimum element value is: "+min);
    }

}
