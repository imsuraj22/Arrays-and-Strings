public class FindTheTownJudge{

    static public int findJudge(int n, int[][] trust) {
       int t[]=new int[trust.length+1];

       for(int i=0;i<trust.length;i++){
       t[trust[i][0]]--;
        t[trust[i][1]]++;
       }

       int max=0;
       int ind=-1;

       for(int i=0;i<t.length;i++){
        if(t[i]>max){
             max=t[i];
             ind=i;
       }
    }

    return ind;
    }
    public static void main(String[] args) {
        int arr[][]=new int[][]{
            {1,3},{2,3},{2,1}
        };
        System.out.println(findJudge(arr.length, arr));
    }
}