package control_statement.arrays;

public class ArrayTraverseProgram {
    public static void main(String[] args) {

        //1D Arrays Dimensional program.
//        int[] a ={10,20,30};
//
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
//

        //2D Arrays Dimensional program.
//        int[][] a = {{10,20},{30,40,50}};
//
//        for(int i=0;i< a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j]  + " ");
//            }
//            System.out.println();
//        }

        //3D Arrays Dimensional program
        int[][][] a={{{10,20},{30,40,50},{60,70}},{{80,90,100},{110,120}}};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for (int k=0;k<a[i][j].length;k++){
                    System.out.print(a[i][j][k] + "");
                }
                System.out.println();
            }
        }

//        int [][] a ={{12,20},{45,85}};
//
//        for(int i=0;i< a.length;i++){
//            for(int j=0;j< a[i].length;j++){
//                System.out.print(a[i][j]+ " ");
//            }
//            System.out.println();
//        }

    }
}
