
public class MinimumAverageDiffrence {

    static public int minimumAverageDifference(int[] nums) {
       int min=Integer.MAX_VALUE;
       int leftIndex=0;
       int resultIndex=-1;
       int sum=0;
       int prefixSum=0;
       for(int i=0;i<nums.length;i++){
            sum+=nums[i];
       }

       while(leftIndex<nums.length){
        prefixSum+=nums[leftIndex];
        int leftAverage=prefixSum/(leftIndex+1);
        int rightSum=sum-prefixSum;

        if(rightSum!=0) rightSum/=nums.length-leftIndex-1;

        int res=Math.abs(leftAverage-rightSum);
        if(res<min){
            min=res;
            resultIndex=leftIndex;
        }
        leftIndex++;

       }
       return resultIndex;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,5,3,9,5,3};
        System.out.println(minimumAverageDifference(arr));
    }
}
