public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {1,32,63,78,95,116,227,348,879};
//        int [] arr1 = {9,8,7,6,5,4,3,2,1};
        int target = 879;
        System.out.println(binarySearch(arr,target));

    }

    static int binarySearch(int []arr , int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        boolean isACS = arr[start]<arr[end];
        while (start<=end){
            mid = start + (end -start) /2;

            if(target==arr[mid]){
                return mid;
            }
            if(isACS){
                if(target<arr[mid]){
                    end = mid-1;

                }
                else {
                    start = mid+1;

                }
            }
            else {
                if(target>arr[mid]){
                    end = mid-1;

                }
                else {
                    start = mid+1;

                }

            }


        }
        return -1;
    }


}




