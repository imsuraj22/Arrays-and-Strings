public class RemoveDuplicateUsingRecursion {
    public static boolean[] map= new boolean[26];

    public static void removeDuplicate(String str,int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }

        char current=str.charAt(index);
        if(map[current-'a']==true){
            removeDuplicate(str, index+1, newString);
        }else{
            newString+=current;
            map[current-'a']=true;
            removeDuplicate(str, index+1, newString);
        }
    }
    public static void main(String[] args) {
        String str="abcabdefgf";
        removeDuplicate(str, 0, "");
        
    }
}
