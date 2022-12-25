public class TakeCharacters {
    static public int takeCharacters(String s, int k) {
        int a=0;
        int b=0;
        int c=0;

        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)=='a') a++;
            if(s.charAt(i)=='b') b++;
            if(s.charAt(i)=='c') c++;

            if(s.charAt(j)=='a') a++;
            if(s.charAt(j)=='b') b++;
            if(s.charAt(j)=='c') c++;

            if(a>=k && b>=k && c>=k) break;
            if(a<=k || b<=k) i++;
            j--;

        }
        return a+b+c;
    }
    public static void main(String[] args) {
        String s="aabaaaacaabc";
        int k=2;
        System.out.println(takeCharacters(s, k));
    }
}
