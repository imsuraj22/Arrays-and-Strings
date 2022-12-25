import java.util.HashSet;

public class CaptureForts{
    public int captureForts(int[] forts) {
        class Solution {
    public int captureForts(int[] forts) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<forts.length;i++){
            set.add(forts[i]);
        }
        if(!set.contains(1)) return 0;
        boolean flag=false;
        int curr=0;
        int max=0;
        for(int i=0;i<forts.length;i++){
            if(forts[i]==1 || forts[i]==-1){
                flag=true;
            }
            if(flag){
                
                if(forts[i]==0){
                    curr+=1;
                }
                
                if( forts[i]==1){
                    max=Math.max(max,curr);
                    curr=0;
                }
            }
        }
        return max;
    }
}
    }
    public static void main(String[] args) {
        
    }
}