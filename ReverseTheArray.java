import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T,N;
        System.out.println("Enter the number of test case :");
        T=sc.nextInt();
        while(T>0){
            
            N=sc.nextInt();
            int ele;
            int arr[]=new int[N];
            for(int i=0;i<N;i++){
                ele=sc.nextInt();
                arr[i]=ele;
            }

            int l=0,m=arr.length-1;
            while(l<m){
                int temp=arr[l];
                arr[l]=arr[m];
                arr[m]=temp;
                l++;
                m--;
            }
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }

    }
}
