import java.util.HashMap;
import java.util.HashSet;

import javax.print.FlavorException;

public class UniqueNoOfOccurance {

    static public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        
        for(int i:map.keySet()){
            if(!set.add(map.get(i))){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
