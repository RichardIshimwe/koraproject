package login;
//import java.util.regex.*;

//import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;  
public class MasterClass {  

MasterClass(){  
JFrame f = new JFrame();  

JLabel header = new JLabel();
header.setText("<html><font color=white size=5><b>USER LOGIN</b></html>");
header.setBounds(75, 5, 160, 20);

JLabel firstName = new JLabel(); 
firstName.setText("<html><font color=white size=4><b>Username:</b></html>");
firstName.setBounds(5, 50, 76, 16);  
  
JLabel lastName = new JLabel();  
lastName.setText("<html><font color=white size=4><b>Password:</b></html>");
lastName.setBounds(5, 80, 76, 20);    

JTextField firstNameTF = new JTextField();  
firstNameTF.setBounds(80, 50, 170, 25);  
  
JPasswordField lastNameTF = new JPasswordField();  
lastNameTF.setBounds(80, 80, 170, 25);  
  
JButton sbmt = new JButton();  
sbmt.setText("<html><font color = rgb(0,102,102) size = 4><b>SUBMIT</b></html>");
sbmt.setBounds(72, 120, 140, 30);  
   
f.add(firstName);  
f.add(lastName);   
f.add(header);
f.add(firstNameTF);  
f.add(lastNameTF);    
f.add(sbmt);
Color c = new Color(0, 102, 102);
f.getContentPane().setBackground(c); 
f.setSize(275,195);  
f.setLayout(null);  
f.setVisible(true);  

}

  

public static void main(String[] args) {  
// TODO Auto-generated method stub  
MasterClass s = new MasterClass(); 
String email = "1";
checkemail result = new checkemail();

//boolean result1 = login.checkemail.isValid(email);
if (result.isValid(email) == true)
System.out.println("Provided email address "+ email+ " is valid \n");
else
System.out.println("Provided email address "+ email+ " is invalid \n");
}
}  
  
