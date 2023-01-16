import java.util.ArrayList;

public class InsertInterval {
    static public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){

            if(intervals[i][1]<newInterval[0]) list.add(intervals[i]);
            else if(intervals[i][0]>newInterval[1]){
                list.add(newInterval);
                newInterval=intervals[i];
            }
            else{
                newInterval[0]=Math.min(intervals[i][0], newInterval[0]);
                newInterval[1]=Math.max(intervals[i][1], newInterval[1]);
            }

        }
        list.add(newInterval);
        int ans[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arrr[][]=new int[][]{
            {1,2},{3,5},{6,7},{8,10},{12,16}
        };
        int temp[]=new int[]{4,8};
        int ans[][]=insert(arrr, temp);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }   
}
