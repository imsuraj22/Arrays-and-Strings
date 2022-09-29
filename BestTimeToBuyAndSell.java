public class BestTimeToBuyAndSell {
    public void maxProfit(int a[]){
        int arr[]=new int[a.length];
        int i=0,j=0,max=0;
        int m=a.length-1,k=arr.length-1;
        int n=m-1;
        for(i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
            
            while(m>0 && n>0){
                if(a[m]>a[n]){
                    arr[k--]=a[m--];
                    
                }else
                {
                    arr[k--]=a[n--];
                }
            }

        }
        for(i=0; i<a.length;i++);
        {
            max=arr[j++]-a[i];
            if(arr[j]+a[i]>max){
                max=arr[j++]-a[i];
            }
        }
        System.out.print(max);

    }
    public static void main(String[] args) {
        int a[] = new int[] {4,6,4,1,3,5,9};
        BestTimeToBuyAndSell b= new BestTimeToBuyAndSell();
        b.maxProfit(a);
    }
}
