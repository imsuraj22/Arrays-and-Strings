import java.util.HashSet;

public class LongestNiceSubstring {

    public String longestNiceSubstring(String s) {
        if(s.length()<2) return "";
        
        HashSet<Character> set=new HashSet();
        for(int i=0; i<s.length();i++){
            set.add(s.charAt(i));
        }
        
        for(int i=0; i<s.length();i++){
            if(set.contains(s.charAt(i)-'a')==true && set.contains(s.charAt(i)-'A')==true){
                continue;
            }
            String prev= longestNiceSubstring(s.substring(0, i));
            String next=longestNiceSubstring(s.substring(i+1));
            
            return prev.length()>next.length()?prev:next;
        }
        return s;
    }
    public static void main(String[] args) {
        
    }
}
