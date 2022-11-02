import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);   
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int current=nums[i];
                int currentcount=1;

                while(set.contains(current+1)){
                    current+=1;
                    currentcount+=1;
                }
                max=Math.min(max, currentcount);
            }
        }
        return max;
    } 

    public static void main(String[] args) {
        
    }
}
