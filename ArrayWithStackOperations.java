import java.util.ArrayList;

public class ArrayWithStackOperations {
    ArrayList<Integer> arr=new ArrayList<>();

    public void push(int x){
        arr.add(x);

    }
    int pop(){
        if(!arr.isEmpty()){
            int ele=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return ele;
        }
        return -1;
        

    }
    public int peek(){
        if (!arr.isEmpty())return arr.get(arr.size()-1);
        return -1;

    }
    boolean isEmpty(){
        if(arr.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayWithStackOperations a=new ArrayWithStackOperations();
        a.push(3);
        a.push(24);
        System.out.println(a.peek());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.isEmpty());
        
    }
}
