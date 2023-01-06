public class MinimumDiffrenceSubset {
    public static int minSubsetSumDifference(int[] arr, int n) {
		// Write your code here.
        int sum=0;
         int min=(int)Math.pow(10,9);
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        boolean dp[][]=new boolean[n][sum+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=sum) dp[0][arr[0]] = true;


        for(int i=1;i<n;i++){
            for(int target=1;target<=sum;target++){
                boolean notTake=dp[i-1][target];
                boolean take=false;
                if(arr[i]<=target) take=dp[i-1][target-arr[i]];

                dp[i][target]=notTake||take;
            }
        }

         for(int i=0;i<=sum/2;i++){
            if(dp[n-1][i]==true){
                int s1=i;
                int s2=sum-s1;
                min=Math.min(min, Math.abs(s1-s2));
            }
         }

        return min;
	}
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
        System.out.println(minSubsetSumDifference(arr, 4));
    }
}
