import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestPalindromeConcat {

    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();

        int ans=0;
        int unpair=0;

        for(int i=0;i<words.length;i++){
            if(!map.containsKey(words[i])) map.put(words[i], 0);

            if(words[i].charAt(0)==words[i].charAt(1)){
                if(unpair>0){
                    unpair--;
                    map.put(words[i],map.get(words[i])-1);
                    ans+=4;

                }else{
                    map.put(words[i], map.get(words[i])+1);
                    unpair++;
                }
            }else{
                String rev=words[i].toCharArray().toString().charAt(1)
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
