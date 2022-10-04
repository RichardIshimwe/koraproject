import javax.swing.*;
import java.awt.*;
 
public class test {
 
  public static void main(String[] arguments) {
 
    // Create a basic JFrame
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("JFrame Color Example");
    frame.setSize(300,150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
 
    // Change the background color
    frame.getContentPane().setBackground(Color.red); 
 
  }
}