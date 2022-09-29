public class StringSubsequences2 {

    static void subsequences(int index, String s,String newString){
        if(index==s.length()){
            System.out.println(newString);
            return;
        }

        char current=s.charAt(index);
        subsequences(index+1, s, newString+current);
        subsequences(index+1, s, newString);
    }
    public static void main(String[] args) {
        String str="312";
        subsequences(0, str, "");
        
    }
}
