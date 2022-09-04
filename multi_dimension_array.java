import java.util.Arrays;
import java.util.Scanner;

public class multi_dimension_array {
    public static void main(String[] args) {

        /*
        1 2 3
        4 5 6
        7 8 9
        */

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of row and collums : ");
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] arr = new int[r][c];
        /*int [][] arr = {
                {1,2,3},
                {5,6},
                {6,7,8,9}
        };
//        System.out.print(arr[0][1]);
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0 ; col<arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }
        */


        /// input
        for (int row = 0; row < arr.length; row++) {
            System.out.println("Enter the row and collums  elements " + row + "th index : ");
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = in.nextInt();
            }


        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//
//
//        }
//
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
