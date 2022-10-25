import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> intersectionSet =new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!set.contains(nums2[i])){
                intersectionSet.add(nums2[i]);
            }
        }
        int result[]=new int[intersectionSet.size()];
        int i=0;
        for(Integer it: intersectionSet){
            result[i++]=it;
        }
        return result; 
    }
    public static void main(String[] args) {
        
    }
}
