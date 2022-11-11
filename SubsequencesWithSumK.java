import java.util.ArrayList;

public class SubsequencesWithSumK {
    static ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
    
    
    static int sum=0;
    static int total=0;
    static void subSequencesK(int i, int[] arr, int s, ArrayList<Integer> list){
        if(i==arr.length){
            
            if(s==sum){
                total+=1;
                al.add(list);
                System.out.println(list);
            }
            return;
        }

        list.add(arr[i]);
        sum+=arr[i];
        subSequencesK(i+1, arr, s,list);
        list.remove(list.size()-1);
        sum-=arr[i];
        subSequencesK(i+1, arr, s,list);
         
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,1};
         ArrayList<Integer> list=new ArrayList<>();
        subSequencesK(0, arr, 2,list);
        
        
        System.out.println();
        System.out.println(total);
        

    }
}
