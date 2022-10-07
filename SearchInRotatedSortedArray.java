public class SearchInRotatedSortedArray {
    
    static public int search(int[] nums, int target) {
            int n =nums.length;
            int left=0;
            int right=n-1;
            int mid;

            while(left<=right){
                mid=(left+right)/2;
                
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>=nums[left]){
                    if(target<=nums[mid] && target>=nums[left]){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }else{
                    if(target>=nums[mid] && target<=nums[right]){
                        left=mid+1;
                    }
                    else{
                        right=mid-1;
                    }
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        int num[]={4,5,6,7,0,1,2};
        int result=search(num, 0);
        System.out.println(result);
    }
}
 