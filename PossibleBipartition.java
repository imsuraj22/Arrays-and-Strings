import java.util.HashSet;

public class PossibleBipartition {

    HashSet<Integer> s1=new HashSet<>();
    HashSet<Integer> s2=new HashSet<>();
    

    public boolean possibleBipartition(int n, int[][] dislikes) {
        for(int i=0;i<dislikes.length;i++){
            int a=dislikes[i][0];
            int b=dislikes[i][1];
            if(!s1.contains(a)){
                s1.add(a);
            }
            if(s1.contains(b)){
                return false;
            }
            if(!s2.contains(a)){
                s2.add(b);
            }
        
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
