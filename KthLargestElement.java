import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    static public int findKthLargest(int[] nums, int k) {
            // Arrays.sort(nums);
            
            // int i=0,j=nums.length-1;
            // while(i<j){
            //     int temp=nums[i];
            //     nums[i]=nums[j];
            //     nums[j]=temp;
            //     i++;
            //     j--;
            // }
            
            // if(k!=0)
            // return nums[k-1];
            // return nums[0];

            final PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int val : nums) {
                pq.offer(val);
        
                if(pq.size() > k) {
                    pq.poll();
                }
            }
            return pq.peek(); 
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,3,1,2,4,5,5,6};
        int result=findKthLargest(arr, 4);
       System.out.println(result);
    }
}
