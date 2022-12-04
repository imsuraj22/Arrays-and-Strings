import java.util.HashMap;

public class ArithmaticSlices2{

    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        HashMap<Long,Long> map=new HashMap<>();
        long ans=0;
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                long diff=(long)nums[i]-(long)nums[j];

                ans+=map.get(j);
                map.put(i, diff)+=map.get
            }
        }
    }
    public static void main(String[] args) {
        
    }
}