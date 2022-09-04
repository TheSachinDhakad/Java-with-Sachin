public class L_maxWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {2,31,1},
                {4,5,4}
        };
        System.out.println(maxVal(arr));

    }
    static int maxVal(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int [] ints : accounts)

        {
            int sum =0;
            for (int anInt : ints){
                sum +=  anInt;

            }
            if(sum>ans){
                ans=sum;
            }

        }
        return ans;
    }
}
