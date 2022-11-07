public class Maximum69Number {

    static public int maximum69Number (int num) {
        
     StringBuilder numb=new StringBuilder();
     numb.append(num);

     for(int i=0;i<numb.length();i++){
        if(numb.charAt(i)=='6'){
            numb.setCharAt(i, '9');
            break;
        }
     }
     return Integer.parseInt(numb.toString());
    }
    public static void main(String[] args) {
        int num=9669;
        System.out.println(maximum69Number(num));

    }
}
