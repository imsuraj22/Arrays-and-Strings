import java.util.ArrayList;

public class LargestFactorial {

    static ArrayList<Integer> factorial(int n){
      ArrayList<Integer> result=new ArrayList<>();
      int size=0,c=0;
      size=1;
      result.add(0,1);


      int val=2;
      while(val<=n){
        for(int i=size-1;i>=0;i--){
             int temp=result.get(i)*val+c;

             result.set(i, temp%10);
             c=temp/10;
        }
        while(c!=0){
            result.add(0,c%10);
            c=c/10;
            size++;
        }
        val++;
      }
      return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
