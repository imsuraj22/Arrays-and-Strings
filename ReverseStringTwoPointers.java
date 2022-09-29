import javax.sound.midi.Soundbank;

public class ReverseStringTwoPointers {

    void reverse(char[] c){
        int a_pointer=0;
        int b_pointer=c.length-1;

        while(a_pointer<=b_pointer){
            char temp=c[a_pointer];
            c[a_pointer]=c[b_pointer];
            c[b_pointer]=temp;
            a_pointer++;
            b_pointer--;

        }
        for(char s:c){
            System.out.print(s);
        }

    }
    public static void main(String[] args) {
        ReverseStringTwoPointers r=new ReverseStringTwoPointers();
        char[] c=new char[]{'s','u','r','a','j'};
        r.reverse(c);
    }
}
