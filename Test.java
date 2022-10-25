import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    
    int result=findGcd(a,b);
    System.out.println(result);
}
static int findGcd(int a , int b){
    if(b==0){
        return a;
    }
    return findGcd(b,a%b);
}
}
