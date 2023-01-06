import java.util.Arrays;

public class Test {

  public static int frogJump(int n, int heights[]) {
    int dp[]=new int[heights.length];
    Arrays.fill(dp, -1);

    dp[0]=heights[0];

    for(int i=1;i<n;i++){
      int left=Math.abs(heights[i]-dp[i-1]);
      int right=Integer.MAX_VALUE;
      if(i<1) right=Math.abs(heights[i]-dp[i-2]);

      dp[i]=Math.min(left, right);
    
    }
    return dp[n-1];
  }
  static int solution(int i,int heights[],int dp[]){
    if(i==0) return 0;

    if(dp[i]!=-1) return dp[i];

    int left=solution(i-1, heights, dp)+Math.abs(heights[i]-heights[i-1]);
    int right=0;
    if(i>1) right=solution(i-2, heights, dp)+Math.abs(heights[i]-heights[i-2]);

    return dp[i]=Math.min(left, right);
  }
  public static void main(String[] args) {
    
}
} 
