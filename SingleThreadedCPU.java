import java.util.Arrays;
import java.util.PriorityQueue;

class Task{
    int index;
    int arrival;
    int burst;

    Task(int index,int arrival,int burst){
        this.index=index;
        this.arrival=arrival;
        this.burst=burst;
    }
}
public class SingleThreadedCPU {

    static public int[] getOrder(int[][] tasks) {
        int n=tasks.length;
        int ans[]=new int[tasks.length];
        
        Task[] arr=new Task[n];
        for(int i=0;i<tasks.length;i++){
            
            arr[i]=new Task(i, tasks[i][0], tasks[i][1]);
            
        
    }

    Arrays.sort(arr,(a,b)->{
        return Integer.compare(a.arrival, b.arrival);
    });

        PriorityQueue<Task> q=new PriorityQueue<>((a,b) -> {
            if(a.burst ==b.burst){
                return Integer.compare(a.index, b.index);
            }
            return Integer.compare(a.burst, b.burst);
        });

        

        int curr=0;
        int taskInx=0;
        int ansInx=0;
        while(ansInx<n){
            if(taskInx<n && arr[taskInx].arrival<=curr){
                q.add(arr[taskInx++]);
            }
            if(q.isEmpty()){
                curr=arr[taskInx].arrival;
            }else{
                curr+=q.peek().burst;
                ans[ansInx++]=q.poll().index;
            }


        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[][]=new int[][]{
            {1,10},{1,1},{2,3},{3,2},{11,2},{2,15}
        };

        int ans[]=getOrder(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
