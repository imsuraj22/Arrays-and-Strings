public class RotateArrayByOne {

    static public void rotate(int arr[])
    {
            int temp=arr[arr.length-1];
            int i=arr.length-2;
            int j=arr.length-1;
            while(i>=0){
                arr[j]=arr[i];
                i--;
                j--;
            }
            arr[0]=temp;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{1, 2, 3, 4, 5};
        rotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
