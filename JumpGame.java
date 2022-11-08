public class JumpGame {

    static int canReach(int[] A, int N) {
        int reachable=0;
        for(int i=0;i<N;i++){
            if(reachable<i){
                return 0;
            }
            reachable=Math.max(reachable, i+A[i]);
        }
        return 1;
    }
    public static void main(String[] args) {
        
    }
}
