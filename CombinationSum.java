import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0, candidates,target,ans,new ArrayList<>());
        return ans;
    }

    static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
                
            }
            return;
        }

        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind, arr, target-arr[ind], ans, ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(ind+1, arr, target, ans, ds);
    }

    public static void main(String[] args) {
        int arr[]=new int[]{2,3,6,7};
        int target=7;
        List<List<Integer>> ans=combinationSum(arr, target);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }
}
