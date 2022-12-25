import java.util.HashSet;

public class MinumizeSet {

    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        
        HashSet<Integer> ar1=new HashSet<>();
        HashSet<Integer> ar2=new HashSet<>();

        int i=1;
        int cnt=0;
        while(cnt<uniqueCnt1){
            if(i%divisor1!=0){
                ar1.add(i);
                i++;
                cnt++;
            }
        }

        i=i;
        cnt=0;
        while(cnt<uniqueCnt2){
            if(ar1.contains(i)) i++;
            if(i%divisor2!=0){
                ar2.add(i);
                i++;
                cnt++;
            }

        }
        int arr1[]=new int[ar1.size()];
        int arr2[]=new int[ar2.size()];
        int j=0;
        int ar1Max=0;
        for(Integer ele:ar1){
            if(ele>ar1Max) ar1Max=ele;
            arr1[j++]=ele;
        }
        j=0;
        int ar2Max=0;
        for(Integer ele:ar2){
            if(ele>ar2Max) ar2Max=ele;
            arr2[j++]=ele;
        }
        return Math.max(ar1Max, ar2Max);



    }
    public static void main(String[] args) {
        
    }
}
