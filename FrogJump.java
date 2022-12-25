import java.util.Scanner;

public class FrogJump {
    static int right=0;
    public static int frogJump(int n, int heights[]) {

        if(n==0) return 0;
        int left=frogJump(n-1, heights) + Math.abs(heights[n]-heights[n-1]);
        if(n>1){
             right=frogJump(n-2, heights) + Math.abs(heights[n]-heights[n-2]);
        }

        return Math.min(left, right);
       
       
        
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int T,n;
        // T=sc.nextInt();
        // n=sc.nextInt();
        // int height[]=new int[n];
        // for(int i=0;i<height.length;i++){
        //     height[i]=sc.nextInt();
        // }
        int height[]=new int[]{10,20,30,10};
        System.out.println(frogJump(3, height));




    }
}
