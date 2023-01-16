import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test2 {
        ArrayList<Integer> list;
        int val=0;
        int key=0;
    Queue<Integer> q=new LinkedList<>();
    public DataStream(int value, int k) {
        
         boolean consec(int val){
            if(list.size()==3){
                list.remove(list.get(0));
                list.add(num);
            }else{
                list.add(num);
            }
            if(list.size()<3) return false;
            if(list.size()==3){
                if(list.get(list.size()-1)==val && (list.get(list.size()-2)==val) && (list.get(list.size()-3)==val)) return true;
                else return false;
            }
            return false;
        }
       
    }
    
    public boolean consec(int num) {
        return consec(num);
    }
    public static void main(String[] args) {
        
    }
}
