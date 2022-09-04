public class max_value_find {
    public static void main(String[] args) {
        int [] arr = {34,54,21,7,56,8};

        System.out.println(max(arr,0,5));



    }
    static int max(int [] arr , int s , int e){
        if(s>e){
            return -1;
        }
        if(arr==null){
            return -1;

        }

        int maxVal = arr[s];
        for (int i = s; i <=e ; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }


        }
        return maxVal;

    }
}
