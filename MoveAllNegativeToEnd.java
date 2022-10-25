import java.util.ArrayList;

public class MoveAllNegativeToEnd {
    public void segregateElements(int arr[], int n)
    {
        int low=0,high=arr.length-1;
        while(arr[high]<0 && high>low){
            high--;
        }
        while(low<high){
            if(arr[low]<0){
                int temp=arr[high];
                arr[high]=arr[low];
                arr[low]=temp;

                high--;
            }
            low++;
        }
        
    }
    public static void main(String[] args) {
        
    }
}
