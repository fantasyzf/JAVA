public class Example12_8 {
   public static void main(String args[ ]) {
      TicketHouse officer = new TicketHouse();
      Thread zhangfei,likui;
      zhangfei = new Thread(officer); 
      zhangfei.setName("张飞");
      likui = new Thread(officer);  
      likui.setName("李逵");
      zhangfei.start();
      try{
        Thread.sleep(1000);
      }
      catch(Exception exp){}
      likui.start();
   }
}
