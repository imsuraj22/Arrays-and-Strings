import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumNonAdjacentEle{
    /* MEMOIZATION
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        
		int n=nums.size();
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        return solution(n-1,nums,dp);
	}
    static int solution(int ind, ArrayList<Integer> nums,int dp[]){
        if(ind==0) return nums.get(ind);
        if(ind<0) return 0;

        if(dp[ind]!=-1) return dp[ind];

        int pick=nums.get(ind)+solution(ind-2, nums,dp);
        int pick2=0+solution(ind-1, nums,dp);

        return dp[ind]=Math.max(pick, pick2);
    }

    */
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        
		int n=nums.size();
        int dp[]=new int[n];
        dp[0]=nums.get(0);
        for(int i=1;i<n;i++){
            int pick=nums.get(i);
            if(i>1) pick+=dp[i-2];

            int pick2=0+dp[i-1];

            dp[i]=Math.max(pick, pick2);

        }

        return dp[n-1];
	}
    public static void main(String[] args) {
        int arr[]=new int[]{2 ,1, 4, 9};
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(9);

        System.out.println(maximumNonAdjacentSum(list));
        

        
    }
}