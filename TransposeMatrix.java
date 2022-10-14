public class TransposeMatrix {

    public static int[][] transpose(int[][] arr){
            int row=arr.length;
            int col=arr[0].length;
            int temp[][]=new int[col][row];

            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    temp[j][i]=arr[i][j];
                }
            }
            return temp;
    }
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        
        int temp[][]=transpose(arr);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
