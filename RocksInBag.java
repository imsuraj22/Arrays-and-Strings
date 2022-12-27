


public class RocksInBag {

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int arr[]=new int[rocks.length];
        int fill=0;
        for(int i=0;i<capacity.length;i++){
            arr[i]=capacity[i]-rocks[i];

        }
        for(int i=0;i<arr.length;i++){
            
            if(additionalRocks>0){
                additionalRocks-=arr[i];
                fill+=1;
            }
            if(arr[i]==0) fill++;
        }
        return fill;
    }
    public static void main(String[] args) {
        
    }
}
