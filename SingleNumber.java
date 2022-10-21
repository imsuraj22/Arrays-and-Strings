import java.util.HashMap;

public class SingleNumber {

    static public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int sum1=0,sum2=0;

       for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            sum1+=nums[i];
            map.put(nums[i], 1);
        }
        sum2+=nums[i];
       }

       return (int)(2 * (sum1) - sum2);

       
    }
    public static void main(String[] args) {
        int[] a = {7, 3, 5, 4, 5, 3, 4}; 
        
        System.out.println(singleNumber(a)); 
    }
}
