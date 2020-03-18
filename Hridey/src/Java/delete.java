package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.*;

public class delete extends JFrame implements ActionListener 
{
 JButton b1,b2,b3; JTextField t1,t2;JLabel l1,l2,li;ImageIcon i;
  delete()
  {
	  setLayout(null);
	  setSize(800,700);
	  i=new ImageIcon("images/blooddrive.jpg");
      li=new JLabel(i,JLabel.CENTER);
      li.setSize(800,700);
      l1=new JLabel("DELETE by Name ");
      l1.setFont(new Font("Serif", Font.ITALIC, 25));
	  l1.setForeground(Color.BLACK);
	  l1.setBounds(200,50,400,50);
	  t1=new JTextField(30);
	  t1.setLayout(null);
	  t1.setBounds(250, 150, 110, 50);
	  t1.setSize(300,30);
	  b1=new JButton("SUBMIT");
	  b1.setBounds(350, 250, 40, 50);
      b1.setSize(100,50);
	  b1.addActionListener(this);
      addWindowListener( new WindowAdapter() {
	});
      add(li);
      li.add(l1);
      li.add(t1);
      li.add(b1);
      setVisible(true);
  }

  
public void actionPerformed(ActionEvent e) 
{
	
	
	if(e.getSource()==b1)
	  {
		setVisible(false);
		  String s1=t1.getText();
		  JOptionPane.showMessageDialog(this, "DELETED SUCESSFULLY");
	  try
	  {
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hridey","root","root");
	  Statement stm=con.createStatement();
	  stm.executeUpdate("delete from loginadd where name='"+s1+"'");
	  System.exit(0);
	  }
	  catch(Exception ae)
	  {
		  System.out.println(ae);
	  }
	  }
}
}
