// this program is to find out sum of sub arrays

public class SumOfSubArrays {

    public int subArray(int arr[], int k){
        int max=0;
        int i=0, j=0;
        int sum=0;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                max=Math.max(max, sum);
                sum=sum-arr[i];
                j++;
                i++;

            }
        }

        return max;
    }
    public static void main(String[] args) {

        SumOfSubArrays s=new SumOfSubArrays();
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(s.subArray(arr, 3 ));
        
    }
}
