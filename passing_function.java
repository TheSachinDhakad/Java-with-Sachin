import java.util.Arrays;

public class passing_function {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static int change(int[] arr) {
        return arr[1] = 9;


    }

}
