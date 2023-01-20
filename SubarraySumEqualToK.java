import java.util.HashMap;

public class SubarraySumEqualToK {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n==0)return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int currSum=0,count=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];

            if(currSum==k){
                count++;
            }
            if(map.containsKey(currSum-k)){
                count+=map.get(currSum-k);
            }
            map.put(currSum, map.getOrDefault(currSum, 0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
