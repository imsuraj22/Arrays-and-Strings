import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        HashMap<Integer,Integer>map=new HashMap();
        int ans=0;
        map.put(0, 1);
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-target)){
                ans+=map.get(sum-target);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);

        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
