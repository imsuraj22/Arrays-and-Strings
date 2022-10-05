import java.util.HashSet;

public class ContainsDuplicate {
    static boolean duplicateElement(int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        if (duplicateElement(arr))
           System.out.println("Yes");
        else
           System.out.println("No");
    }
}
