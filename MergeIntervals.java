import java.util.ArrayList;
import java.util.Arrays;


public class MergeIntervals{
    static public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list=new ArrayList<>();

       if(intervals.length==0 || intervals==null){
        return list.toArray(new int[0][]);
       }

       Arrays.sort(intervals, (a,b)->a[0]-b[0]);
       int start=intervals[0][0];
       int end=intervals[0][1];

       for(int[] i:intervals){
        if(i[0]<=end){
            end=Math.max(end, i[1]);
        }else{
            list.add(new int[]{start,end});
            start=i[0];
            end=i[1];
        }
       }
       list.add(new int[]{start,end});
       return list.toArray(new int[0][]);
    }
    public static void main(String[] args) {
        int arr[][]=new int[][]{
            {1,3},{2,6},{8,10},{15,18}
        };
        int ans[][]=merge(merge(arr));
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}