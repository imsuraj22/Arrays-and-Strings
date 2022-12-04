public class AlikeHAlves {

    static public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count=0;
        int count1=0;

        for(int i=0;i<(n/2);i++){
            if(vowels(s.charAt(i))) count++;
        }
        
        for(int i=n/2;i<n;i++){
            if(vowels(s.charAt(i))) count1++;
        }
        

        if(count==count1) return true;
        return false;
    }
    static boolean vowels(char c){
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||
        c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="book";
        halvesAreAlike(s1);
    }
}
