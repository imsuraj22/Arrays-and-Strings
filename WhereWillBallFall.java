public class WhereWillBallFall{

    static int dfs(int i,int j,int[][] grid){
        if(i>=grid.length){
            return j;
        }

        if(grid[i][j]==1 && j+1<grid[0].length && grid[i][j+1]==1){
            return dfs(i+1, j+1, grid);
        }
        else if(grid[i][j] == -1 && j-1>=0 && grid[i][j-1]==-1){
            return dfs(i+1, j-1, grid);
        }else if(grid[i][j]==1 && j+1>=grid.length){
            return -1;
        }else {
            return -1;
        }
    }
    static public int[] findBall(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        int arr[]=new int[col];
        for(int i=0;i<col;i++){
            arr[i]=dfs(0,i,grid);
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};

        int result[]=findBall(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}