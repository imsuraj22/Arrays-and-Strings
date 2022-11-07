public class MaxSumInConfiguration {

    int max_sum(int nums[], int n)
    {
        int max=0;
        while(n>0){
            int ans=0;
            rotateByOne(nums, nums.length);
            for(int i=0;i<nums.length;i++){
                ans+=nums[i]*i;

                if(ans>max){
                    max=ans;
                }
            }

            n--;
        }
        return max;
    }

    void rotateByOne(int[] nums, int n){
        int temp=nums[n-1];
        for(int i=n-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
    }
    public static void main(String[] args) {
        
    }
}
