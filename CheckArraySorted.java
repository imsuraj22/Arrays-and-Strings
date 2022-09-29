public class CheckArraySorted {
   static boolean sorted(int arr[]){
        int i=0;
        Boolean flag=false;
        while(i<arr.length-1){
            if(arr[i]<arr[i+1]){

                i++;
                flag=true;
            }else{
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,7};
       System.out.println(sorted(arr));
        
    }
}
