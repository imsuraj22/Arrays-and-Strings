import java.util.ArrayList;

public class NoOFSubArrayWithSumK {
    static int sum=0;
    static int noOfSubarrays(int i,int[] arr, int s){
        if(i==arr.length){
            if(sum==s){
                return 1;
            }else{
                return 0;
            }
        }

        sum+=arr[i];
        int l=noOfSubarrays(i+1, arr, s);
        sum-=arr[i];
        int r=noOfSubarrays(i+1, arr, s);

        return l+r;
    }
    
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,1};
        
        System.out.println(noOfSubarrays(0, arr, 2));
        
        
       
        
    }
}
    

