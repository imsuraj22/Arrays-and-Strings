import java.util.PriorityQueue;

public class FindMinimumInSortedArray {

    static public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
       
        while(l<r){
            
            int mid=(l+r)/2;
            if(mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[l]<=nums[mid] && nums[mid]>nums[r]){
                l=mid+1;
            }else{
             r=mid-1;
            }
        }
        return nums[l];
    }

    public static void main(String[] args) {
        int arr[]=new int[]{4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
}
