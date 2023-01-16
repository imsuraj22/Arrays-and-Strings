import java.util.PriorityQueue;



public class MaxScoreAfterApplyKOperation {

    static public long maxKelements(int[] nums, int k) {
        PriorityQueue<Double> pq=new PriorityQueue<>((a,b) -> {
            return a.compareTo(b);
        });
        for(int i=0;i<nums.length;i++){
            pq.add(Double.valueOf(nums[i]));
        }
        long score=0;
        int i=0;
        double div=k;
        
        while(i<k){
            double temp=pq.poll();
            score+=Math.ceil(temp);
            // Double rem=Math.ceil(temp/3);
            // System.out.println(rem);
            pq.add(Math.ceil(temp/div));
            i++;
        }
        return score;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{756902131,995414896,95906472,149914376,387433380,848985151
            };
            int arr1[]=new int[]{1,10,3,3,3};
        System.out.println(maxKelements(arr, 6));
    }
}
