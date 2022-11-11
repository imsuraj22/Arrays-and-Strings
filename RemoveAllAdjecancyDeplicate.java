import java.util.Stack;

public class RemoveAllAdjecancyDeplicate{

    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();

        stack.add(s.charAt(0));
        while(!stack.isEmpty())
        {   
            for(int i=1;i<s.length();i++){
                if(stack.peek()==s.charAt(i)){
                    stack.pop();
                    stack.add(s.charAt(i));
                    stack.pop();
                }else{
                    stack.add(s.charAt(i));
                }
            }
            break;
        }
        char[] ch=new char[stack.size()];
        int j=0;
        while(!stack.isEmpty()){
            ch[j++]=stack.pop();
        }
        String st=new String(ch);
        return st. 
    
    }
    public static void main(String[] args) {
        
    }
}