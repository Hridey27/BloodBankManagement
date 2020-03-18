package Java;
import java.awt.*;
import java.awt.event.WindowAdapter;

import javax.swing.*;

public class grid extends JFrame
{
	JLabel l1,l2;
	ImageIcon ii;
	JButton b1,b2;
	grid()
	{
		Container con=getContentPane();	
		ii=new ImageIcon("C:\\Users\\gurdial sharma\\Desktop\\Pics\\images.jpg");
		l1=new JLabel("Image");
		l2=new JLabel("Name",ii,JLabel.CENTER);
		setLayout(null);
		l1.setBounds(400,400,100,100);
		l2.setBounds(600,400,200,300);
		con.add(l1);
		con.add(l2);
	    setVisible(true);
	    setSize(400,500);
	    setLayout(null);
	    addWindowListener(new WindowAdapter() {
		});
		}
	public static void main(String arg[])
	{
		grid obj=new grid();
	}
	}

