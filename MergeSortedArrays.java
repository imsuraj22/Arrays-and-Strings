public class MergeSortedArrays {
    public void merge(int a[], int b[]){
        int k=0;
        int i=0;
        int j=0;
        int size=a.length+b.length;
        int arr3[]=new int[size];
        

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr3[k++]=a[i++];
                
            }else
            {
                arr3[k++]=b[j++];
               
            }
        }

        while(i<a.length){
            arr3[k++]=a[i++];
            

        }
        while(j<b.length){
            arr3[k++]=b[j++];
            
        }
        print(arr3);

    }
    void print(int a[]){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        int a[]={2,3,5,7,9};
        int b[]={1,2,5,7,8};
        MergeSortedArrays m=new MergeSortedArrays();
        m.merge(a,b);

    }
    
}
