package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.*;

public class Login1 extends JFrame implements ActionListener
{
	JButton b1,b2,b3; JLabel l1;ImageIcon i1;
	Login1()
	{
	setLayout(null);
	setSize(800,600);
	i1=new ImageIcon("C:\\Users\\gurdial sharma\\Desktop\\Pics\\blooddrive.jpg");
	l1=new JLabel(i1,JLabel.CENTER);
	l1.setBounds(0, 0, 800, 600);
	b1=new JButton("ADD DONAR");
	b1.setBounds(250, 150, 500, 400);
	b1.setSize(300,100);
	b1.addActionListener(this);
	b2=new JButton("DELETE DONAR");
	b2.setBounds(250, 300, 500, 400);
	b2.setSize(300,100);
	b2.addActionListener(this);
	l1.add(b1);
	l1.add(b2);
	add(l1);
	addWindowListener (new WindowAdapter() {
	});
	
	setVisible(true);
	}
	/*public static void main(String arg[])
	{
		new Login1();
	}*/
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getActionCommand().equals("ADD DONAR"))
		{
			new LoginAdd();
		}
		else if(ae.getActionCommand().equals("DELETE DONAR"))
		{
			new delete();
		}
	}
}
