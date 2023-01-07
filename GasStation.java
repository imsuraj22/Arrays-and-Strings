public class GasStation {
    /* BRUTE FORCE 
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for(int i=0;i<n;i++){
            int total=0,start=0,j=1;
            while(start<n){
                total+=gas[j%n]-cost[j%n];
                if(total<0) break;
                start++;
                j++;
            }
            if(start==n && total>=0) return i;
        }
        return -1;
    }
    */

    
    static public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0,total=0,index=0;
        for(int i=0;i<gas.length;i++){
            int consume=gas[i]-cost[i];
            tank+=consume;
            if(tank<0){
                index=i+1;
                tank=0;
            }
            total+=consume;
        }
        return total<0?-1:index;
    }
    public static void main(String[] args) {
        int gas[]=new int[]{1,2,3,4,5};
        int cost[]=new int[]{3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));

    }
}
