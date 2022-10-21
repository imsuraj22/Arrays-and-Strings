public class MergeSort {
    static int[] sortArr(int[] arr) 
    { 
        int left=0;
        int right=arr.length-1;
        mergeSort(arr, left, right);
        return arr;
    }
    
    static void mergeSort(int arr[], int left, int right){
        if(left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1, right);
            merge(arr,left,mid,right);
        }
    }
    static void merge(int arr[], int left, int mid, int right){
        int i,j,k;
        int n1=mid-left+1;
        int n2=right-mid;
        
        int leftArr[]=new int[n1];
        int rightArr[]=new int[n2];
        
        for(i=0;i<n1;i++){
            leftArr[i]=arr[left+i];
        }
        for(j=0;j<n2;j++){
            rightArr[j]=arr[mid+1+j];
        }
        
        i=0;
        j=0;
        k=left;
        
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
            
        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
            
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1, 5, 3, 2};
        int result[]=sortArr(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
