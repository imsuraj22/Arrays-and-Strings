import java.util.HashSet;

public class PairOfSimilarStrings{
    public int similarPairs(String[] words) {
     int pair=0;
     boolean flag=false;
    
     for(int i=0;i<words.length-1;i++){
        HashSet<Character> set=new HashSet<>();
        String curr=words[i];
        for(int j=0;j<curr.length();j++){
            set.add(curr.charAt(j));
        }
        curr=words[i+1];
        for(int k=0;k<curr.length();k++){
            if(set.contains(curr.charAt(k))){
                flag=true;
            }else{
                flag=false;
            }
        }
        if(flag==true) pair++;
     }   
     return pair;
    }
    public static void main(String[] args) {
        
    }
}