import java.util.Arrays;

public class PartitionEqualToSum {
    /*MEMOIZATION 
    public static boolean canPartition(int[] arr, int n) {
        
		int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0) return false;
        else{
            int k=sum/2;
            int dp[][]=new int[n][k+1];
            for(int i=0;i<dp.length;i++){
                Arrays.fill(dp[i], -1);
            }
            return solution(n-1, arr, k, dp);
        }

	}

    static boolean solution(int ind, int arr[], int target,int dp[][]){
        if(target==0) return true;
        if(ind==0) return arr[0]==target;

        if(dp[ind][target]!=-1) return dp[ind][target]==0?false:true;

        boolean notTake=solution(ind-1, arr, target,dp);
        boolean take=false;
        if(arr[ind]<=target) take=solution(ind-1, arr, target-arr[ind],dp);

         dp[ind][target]= notTake || take?1:0;
         return notTake||take;
    }
    */

    public static boolean canPartition(int[] arr, int n) {
        
        
        
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2==1) return false;
        else{
            int k=sum/2;
            boolean prev[]=new boolean[k+1];
            
           prev[0]=true;
            if(arr[0]<=k) prev[arr[0]]=true;
            
            for(int i=1;i<n;i++){
                boolean curr[]=new boolean[k+1];
                 curr[0]=true;
                for(int target=1;target<=k;target++){
                   
                    boolean notTake=prev[target];
                    boolean take=false;
                    if(arr[i]<=target){
                        take=prev[target-arr[i]];
                    }
                    
                    curr[target]=notTake||take;
                }
                prev=curr;
            }
            return prev[k];
        }
    }

    public static void main(String[] args) {
        
    }
}
