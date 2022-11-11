import java.util.ArrayList;
import java.util.List;

public class OnlyOneSubsequence {
    static int sum=0;
    static ArrayList<Integer> list=new ArrayList<>();
    static boolean oneSubsequence(int i, int[] arr, int s){
        if(i==arr.length){
            if(sum==s){
                System.out.println(list);
                return true;
            }else{
                return false;
            }
        }

        sum+=arr[i];
        list.add(arr[i]);
        if(oneSubsequence(i+1, arr, s)){
            return true;
        }
        sum-=arr[i];
        list.remove(list.size()-1);
        if(oneSubsequence(i+1, arr, s)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,1};
        System.out.println(oneSubsequence(0, arr, 2));
    }
}
