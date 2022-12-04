public class CircularSentence{
    public boolean isCircularSentence(String sentence) {
        char curr;
        int i=0;
        int j=i+1;
     for(i=0;i<sentence.length()-1;i++){
        curr=sentence.charAt(i);
        if(sentence.charAt(j)==' '){
            char newc=sentence.charAt(j+1);
            if(curr!=newc) return false;
        }
        j++;
     } 
     char f=sentence.charAt(0);
     char l=sentence.charAt(sentence.length()-1);
     if(f!=l) return false;
     
     return true;
    }
    public static void main(String[] args) {
        
    }
}