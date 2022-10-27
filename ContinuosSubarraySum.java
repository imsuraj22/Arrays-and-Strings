public class ContinuosSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        
        int sum=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if((nums[i]+nums[j])%k==0){
                    flag=true;

                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        
    }
}
