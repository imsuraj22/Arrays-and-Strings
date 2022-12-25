import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class topStudents {
    List<Integer> list=new ArrayList<>();
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        
        int feed=0;
        int pmax=0;
        int nmax=0;
        for(int i=0;i<report.length;i++){
            HashSet<String> set=new HashSet<>();
            String s1=report[i];
            String s2[]=(s1.split(" "));
            for(int j=0;j<s2.length;j++){
                set.add(s2[j]);
            }
            if((set.contains("studious") || set.contains("smart") || set.contains("brilliant"))   && !set.contains("not")){
                pmax+=1;
            }else{
                nmax+=1;
            }
            if(nmax>0) {
                feed=nmax;
                list.add(student_id[i]);
                
                pmax=0;
                nmax=0;
            }else if(nmax>feed){
                list.add(0,student_id[i]);
                feed=0;
            }
            else
            {
                list.add(student_id[i]);
            }
            
        }
        return list;
    }
    public static void main(String[] args) {
        
    }
}
