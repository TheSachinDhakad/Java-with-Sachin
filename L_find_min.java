public class L_find_min {
    public static void main(String[] args) {
        int [] arr = {43,76,3,78,4,8,45,87,-23,67};
        System.out.println(minVal(arr));
    }

    static int  minVal(int [] arr){
        int  ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }

        }
        return ans;

    }
}
