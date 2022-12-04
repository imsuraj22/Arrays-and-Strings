import java.util.Arrays;

public class DividePlayerIntoEqualSkills {

    public long dividePlayers(int[] skill) {
        if(skill.length==1) return -1;

        if(skill.length==2) return skill[0]*skill[1];
        Arrays.sort(skill);
        long check=0;
        int i=0;
        int j=skill.length-1;
        long mul=0;
        while(i<j){
            long tempMul=1;
            long curr=skill[i]+skill[j];
            tempMul=skill[i]*skill[j];
            mul+=tempMul;
            if(i==0){
                check=curr;
            }
            
            if(check!=curr) return -1;

            i++;
            j--;
        }

        return mul;
    }

    public static void main(String[] args) {
        
    }
}
