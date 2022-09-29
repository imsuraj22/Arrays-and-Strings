class ReverseArray{

    public int[] reverse(int a[]){
        int s=0; 
        int e=a.length-1;
        int temp=0;
        while(s<=e){
            temp=a[s];
            a[s]=a[e];
            a[e]=temp;

            s++;
            e--;
        }
        return a;

    }

    void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
     public static void main(String[] args) {
        int a[]={12,34,23,42,23,44};
        ReverseArray r=new ReverseArray();
        int arr[]=r.reverse(a);
        r.print(arr);
        
    }
}