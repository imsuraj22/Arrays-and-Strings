import java.util.LinkedList;
import java.util.Queue;

class pair
{
    int first, second;
     
    public pair(int first, int second) 
    {
        this.first = first;
        this.second = second;
    }   
}
public class MinScoreBetweenPath {

    int h=0;
    int l=0;
     int dRow[] = { -1, 0, 1, 0 };
     int dCol[] = { 0, 1, 0, -1 };
    boolean [][] visited = new boolean[h][l];
     public int minScore(int n, int[][] roads) {
         h = roads.length;
         
        if (h == 0)
            return -1;
         l = roads[0].length;
         DFSUtil(roads, 0,  0, visited);

    }
    public void DFSUtil(int[][] roads, int row, int col, boolean[][] visited) {

        int H = roads.length;
        int L = roads[0].length;
        Queue<pair > q = new LinkedList<>();
 
    // Mark the starting cell as visited
    // and push it into the queue
    q.add(new pair(row, col));
    visited[row][col] = true;

        if (row < 0 || col < 0 || row >= H || col >= L || visited[row][col])
            return;
                
            while (!q.isEmpty())
            {
                pair cell = q.peek();
                int x = cell.first;
                int y = cell.second;
         
                System.out.print(roads[x][y] + " ");
         
                q.remove();
         
                // Go to the adjacent cells
                for(int i = 0; i < 4; i++)
                {
                    int adjx = x + dRow[i];
                    int adjy = y + dCol[i];
         
                    if (row >= 0 && col >= 0 && row <= H && col <=L && visited[row][col])
                    {
                        q.add(new pair(adjx, adjy));
                        visited[adjx][adjy] = true;
                    }
                }
            }
    }
    public static void main(String[] args) {
        
    }
}
