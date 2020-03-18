package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.*;

public class Welcome extends JFrame implements ActionListener 
{
 ImageIcon ii;JLabel l1,l2,l3;JButton b1;
 Welcome()
 {
	 Container con=getContentPane();
	 setSize(2000,800);
	 ii=new ImageIcon("images/pp.jpg");
	 l1=new JLabel(ii);
	 l1.setBounds(0, 0, 500, 500); 
	 l1.setLayout(null);
	 l1.setSize(400,400);
	 con.add(l1);
	 b1=new JButton("CLICK HERE TO START");
	 b1.setBounds(590, 600, 200, 50);
	 b1.setLayout(null);
	 //b1.setBackground(RED);
	 b1.addActionListener(this);
	 l1.add(b1);
	 setVisible(true);
	 
	 addWindowListener(new WindowAdapter() {
	});
	 
 }
 public static void main(String arg[])
 {
	 new Welcome();
 }

public void actionPerformed(ActionEvent ae) 
{
	setVisible(false);
	if(ae.getActionCommand().equals("CLICK HERE TO START"));
	{
		new LSA();
	}
	
}
 

}
