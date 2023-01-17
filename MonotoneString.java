public class MonotoneString {
    static public int minFlipsMonoIncr(String s) {
        
        int arr[]=new int[s.length()];
        int a =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                a++;
            }
            arr[i]=a;
        }

        int min=Integer.MAX_VALUE;
        a=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                a++;
            }
            arr[i]+=a;
            min=Math.min(min,(s.length()-arr[i]));
        }
        return min;
    }
    public static void main(String[] args) {
        String s="00011000";
        System.out.println(minFlipsMonoIncr(s));
    }
}
