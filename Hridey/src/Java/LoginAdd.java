package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;

public class LoginAdd extends JFrame implements ActionListener,ItemListener
{
	JButton b1,b2,b3; JLabel l1,l2,l3,l4,l5,li; ImageIcon i;JTextField t1,t3,t4,t5;JComboBox t2;
	LoginAdd()
	{
		setLayout(null);
		setSize(800,700);
		i=new ImageIcon("C:\\Users\\gurdial sharma\\Desktop\\Pics\\blooddrive.jpg");
		li=new JLabel(i,JLabel.CENTER);
		li.setSize(800,700);
		l1=new JLabel("Name");
		l1.setFont(new Font("Serif", Font.ITALIC, 25));
		l1.setForeground(Color.BLACK);
		l1.setBounds(50,50,100,50);
		l2=new JLabel("Blood Group");
		l2.setFont(new Font("Serif", Font.ITALIC, 25));
		l2.setForeground(Color.BLACK);
		l2.setBounds(50,90,150,50);
		l3=new JLabel("CITY");
		l3.setFont(new Font("Serif", Font.ITALIC, 25));
		l3.setForeground(Color.BLACK);
		l3.setBounds(50,130,150,50);
		l4=new JLabel("Mob No:");
		l4.setFont(new Font("Serif", Font.ITALIC, 25));
		l4.setForeground(Color.BLACK);
		l4.setBounds(50,170,150,50);
		l5=new JLabel("Amount given(In Bottles)");
		l5.setFont(new Font("Serif", Font.ITALIC, 25));
		l5.setForeground(Color.BLACK);
		l5.setBounds(50,210,300,50);
		t1=new JTextField(30);
		t1.setLayout(null);
		t1.setBounds(400, 70, 100, 50);
		t1.setSize(300,30);
		t2=new JComboBox();
		t2.addItem("AB+");
		t2.addItem("AB-");
		t2.addItem("A+");
		t2.addItem("A-");
		t2.addItem("B+");
		t2.addItem("B-");
		t2.addItem("O+");
		t2.addItem("O-");
		t2.addItemListener(this);
		t2.setLayout(null);
		t2.setBounds(400, 108, 100, 50);
		t2.setSize(300,30);
		t3=new JTextField(30);
		t3.setLayout(null);
		t3.setBounds(400, 145, 100, 50);
		t3.setSize(300,30);
		t4=new JTextField(30);
		t4.setLayout(null);
		t4.setBounds(400, 180, 100, 50);
		t4.setSize(300,30);
		t5=new JTextField(30);
		t5.setLayout(null);
		t5.setBounds(400, 220, 100, 50);
		t5.setSize(300,30);
		b1=new JButton("SUBMIT");
		setLayout(null);
		b1.setBounds(500, 300, 40, 50);
		b1.setSize(100,50);
		b1.addActionListener(this);
		
		addWindowListener( new WindowAdapter() {
		});
		add(li);
		li.add(l1);
		li.add(l2);
		li.add(l3);
		li.add(l4);
		li.add(l5);
	    li.add(t1);
	    li.add(t2);
	    li.add(t3);
	    li.add(t4);
	    li.add(t5);
	    li.add(b1);
		setVisible(true);
		
	}
	/*public static void main(String arg[])
	{
		new LoginAdd();
	}*/
	public void itemStateChanged(ItemEvent ae)
	{
	 	
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==b1)
		  {
			  setVisible(false);
			  String s1=t1.getText();
			  String s2=(String)t2.getSelectedItem();
			  String s3=t3.getText();
			  String s4=t4.getText();
			  String s5=t5.getText();
			  JOptionPane.showMessageDialog(this, "ADDED SUCCESSFULLY");
			  
		  try
		  {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hridey","root","root");
		  Statement stm=con.createStatement();
		  int x=stm.executeUpdate("insert into loginadd values(null,'"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
		  System.out.println(x);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  }
		  
		
	}

}
