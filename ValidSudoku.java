import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='-'){
                    String row="row"+i+board[i][j];
                    String col="col"+j+board[i][j];
                    String box="box"+((i/3)*3+(j/3))+board[i][j];

                    if(!set.contains(row) && !set.contains(col) && !set.contains(box)){
                        set.add(row);
                        set.add(col);
                        set.add(box);
                    }else{
                        return false;
                    }
                }
            }
        }

        return true;
        
    }

    public static void main(String[] args) {
        
    }
}
