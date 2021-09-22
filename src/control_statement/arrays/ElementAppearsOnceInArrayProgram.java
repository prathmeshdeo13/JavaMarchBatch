package control_statement.arrays;

public class ElementAppearsOnceInArrayProgram {
    public static void main(String[] args) {

        int[] a = {5,3,5,4,3,2,4};

        int res = a[0];
        for(int i=1;i<a.length;i++){
            res = res ^ a[i];
        }
        System.out.println("Single element present in array is: "+res);
    }
}
