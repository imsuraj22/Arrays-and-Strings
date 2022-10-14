public class RotateImage {
    /* BRUTE FORCE
    static public int[][] rotate(int[][] arr) {
        int len=arr.length;
        int temp[][]=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                temp[j][len-1-i]=arr[i][j];
            }
        }
        return temp;

    }
    */
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        /* 
        int temp[][]=rotate(arr);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
        */
    }
}
