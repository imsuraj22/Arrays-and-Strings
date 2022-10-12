public class LongestSubstringWithourRepChar {

    /*  BRUTE FORCE 
    static public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(checkRepetition(s,i,j)){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    static boolean checkRepetition(String s, int start, int end){
        int chars[]=new int[128];
        for(int i=start;i<=end;i++){
            char c=s.charAt(i);
            chars[c]++;
            if(chars[c]>1){
                return false;
            }
        }
        return true;
    }

    */

    //SLIDING WINDOW APPROACH

    static public int lengthOfLongestSubstring(String s) {
        
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            boolean visited[]=new boolean[256];
            for(int j=i;j<n;j++){
                
                if(visited[s.charAt(j)]==true){
                    break;
                }
                else{
                    res=Math.max(res, j-i+1);
                    visited[s.charAt(j)]=true;
                }
            }
            visited[s.charAt(i)]=false;
            
        }
        return res;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
