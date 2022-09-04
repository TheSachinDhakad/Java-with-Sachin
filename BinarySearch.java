public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,32,63,78,95,116,227,348,879};
        int target = 95;
        System.out.println(binarySearch(arr,target));

    }

    static int binarySearch(int []arr , int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while (start<=end){
            mid = start + (end -start) /2;

            if(target==arr[mid]){
                return mid;
            } else if (target<arr[mid]) {
                end = mid-1;


            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }


}
