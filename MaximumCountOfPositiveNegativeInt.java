public class MaximumCountOfPositiveNegativeInt {
    public int maximumCount(int[] nums) {
     int maxPos=0;
     int maxNeg=0;
     
     for(int i=0;i<nums.length;i++){
        if(nums[i]<0) maxNeg++;
        if(nums[i]>0) maxPos++;
     }

    // if(maxNeg==maxPos) return 0;
     return Math.max(maxNeg, maxPos);
    }
    public static void main(String[] args) {
        
    }
}
