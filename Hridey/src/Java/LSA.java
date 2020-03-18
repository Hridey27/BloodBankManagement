package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.*;

public class LSA extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4; JLabel j1;ImageIcon ii;
	LSA()
	{
		
		setLayout(null);
		Container con=getContentPane();
		//setSize(400,400);
		ii=new ImageIcon("images/blooddrive.jpg");
		j1=new JLabel(ii);
		j1.setBounds(0, 0, 1000, 600);
		add(j1);
		b1=new JButton("LOGIN");
		setSize(100,200);
		b1.setBounds(280,250,400,100);
		j1.add(b1);
		b1.addActionListener(this);
		b2=new JButton("SEARCH");
		b2.setBounds(280, 360, 400, 100);
		j1.add(b2);
		b2.addActionListener(this);
		b4=new JButton("REGISTER AS DONAR");
		b4.setBounds(280, 140, 400, 100);
		j1.add(b4);
		b4.addActionListener(this);
		setVisible(true);
		setSize(1000,600);
		//b1.setBackground(Color.WHITE);
		
		
		addWindowListener (new WindowAdapter() {
		});
		
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getActionCommand().equals("LOGIN"))
		{
			new Login();
		}
		else if(a.getActionCommand().equals("SEARCH"))
		{
			new search();
		}
		else if(a.getActionCommand().equals("REGISTER AS DONAR"))
		{
			new Register();
		}
	}
/*public static void main(String arg[])
{
	new LSA();
}*/


}
