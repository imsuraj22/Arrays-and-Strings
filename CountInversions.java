public class CountInversions{

    static long count=0;
    public static long getInversions(long arr[], int n) {
        mergeSort(arr, 0,(int)n-1);

        return count;

    }

   static long[] mergeSort(long arr[],int i,int j){

        if(i==j){
            long[] ar=new long[1];
            ar[0]=arr[i];
            return ar;
        }

        int mid=(i+j)/2;
        long[] fa=mergeSort(arr, i, mid);
        long[] sa=mergeSort(arr, mid+1, j);
        long [] resarr=merge(fa, sa);

        return resarr;
       
    }

    static long[] merge(long[] arr1, long[] arr2){
        long temp[]=new long[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[i]){
                temp[k++]=arr1[i++];
            }else{
                temp[k++]=arr2[j++];
                count+=arr1.length-i;
            }
        }

        while(i<arr1.length){
            temp[k++]=arr1[i++];
        }
        while(j<arr2.length){
            temp[k++]=arr2[j++];
        }

        return temp;
    }
    public static void main(String[] args) {
        long[] arr= new long[]{5,3,2,4,1};
        System.out.println(getInversions(arr, 5));
    }
}