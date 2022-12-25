public class ClosetTarget {

    static public int closetTarget(String[] words, String target, int startIndex) {
        int prevD=0;
        int NextD=0;
        int n=words.length;
        for(int i=startIndex;i<words.length;i++){
            if(words[i]==target){
                return 0;
            }
            if(words[(i+1)%n]==target){
                NextD+=1;
                break;
                
            }
            NextD++;
        }
        for(int i=startIndex;i<words.length;i++){
            if(words[i]==target){
                return 0;
            }
            if(words[Math.abs((i-1+n)%n)]==target){
                prevD+=1;
                break;
                
            }
            prevD++;
        }
        if(prevD<NextD) return prevD;
        else return NextD;

        
        
    }
    public static void main(String[] args) {
        String arr[]=new String[]{"hello","i","am","leetcode","hello"};
        String target="hello";
        int i=1;
        System.out.println(closetTarget(arr, target, i));

    }
}
