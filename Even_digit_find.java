public class Even_digit_find {
    public static void main(String[] args) {
        int [] arr = {12,345,6,7890};
        System.out.println(findNumbers(arr));

        System.out.println(digit(-90890));
    }

    static int findNumbers(int [] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static Boolean even(int num){
        int numOfDigit =digit(num);
        /*
        if(numOfDigit %2 ==0){
        return true;
        }
        * */
        return numOfDigit%2==0;
    }
    static int digit(int num){
        if(num<0){
             num = num * -1 ;
        }
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
    }

    static int digit1(int num){
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;

    }



}
