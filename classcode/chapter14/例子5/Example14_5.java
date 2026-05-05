import java.awt.*;
public class Example14_5{
   public static void main(String args[]) {
       ImageWindow win = new ImageWindow(); 
       Toolkit tool=win.getToolkit(); 
       Image image=tool.getImage("唐老鸭.jpg");
       win.setIconImage(image); 
   }     
}