public class DeleteColumnsToMakeSorted{
    static public int minDeletionSize(String[] strs) {
        int count=0;

        for(int col=0;col<strs[0].length();col++){
            for(int row=1;row<strs.length;row++){
                if(strs[row].charAt(col)<strs[row-1].charAt(col)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String arr[]=new String[]{"cba","daf","ghi"};
        System.out.println(minDeletionSize(arr));
    }
}