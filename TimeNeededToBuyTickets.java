import java.util.PriorityQueue;
import java.util.Queue;

public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
       
        Queue<Integer> q=new PriorityQueue<>();
        int time=0;
        for(int i=0; i<tickets.length; i++){
            q.add(i);
        } 
        while(!q.isEmpty()){
            ++time;
            int temp=q.peek();
            q.poll();

            if(tickets[temp]>=1){
                tickets[temp]-=1;
            }
            if(temp!=k && tickets[temp]==0){
                continue;
            }
            if(temp==k && tickets[temp]==0){
                break;
            }
            q.add(temp);
        }
        return time;
    }
    
    public static void main(String[] args) {
        TimeNeededToBuyTickets t=new TimeNeededToBuyTickets();
        int ticket[] =new int[]{2,3,2};
        System.out.println(t.timeRequiredToBuy(ticket, 2));
        
    }
}
