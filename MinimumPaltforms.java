import java.util.Arrays;

public class MinimumPaltforms {

    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plat_needed=1,max=1;

        int i=1,j=0;

        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat_needed++;
                i++;
            }else if(arr[i]>dep[j]){
                plat_needed--;
                j++;
            }

            if(plat_needed>max){
                max=plat_needed;
            }
            
        }
        return max;
    } 
    public static void main(String[] args) {
        
    }
}
