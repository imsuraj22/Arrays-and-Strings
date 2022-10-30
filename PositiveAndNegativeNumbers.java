import java.util.LinkedList;
import java.util.Queue;

public class PositiveAndNegativeNumbers {

    void rearrange(int arr[], int n) {
        
        Queue<Integer>positive =new LinkedList<>();
        Queue<Integer> negative=new LinkedList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                positive.add(arr[i]);
            }else{
                negative.add(arr[i]);
            }
        }

        int i=0;
        while(positive.size()!=0 && negative.size()!=0){
            if(i%2==0){
                arr[i]=positive.poll();
            }else{
                arr[i]=negative.poll();
            }
            i++;
        }
         

        if(negative.size()==0){
            for(int j=i;j<arr.length;j++){
                arr[j]=positive.poll();
            }
        }else{
            for(int k=i;k<arr.length;k++){
                arr[k]=negative.poll();
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
