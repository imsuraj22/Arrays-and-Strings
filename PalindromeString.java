public class PalindromeString {
    boolean ispalindrome(String s){

        String reverse="";
        int length=s.length();

        for(int i=length-1; i>=0;i--){
            reverse+=s.charAt(i);
        }
        if(s.equals(reverse)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        PalindromeString p=new PalindromeString();
        System.out.println(p.ispalindrome("aba"));
        
    }
}
