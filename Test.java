

public class Test {

  static public String categorizeBox(int length, int width, int height, int mass) {
    String isBulk="";
        if(length>=10000 || width>=10000|| height>=10000) {
          isBulk= "Bulky";
        }

        long volume=(long)(length*width)*height;
       
        if(volume>=1000000000){
          isBulk= "Bulky";
        };
        String isHeavy="";
         if(mass>=100) isHeavy="Heavy";
        

        if(isBulk.equals("Bulky") && isHeavy.equals("Heavy")) return "Both";
        // if(!isBulk.equals("Bulky") && !isHeavy.equals("Heavy")) return "Neither";
        if(isBulk.equals("Bulky") && !isHeavy.equals("Heavy")) return "Bulky";
        if(!isBulk.equals("Bulky") && isHeavy.equals("Heavy")) return "Heavy";

        if(mass>=100) return "Heavy";
        
        return "Neither";
  }
  
  public static void main(String[] args) {
    System.out.println(categorizeBox(2909, 3968, 3272, 727));
}
} 
