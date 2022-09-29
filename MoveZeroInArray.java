public class MoveZeroInArray {
    public void moveZero(int a[]){
        int temp=0;
        int j=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                j++;
            }
            
        }
         print(a);

    }
    void print(int a[]){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[]=new int[]{0,3,4,0,5,0,6};
        MoveZeroInArray m=new MoveZeroInArray();
        m.moveZero(a);
    }
    
}
