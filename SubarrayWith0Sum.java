import java.util.HashMap;

public class SubarrayWith0Sum {

    static boolean findsum(int arr[],int n)
    {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0 || map.containsKey(sum) || arr[i]==0){
                return true;
            }else{
                map.put(sum, 1);
            }
        }
        return false;
        
        
        
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4 ,2, -3, 1, 6};
        System.out.println(findsum(arr, arr.length));
    }
}
