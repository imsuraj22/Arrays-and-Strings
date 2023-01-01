import java.util.HashMap;

public class WordPattern {
    static public boolean wordPattern(String pattern, String s) {

        String str[] = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String,Boolean> used=new HashMap<>();

        for (int i = 0; i < str.length; i++) {
           char curr=pattern.charAt(i);
           String currStr=str[i];
           
           if(map.containsKey(curr)==false){
                if(used.containsKey(str[i])==true) return false;
                else{
                    used.put(str[i], true);
                    map.put(curr, str[i]);
                }
           }else{
            String mw=map.get(curr);
            if(!mw.equals(currStr)) return false;
           }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern = "abba";
        System.out.println(wordPattern(pattern, s));
    }
}