import java.util.LinkedList;
import java.util.Queue;

public class ClumsyFactorial {

    public int clumsy(int n) {
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=n;i>0;i--){
            q.add(i);
        }

        int result=0;
        while(!q.isEmpty()){
            result=q.poll()*q.poll()/q.poll()+q.poll()
        }
    }
    public static void main(String[] args) {
        
    }
}
