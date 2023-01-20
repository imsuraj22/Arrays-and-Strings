public class MidlleOfArr {
    static public int findMiddleIndex(int[] nums) {
     int sum=0,leftSum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }   

     for(int i=0;i<nums.length;i++){
        if(leftSum==sum-leftSum-nums[i]) return i;
        leftSum+=nums[i];
     }

     return -1;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,7,3,6,5,6};
        System.out.println(findMiddleIndex(arr));
    }
}
