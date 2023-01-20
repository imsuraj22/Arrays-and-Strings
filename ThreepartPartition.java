public class ThreepartPartition {
    static public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0,leftSum=0,count=0;
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int avg=sum/3;
        for(int i=0;i<arr.length;i++){
            leftSum+=arr[i];
            if(leftSum==avg){
                count++;
                leftSum=0;
            }
        }
        return count>=3 && sum%3==0;

        
    }
    public static void main(String[] args) {
        int arr[]=new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(canThreePartsEqualSum(arr));
    }
}
