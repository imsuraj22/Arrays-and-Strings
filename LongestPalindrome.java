import java.security.KeyStore.Entry;
import java.util.HashMap;

public class LongestPalindrome {

    static public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int result=0;
         for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        

            
            boolean odd_num=false;

            for(Integer val : map.values()){
                if(val%2==0) result+=val;
                else{
                    odd_num=true;
                    result+=val-1;
                }
            }
            if(odd_num==true) result++;
                 return result;
        }
    
    public static void main(String[] args) {
        String arr="abccccdd";
        System.out.println(longestPalindrome(arr));
    }
}
