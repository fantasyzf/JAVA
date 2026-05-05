import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PoliceListen implements ActionListener {
    WindowView view;
    public void setView(WindowView view) {
        this.view = view;
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.inputText){
           String str = view.inputText.getText();
           view.textShow.append("\""+str+"\"的长度:"+str.length()+"\n");
        }
        else if (e.getSource()==view.button){
           String str = view.button.getText();
           view.textShow.append(str+"\n"); 
        }
        
    }
}
