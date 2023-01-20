public class MiddleIndexInArray {
    static public int findMiddleIndex(int[] nums) {
        int leftsum=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(leftsum==sum-leftsum-nums[i]) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,7,3,6,5,6};
        System.out.println(findMiddleIndex(arr));

    }
}
