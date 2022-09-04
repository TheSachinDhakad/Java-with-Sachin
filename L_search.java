public class L_search {

        public static void main(String[] args) {
            int [] arr = {43,76,3,78,4,8,45,87,23,67};
//            System.out.println(linearSearch(arr , 78));
//            System.out.println(linearSearch2(arr , 78));
            System.out.println(linearSearch3(arr , 4));

        }

        static int linearSearch(int [] arr, int target){

            if(arr.length==0){
                return -1;
            }

            for (int index = 0; index < arr.length; index++) {
                int element;
                element = arr[index];
                if(element == target){
                    return index;
                }

            }
            return -1;

        }

    static int linearSearch2(int [] arr, int target){
//        int element;
        if(arr.length==0){
            return -1;
        }

        for (int element : arr) {

            if(element == target){
                return element;
            }

        }
        return Integer.MIN_VALUE;
//        return -1;

    }
    static Boolean linearSearch3(int [] arr , int target){
            if(arr.length==0){
                return false;

            }
            for(int element : arr){
                if(element==target){
                    return true;
                }
            }
            return false;
    }
    }


