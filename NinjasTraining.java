import java.util.Arrays;

public class NinjasTraining {

    /* MEMOIZATION 

    public static int ninjaTraining(int n, int points[][]) {
        int dp[][]=new int[n][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
        return solution(n-1,3,points,dp);
    }

    static int solution(int day, int last,int points[][],int dp[][]){
        if(day==0){
            int maxi=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    maxi=Math.max(maxi, points[0][task]);
                }
            }

            return maxi;
        }

        if(dp[day][last]!=-1) return dp[day][last];

        int maxi=0;
        for(int task=0;task<3;task++){
            int point=0;
            if(task!=last){
                 point=points[day][task]+solution(day-1, task, points,dp);
            }
            maxi=Math.max(maxi, point);
        }
        return dp[day][last]=maxi;
    }
*/

public static int ninjaTraining(int n, int points[][]) {
        
    int dp[][]=new int[n][4];

    dp[0][0]=Math.max(points[0][1], points[0][2]);
    dp[0][1]=Math.max(points[0][0], points[0][2]);
    dp[0][2]=Math.max(points[0][0], points[0][1]);
    dp[0][3]=Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

    for(int day=1;day<n;day++){
        for(int last=0;last<4;last++){
            dp[day][last]=0;

            for(int task=0;task<3;task++){
                if(task!=last){
                    int point=points[day][task]+dp[day-1][task];
                    dp[day][last]=Math.max(dp[day][last], point);
                }
            }
        }
    }

    return dp[n-1][3]; 
}
    public static void main(String[] args) {
        int[][] points = {{10,40,70},
                          {20,50,80},
                          {30,60,90}};
           

        int n = points.length;
        System.out.println(ninjaTraining(n, points));
    }
}
