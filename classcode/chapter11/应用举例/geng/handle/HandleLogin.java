package geng.handle; 
import geng.model.Login;
import java.sql.*;
import javax.swing.JOptionPane;
public class HandleLogin {
   Connection con;
   PreparedStatement preSql;
   ResultSet rs;  
   public HandleLogin(){
      try{  Class.forName("com.mysql.cj.jdbc.Driver");
      }
      catch(Exception e){}
      String 
      uri = "jdbc:mysql://localhost:3306/user"+
      "?useSSL=true&&serverTimezone=Asia/Shanghai&characterEncoding=utf-8";
      try{  
         con = DriverManager.getConnection(uri,"root",""); 
      }
      catch(SQLException e){}
   }
   public Login queryVerify(Login loginModel) {
      String id = loginModel.getID();
      String pw = loginModel.getPassword();
      String sqlStr ="select id,password from register where "+
                      "id = ? and password = ?";
      try { 
          preSql = con.prepareStatement(sqlStr);
          preSql.setString(1,id);       
          preSql.setString(2,pw);  
          rs = preSql.executeQuery(); 
          if(rs.next()==true) {
             loginModel.setLoginSuccess(true);
             JOptionPane.showMessageDialog(null,"  ¼ ɹ ",
                             "  ϲ",JOptionPane.WARNING_MESSAGE);
          }
          else {
             loginModel.setLoginSuccess(false);
             JOptionPane.showMessageDialog(null,"  ¼ʧ  ",
                "  ¼ʧ ܣ    µ ¼",JOptionPane.WARNING_MESSAGE);
          }
          con.close();
      }
      catch(SQLException e) {}
      return loginModel;
   }
}
