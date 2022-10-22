import java.util.PriorityQueue;

public class FirstAndLastPosition {
    static public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=firstOccur(nums, target);
        arr[1]=lastOccur(nums, target);
        return arr;
    }
    static int firstOccur(int nums[], int key){
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        int ans=-1;
        while(left<=right){
            if(nums[mid]==key){
                ans=mid;
                right=mid-1;
            }else if(key<nums[mid]){
                right=mid-1;
                
            }else if(key>nums[mid]){
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        return ans;
    }
    static int lastOccur(int nums[], int key){
        int left=0;
        int right=nums.length-1;
        int mid=(left+right)/2;
        int ans=-1;
        while(left<=right){
            if(nums[mid]==key){
                ans=mid;
                left=mid+1;
            }else if(key<nums[mid]){
                right=mid-1;
            }else if(key>nums[mid]){
               
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int a1[]=new int[]{5,7,7,8,8,10};
        int result[]=searchRange(a1, 8);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }


        

    }
}
