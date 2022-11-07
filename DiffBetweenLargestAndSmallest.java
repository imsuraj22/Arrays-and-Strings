import java.util.Arrays;
import java.util.PriorityQueue;

import javafx.scene.layout.Priority;

public class DiffBetweenLargestAndSmallest {

    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int replace=nums[0];

        int n=nums.length;
        nums[n-1]=replace;
        nums[n-2]=replace;
        nums[n-3]=replace;

        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        int last=0;
    while(!q.isEmpty()) last=q.poll();
    return last-replace;
    }

    public static void main(String[] args) {
        
    }
}
