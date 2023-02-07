
import java.util.TreeMap;
import java.util.*;

public class FruitIntoBasket {
    static public int totalFruit(int[] fruits) {
        if(fruits.length==0) return 0;
        int res=0,i=0;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j], map.getOrDefault(fruits[j], 0)+1);

            if(map.size()>2){
                map.put(fruits[i], map.get(fruits[i])-1);
                if(map.get(fruits[i])==0) map.remove(fruits[i]);
                i++;
            }
            res=Math.max(res, j-i+1);
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(arr));
    }
}
