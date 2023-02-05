package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = {{1,2,3},{4,5,6},{7,8,9} };

        //3 dimensional array contains 2 dimensional arrays (N-1 formulü)

        int[][][] arr3D = {{{1,2,3},{4,5,6},{7,8,9} } , {{10,20,30},{40,50,60},{70,80,90} }};

        System.out.println(Arrays.deepToString(arr3D));
        //[[[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[10, 20, 30], [40, 50, 60], [70, 80, 90]]]
        System.out.println(Arrays.deepToString(arr3D[1]));
        //[[10, 20, 30], [40, 50, 60], [70, 80, 90]]

        System.out.println(Arrays.toString(arr3D[1][1]));
        //[40, 50, 60]

        System.out.println(arr3D[0][2][2]);
        //9

        for(int[][] each2D : arr3D){
            for(int[] each1D: each2D){
                for (int element : each1D){
                    System.out.println(element);
                }
            }
        }

        System.out.println("------------------------------------------------------");

        int[][][][] arr4D = {{{{1,2,3},{4,5,6},{7,8,9} } , {{10,20,30},{40,50,60},{70,80,90} }}};//burada 4 boyutlu array içerisine 1 tane 3 boyutlu array yerleştirdik bu yüzden bu ifadenin indeks numarası 0 dır

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }

    }

}
