public class PartitionEqualToSum {
    public static boolean canPartition(int[] arr, int n) {
		int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        if(sum%2==0) return true;
        return false;
	}
    
    public static void main(String[] args) {
        
    }
}
