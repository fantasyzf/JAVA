import java.io.*;
public class Example10_3 {
   public static void main(String args[]) {
      try{ 
          // 创建 ProcessBuilder 实例，指定要执行的命令和参数
           ProcessBuilder processBuilderNotepad = new ProcessBuilder("notepad.exe", "Example10_3.java");
           Process process = processBuilderNotepad.start();
           ProcessBuilder processBuilderExcel = 
           new ProcessBuilder("C:/Program Files/Microsoft Office/root/Office16/Excel.exe");
           process = processBuilderExcel.start();
           /* 以下代码正确，但是在JDK21是过时API
           Runtime ce=Runtime.getRuntime();
           File file=new File("Notepad.exe");
           ce.exec(file.getName());
           file=new File
           ("C:/Program Files/Microsoft Office/root/Office16/Excel.exe");
           ce.exec(file.getAbsolutePath());
           */
      }
      catch(Exception e) {
         System.out.println(e);
      } 
   } 
}

