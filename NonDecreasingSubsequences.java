import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NonDecreasingSubsequences {
    static HashSet<List<Integer>> set=new HashSet<>();
    static int arr[];
    static public List<List<Integer>> findSubsequences(int[] nums) {
        arr=nums;
        List<Integer> array=new ArrayList<>();
        recursion(array,0);

        List<List<Integer>> result=new ArrayList<>(set);
        return result;


    }

    static void recursion(List<Integer> arraylist, int index)
    {
        if(arraylist.size()>=2) set.add(new ArrayList<>(arraylist));

        for(int i=index;i<arr.length;i++){
            if(arraylist.size()==0 || arr[i]>=arraylist.get(arraylist.size()-1)){
                arraylist.add(arr[i]);
                recursion(arraylist, i+1);
                arraylist.remove(arraylist.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,5,7,7};
        System.out.println(findSubsequences(arr));

    }
}
