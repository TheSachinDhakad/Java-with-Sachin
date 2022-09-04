import java.util.Arrays;

public class swap_reverse {
    public static void main(String[] args) {
        int [] arr = {34,23,6,3,67,6};
        System.out.println(Arrays.toString(arr));
//        swap(arr , 0 , 1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void reverse(int []arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
