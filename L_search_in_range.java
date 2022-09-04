public class L_search_in_range {
    public static void main(String[] args) {
        int [] arr = {43,76,3,78,4,8,45,87,23,67};
        System.out.println(linearSearch(arr , 2,7,8));
    }

    static int linearSearch(int [] arr , int s , int e , int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = s ; index<e ; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
