public class CountCollision {

    public int monkeyMove(int n) {
        
        int mod=(int)(Math.pow(10, 9)+7);

        long ans=(long)Math.pow(3, n);
        long ans1=ans%mod;
        return (int)ans1-2;
    }

    int solution(int prev,int ind,int n){

        if((ind+1)%n==prev){
            return 1;
        }else if((ind-1+n)%n==prev){
            return 1;
        }

        int clock=solution(ind,(ind+1)%n, n);
        int antiClock=solution(ind,(ind-1+n)%n, n);

        return clock+antiClock;
    } 
    public static void main(String[] args) {
        
    }
}
