public class MoveZerosToEnd{

    static public void moveZeroes(int[] nums) {
        /* 
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }

        */

        int ball=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ball++;
            }else if(ball>0){
                int t =nums[i];
                nums[i]=0;
                nums[i-ball]=t;
            }
        }
        }
    
    public static void main(String[] args) {
        int arr[]=new int[]{0,1,0,3,12};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}