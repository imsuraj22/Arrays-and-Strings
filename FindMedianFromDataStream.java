import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMedianFromDataStream{
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Float> temp=new ArrayList<>();

    boolean flag=false;

    public void addNum(int num) {
        if(flag==false){
            temp.add(null);
            flag=true;
        }
        temp.add(null);
        list.add(num);
        Collections.sort(list);
        

        
    }
    public double findMedian() {
        int left=0;
        int right=0;
        float res=0;
        if(list.size()%2==0){
            //even no of elements
            if(list.size()/2!=0){
                right=list.size()/2;
                left=(list.size()/2)-1;
                res=(right+left)/2;
                temp.add(res);
                return res;
            }else if(list.size()/2==1){
                left=list.get(0);
                right=list.get(1);
                res=(left+right)/2;
                return res;
            }
        }else if(list.size()%2!=0){
            //odd no of elements
            res=list.size()/2;
            temp.add(res);
            return res;

        }

        return -1;
    }
    public static void main(String[] args) {
        
    }
}