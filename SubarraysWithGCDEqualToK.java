public class SubarraysWithGCDEqualToK {

    static public int subarrayGCD(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int gcd=nums[i];
            for(int j=i;j<nums.length;j++){
                gcd=findGcd(gcd,nums[j]);
                if(gcd==k){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int findGcd(int a, int b){
        if(b==0){
            return a;
        }
        return findGcd(b, a%b);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{9,3,1,2,6,3};
        int result=subarrayGCD(arr, 3);
        System.out.println(result);
    }
}
