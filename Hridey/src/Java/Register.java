package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;

import javax.swing.*;

import java.sql.*;
public class Register extends JFrame implements ActionListener,ItemListener
{
  JButton j1;JTextField t1,t3;JLabel l1,li,l2,l3;ImageIcon i; JComboBox t2;
  Register()
  {
	  setLayout(null);
		setSize(800,700);
		i=new ImageIcon("images/blooddrive.jpg");
		li=new JLabel(i,JLabel.CENTER);
		li.setSize(800,700);
		l1=new JLabel("Name");
		l1.setFont(new Font("Serif", Font.ITALIC, 25));
		l1.setForeground(Color.BLACK);
		l1.setBounds(50,50,100,50);
		t1=new JTextField(30);
		t1.setLayout(null);
		t1.setBounds(400, 70, 100, 50);
		t1.setSize(300,30);
		l2=new JLabel("Blood Group");
		l2.setFont(new Font("Serif", Font.ITALIC, 25));
		l2.setForeground(Color.BLACK);
		l2.setBounds(50,110,150,50);
		t2=new JComboBox();
		t2.addItem("AB+");
		t2.addItem("AB-");
		t2.addItem("A+");
		t2.addItem("A-");
		t2.addItem("B+");
		t2.addItem("B-");
		t2.addItem("O+");
		t2.addItem("O-");
		t2.setLayout(null);
		t2.setBounds(400, 120, 100, 50);
		t2.setSize(300,30);
		l3=new JLabel("Contact ");
		l3.setFont(new Font("Serif", Font.ITALIC, 25));
		l3.setForeground(Color.BLACK);
		l3.setBounds(50,170,150,50);
		t3=new JTextField(30);
		t3.setLayout(null);
		t3.setBounds(400, 170, 100, 50);
		t3.setSize(300,30);
		j1=new JButton("SUBMIT");
		j1.setSize(100, 50);
		j1.setBounds(450,250,100,50);
		j1.addActionListener(this);
		add(li);
		li.add(l1);
		li.add(t1);
		li.add(l2);
		li.add(t2);
		li.add(t3);
		li.add(l3);
		li.add(j1);
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent ae)
			{
				System.exit(0);
			}
		});
		setVisible(true);
  }
  public void itemStateChanged(ItemEvent ae)
  {
	  
  }
  public void actionPerformed(ActionEvent ae)
  {
	  boolean numeric = true;
	  if(ae.getSource()==j1)
	  {
		  setVisible(false);
		  String s1=t1.getText();
		  String s2=(String)t2.getSelectedItem();
		  String s3=t3.getText();
		  try
		  {
			  long c=Long.parseLong(t3.getText());  
		  }
		  catch(NumberFormatException e )
		  {
			  numeric=false;
		  }
		  if(t1.getText().isEmpty()||t3.getText().isEmpty())
		  {
			  JOptionPane.showMessageDialog(this, " FILL ALL THE DETAILS !");
		  }
		  
		  else if(numeric==false)
		  {
			  JOptionPane.showMessageDialog(this, "ONLY NUMBERS ALLOWED IN CONTACTS");
			
		  }
		  else if(s3.length()!=10)
		  {
			  JOptionPane.showMessageDialog(this, "FILL CORRECT CONTACT NUMBER");
		  }
		  else
		  {
		  JOptionPane.showMessageDialog(this, "CONGRATULATIONS YOU HAVE REGISTERED AS DONAR NOW");
		  
	  try
	  {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hridey","root","root");
	  Statement stm=con.createStatement();
	  int x=stm.executeUpdate("insert into data1 values(null,'"+s1+"','"+s2+"','"+s3+"')");
	  System.out.println(x);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
		  }
	  }
	  
  }
  /*public static void main(String arg[])
  {
	  new Register();
  }*/
  
}
