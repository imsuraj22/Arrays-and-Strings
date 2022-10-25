public class ConflictInEvents {

    static  public boolean haveConflict(String[] event1, String[] event2) {
      int start1=(Integer.parseInt(event1[0].substring(0, 2))*60) + Integer.parseInt(event1[0].substring(3, 5)) ;
      
      int end1=(Integer.parseInt(event1[1].substring(0, 2))*60) + Integer.parseInt(event1[1].substring(3, 5)) ;
      
      int start2=(Integer.parseInt(event2[0].substring(0, 2))*60) + Integer.parseInt(event2[0].substring(3, 5)) ;
      

      int end2=(Integer.parseInt(event2[1].substring(0, 2))*60) + Integer.parseInt(event2[1].substring(3, 5)) ;
      

      if(start1<=end2 && start2<=end1){
        return true;
      }

       
      return false;
    }
    public static void main(String[] args) {
        String event1[] = new String []{"10:00","11:00"}, event2[] =new String[] {"14:00","15:00" };
        System.out.println(haveConflict(event1, event2));
    }
}
