import javax.swing.*;
import java.awt.*;
public class ImageWindow extends JFrame{
   Toolkit toolkit;
   JTextField text;
   JButton button;
   JLabel showMess;
   Image  image;
   Dimension dimension; 
   public ImageWindow(){
      toolkit = Toolkit.getDefaultToolkit();
      image = toolkit.getImage("ok.jpg");
      init();
   }
   public void init(){
      setTitle("窗口的背景图");
      setLayout(new FlowLayout()); 
      text = new JTextField(20);
      showMess = new JLabel("输入背景图像的名字，例如sun.jpg");
      button = new JButton("更换图像");
      text = new JTextField(20);
      add(showMess);
      add(text);
      add(button);
      button.addActionListener((e)->
                   { image=toolkit.getImage(text.getText());
                     repaint();
                   });
      setVisible(true); 
      dimension = toolkit.getScreenSize();
      setBounds(0,0,dimension.width,dimension.height);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
   }
   public void paint(Graphics g){
      super.paint(g); 
      g.drawImage(image,0,0,dimension.width,dimension.height,this);
      button.repaint();
      text.repaint();
      showMess.repaint();
   }
}