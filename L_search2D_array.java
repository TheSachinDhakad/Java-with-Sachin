import java.util.Arrays;

public class L_search2D_array {
    public static void main(String[] args) {
        int [][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {12,18}
        };
//        int target = 99;
//        int []ans = Search(arr , target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));




//        for(int [] a :arr){
//            System.out.println(Arrays.toString(a));
//        }


    }
    static  int [] Search(int [][] arr , int target){
    for (int row = 0 ; row<arr.length ; row++){
        for(int col = 0 ; col <arr[row].length;col++){
            if(arr[row][col]==target){
                return new int[]{row , col};
            }
        }
    }
        return new int[]{-1,-1};
    }

    static int  max(int [][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] target : arr){
            for(int element : target ){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
}
