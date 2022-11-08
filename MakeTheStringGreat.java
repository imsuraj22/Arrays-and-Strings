public class MakeTheStringGreat {

    static public String makeGood(String s) {
        
        StringBuilder newS=new StringBuilder(s);

        while(newS.length()>1){
        boolean flag=false;

        for(int i=0;i<newS.length()-1;i++){
            char currentChar=newS.charAt(i),nextChar=newS.charAt(i+1);
            if(Math.abs(currentChar-nextChar)==32){
                newS.deleteCharAt(i);
                newS.deleteCharAt(i);
                flag=true;
                break;
            }
        }
        if(!flag){
            break;
        }

        
    }
    return newS.toString();
    }
    public static void main(String[] args) {
        String s ="leEeetcode";
        System.out.println(makeGood(s));
    }
}
