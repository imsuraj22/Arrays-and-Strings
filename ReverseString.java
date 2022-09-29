import java.util.Stack;

public class ReverseString {
    
    void reverse(String s){
        String ans="";
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        System.out.println("Reverse String is : "+ans);
    }
    public static void main(String[] args) {
        ReverseString s=new ReverseString();
        s.reverse("Suraj");
    }
}
