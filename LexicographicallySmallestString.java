import java.util.HashMap;
import java.util.Iterator;

public class LexicographicallySmallestString {
    static public String smallestEquivalentString(String s1, String s2, String baseStr) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>s2.charAt(i)){
                if(map.containsKey(s1.charAt(i))){
                    map.put(map.get(s1.charAt(i)), s2.charAt(i));
                }
                else map.put(s1.charAt(i), s2.charAt(i));
            }else{
                if(map.containsKey(s2.charAt(i))){
                    map.put(map.get(s2.charAt(i)), s1.charAt(i));
                }
                map.put(s2.charAt(i), s1.charAt(i));
            }

            map.entrySet().stream().forEach(
                input
                -> System.out.println(input.getKey() + " : "
                                      + input.getValue()));

            
        }   
        return "abc"; 
    }

    public static void main(String[] args) {
        String s1="parker";
        String s2="morris";
        String base="parser";
        smallestEquivalentString(s1, s2, base);
    }
}
