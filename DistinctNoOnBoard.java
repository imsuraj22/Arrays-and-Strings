import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class DistinctNoOnBoard{

    public int distinctIntegers(int n) {
        int max=(int)Math.pow(10, 9);
        int count=1;
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        q.add(n);
        set.add(n);
        
        int j=0;
        while(j<=max){
            if(q.isEmpty()){
                break;
            }
            int ele=q.poll();
            for(int i=1;i<=ele;i++){
                if(ele%i==1 &&(set.contains(ele)==false || set.contains(i)==false)){
                    q.add(i);
                    count++;
                }
            }

            j++;
        }

        return count;
        
    }
    public static void main(String[] args) {
        
    }
}