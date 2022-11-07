import java.util.Arrays;

import javafx.scene.paint.Stop;

public class OrderlyQueue{

    public String orderlyQueue(String s, int k) {
       if(k==1){
        int n=s.length();
        String doubles=s+s;
        String ans=s;
        for(int i=1;i<n;i++){
            String str=doubles.ssubs
            int res=str.compareTo(ans);
            if(res<0){
                ans=str;
            }
        }
        return ans;
       }

       char[] ch=s.toCharArray();
       Arrays.sort(ch);
       return new String(ch);
        
    }
    public static void main(String[] args) {
        
    }
}