import java.util.Arrays;

public class L_Search_In_string {
    public static void main(String[] args) {
        String name = "sachin";
        char target = 'c';
        System.out.println(Search(name , target));
        System.out.println(Search3(name , target));


//        System.out.println(Search1(name , target));
//        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static Boolean Search(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static char Search1(String str , char target){
        if(str.length()==0){
            System.out.println("element not found ");
        }
        for(char ch : str.toCharArray()){
//
            if(ch==target){
                return target;
            }
        }
        return 'n';
    }

    static Boolean Search3(String str , char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }



}
