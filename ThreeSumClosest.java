import java.util.Arrays;

public class ThreeSumClosest{

    static public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int ans=0;

        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                if(first+nums[start]+nums[end]==target) return target;

                else if(Math.abs(first+nums[start]+nums[end]-target)<diff){
                    diff=Math.abs(first+nums[start]+nums[end]-target);
                    ans=first+nums[start]+nums[end];
                }
                if(first+nums[start]+nums[end]>target) end--;
                else start++;
            }


        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest(arr, 1));
    }
}