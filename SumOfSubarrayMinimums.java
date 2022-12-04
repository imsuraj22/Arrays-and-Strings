import java.util.PriorityQueue;

public class SumOfSubarrayMinimums {

    public int sumSubarrayMins(int[] arr) {

        int sum=0;

        for(int i=0;i<arr.length;i++){
            PriorityQueue<Integer> q=new PriorityQueue<>();
            for(int j=i;j<arr.length;j++){

               for(int k=i;k<=j;k++){
                q.add(arr[i]);
               }
               sum+=q.poll();
               q.clear();
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        
    }
}
