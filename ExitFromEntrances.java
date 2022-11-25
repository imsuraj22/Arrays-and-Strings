import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row=row;
        this.col=col;
    }
}

public class ExitFromEntrances{

    public int nearestExit(char[][] maze, int[] entrance) {

        int m=maze[0].length;
        int n=maze.length;

        Queue<Pair> q =new LinkedList<Pair>();
        Pair p=new Pair(entrance[0], entrance[1]);
        q.add(p);
        maze[entrance[0]][entrance[1]]='+';
        int level=0;

        int dr[]={1,-1,0,0};
        int dc[]={0,0,-1,1};

        while(!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                Pair temp=q.poll();
                int row=temp.row;
                int col=temp.col;

                for(int j=0;j<4;j++){
                    int new_row=row+dr[j];
                    int new_col=col+dc[j];

                    if(new_row>=0 && new_col>=0 && new_row<n && new_col<m ){
                        if(maze[new_row][new_col]=='+'){
                            continue;
                        }

                        if(new_row==0 || new_col ==0 || new_row==n-1 || new_col==m-1){
                            return level;
                        }

                        Pair s=new Pair(new_row, new_col);
                        q.add(s);
                        maze[new_row][new_col]='+';
                    }
                }
            }
        }
        return -1;

        
    }
    public static void main(String[] args) {
        
    }
    
}