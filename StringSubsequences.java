import java.util.ArrayList;

public class StringSubsequences {
    public static ArrayList<Character> str=new ArrayList<>();
    static void subsequences(int index, String s) {
        if(index==s.length()){
            for(int i=0; i<str.size();i++){
                System.out.print(str.get(i));
               
            }
            System.out.println();
            return;
        }

        str.add(s.charAt(index));
        subsequences(index+1, s);
        str.remove(str.size()-1);
        subsequences(index+1, s);
    }
    
    public static void main(String[] args) {
        String str="312";
        subsequences(0, str);
        
    }
}
