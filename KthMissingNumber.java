import java.util.HashSet;

public class KthMissingNumber {

    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
            int j=1;
            while(k>0){
                if(!set.contains(j)){
                    k--;
                }
                j++;
            }
        return j;
    }
    public static void main(String[] args) {
        
    }
}
