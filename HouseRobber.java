import java.util.Arrays;

public class HouseRobber {

    

    public static long houseRobber(int[] valueInHouse) {
         
         
        int n=valueInHouse.length;
         if(n==1) return valueInHouse[0];
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        
        for(int i=0;i<n;i++){
            if(i!=0) arr1[i]=valueInHouse[i];
            if(i!=n-1) arr2[i]=valueInHouse[i];
        }

        
        long ans=solution(arr1);
         long ans1=solution(arr2);
         return Math.max(ans,ans1);
        
    }

    static long solution(int arr[]){
        int n=arr.length;
        int prev=arr[0];
        int prev2=0;
        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i>1) pick+=prev2;
            
            int nonPick=0+prev;
            
            int curr=Math.max(pick,nonPick);
            
            prev2=prev;
            prev=curr;
        }
        return prev;
        
    }	
    public static void main(String[] args) {
        int arr[]=new int[]{1 ,3 ,2 ,1};
        System.out.println(houseRobber(arr));
    }
}
