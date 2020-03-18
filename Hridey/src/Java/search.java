package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;

public class search extends JFrame implements ActionListener 
{
 JComboBox t1,t2; JButton b1,b2; JLabel li,l1,l2; ImageIcon i;
 search()
 {
	 setLayout(null);
	 setSize(800,700);
	 i=new ImageIcon("images/blooddrive.jpg");
     li=new JLabel(i,JLabel.CENTER);
     li.setSize(800,700);
     l1=new JLabel("Search Blood Group");
     l1.setFont(new Font("Serif", Font.ITALIC, 25));
	 l1.setForeground(Color.BLACK);
	 l1.setBounds(250,50,400,50);
	 l2=new JLabel("");
	 l2.setBounds(200,100,150,50);
	 b1=new JButton("SUBMIT");
	 b1.setBounds(350, 250, 40, 50);
     b1.setSize(100,50);
	 b1.addActionListener(this);
	 t1=new JComboBox();
		t1.addItem("AB+");
		t1.addItem("AB-");
		t1.addItem("A+");
		t1.addItem("A-");
		t1.addItem("B+");
		t1.addItem("B-");
		t1.addItem("O+");
		t1.addItem("O-");
		t1.setLayout(null);
		t1.setBounds(250, 120, 100, 50);
		t1.setSize(300,30);
	 add(li);
	 li.add(l1);
	 li.add(b1);
	 li.add(t1);
	 li.add(l2);
     addWindowListener( new WindowAdapter() {
	});
	 setVisible(true);
 }
 public void actionPerformed(ActionEvent ae)
 {
	 String n;
 
	 if(ae.getSource()==b1)
	  {
		  String s1=(String)t1.getSelectedItem();
		  
	  try
	  {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hridey","root","root");
	  Statement stm=con.createStatement();
	  ResultSet rs=stm.executeQuery("select * from loginadd where bgroup='"+s1+"'");
	  if(rs.next())
	  {
		  n=rs.getString("bgroup");  
		  JOptionPane.showMessageDialog(this,"BLOOD GROUP PRESENT");
		  setVisible(false);
	  }
	  else
	  JOptionPane.showMessageDialog(this,"BLOOD GROUP NOT PRESENT");
	  setVisible(false);
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
 }
 /*public static void main(String s[])
 {
	 new search();
 }*/
 }
}
