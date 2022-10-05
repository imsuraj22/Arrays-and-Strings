import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesInString {
    public String removeDuplicateLetters(String s) {
        String str;
        
        int len=s.length();
        HashSet<Character> set=new HashSet<>();
        for(int i=0; i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        char[] arr=new char[set.size()];
        Iterator itr = set.iterator();
        int i=0;
        while (itr.hasNext()) {
            arr[i]=(char)itr.next();
            i++;
        }
        Arrays.sort(arr);
        str=new String(arr);
        return str;
        
    }
    public static void main(String[] args) {
        
    }
}
