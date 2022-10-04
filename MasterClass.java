package log_in_form;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;  
public class MasterClass {  
MasterClass(){  
JFrame f = new JFrame();  

JLabel header = new JLabel();
header.setText("<html><font color=white size=5><b>USER LOGIN</b></html>");
header.setBounds(75, 5, 160, 20);

JLabel firstName = new JLabel("Username:"); 
header.setText("<html><font color=white size=5><b>USER LOGIN</b></html>");
firstName.setBounds(5, 50, 76, 16);  
  
JLabel lastName = new JLabel("Password:");  
lastName.setBounds(5, 80, 76, 20);  
  
JTextField firstNameTF = new JTextField();  
firstNameTF.setBounds(120, 50, 100, 25);  
  
JTextField lastNameTF = new JTextField();  
lastNameTF.setBounds(120, 80, 100, 25);  
  
JButton sbmt = new JButton("Submit");  
sbmt.setBounds(20, 160, 100, 30);  
  
JButton reset = new JButton("Reset");  
reset.setBounds(120,160,100,30);  
f.add(firstName);  
f.add(lastName);   
f.add(header);
f.add(firstNameTF);  
f.add(lastNameTF);  
f.add(sbmt);  
f.add(reset);  
    Color c = new Color(0, 102, 102);
f.getContentPane().setBackground(c); 
f.setSize(275,195);  
f.setLayout(null);  
f.setVisible(true);  
}  
  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
MasterClass s = new MasterClass();  
}  
}  