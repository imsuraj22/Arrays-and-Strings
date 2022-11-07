public class ReverseVowelsOfString{

    static public String reverseVowels(String s) {
        int start=0;
        int end=(s.length())-1;

        char[] ch=s.toCharArray();

        while(start<end){
            while(start<end && !isVowel(ch[start])){
                start++;
            }
            while(end>start && !isVowel(ch[end])){
                end--;
            }

            if(start<end){
                swap(ch, start++, end--);
            }
        }

        return new String(ch);
             }

        static boolean isVowel(char c){
            return c=='a'||  c=='e'||  c=='i'||  c=='o'||  c=='u'
            || c=='A'||  c=='E'||  c=='I'||  c=='O'||  c=='U';
        }

        static void swap(char ch[], int x, int y){
            char temp=ch[x];
            ch[x]=ch[y];
            ch[y]=temp;
        }


    
    public static void main(String[] args) {
        String str="leetcode";
        System.out.println(reverseVowels(str));
    }
}