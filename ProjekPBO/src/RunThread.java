public class RunThread {
    static void print (String p1 , String p2) {
        System.out.print(p1);
      try {
         Thread.sleep(2000);
      } 
      catch (InterruptedException ie) {
      }
        System.out.println(p2);
   }
    
}
