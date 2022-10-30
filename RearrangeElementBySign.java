public class RearrangeElementBySign {

    static public int[] rearrangeArray(int[] nums) {

        int even=0,odd=1;
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                ans[even]=nums[i];
                even+=2;
            }else{
                ans[odd]=nums[i];
                odd+=2;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,1,-2,-5,2,-4};
        int result[]=rearrangeArray(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
