package my.app;
import data.one.Circle;
import data.two.Circular;
public class Example4_25 {
   public static void main(String args[]) {
       Circle  circle=new Circle(10);           
       Circular circular=new Circular(circle,20);         
       System.out.println("圆锥的体积:"+circular.getVolme());
   }
}
