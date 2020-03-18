package Java;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class avail extends JFrame implements ActionListener
{
	JTable jt;JButton b1;
	avail()
	{
		setSize(400,400);
		b1=new JButton("SHOW");
		b1.setBounds(200, 200, 100, 50);
		b1.addActionListener(this);
		addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent ae)
			{
				System.exit(0);
			}
		});
		add(b1);
	   setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{ 
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hridey","root","root");
		 DefaultTableModel model=new DefaultTableModel(new String[] {"Name","Group","Contact"},0);
		String sql="SELECT * FROM data1";
		Statement stm=(Statement) con.createStatement();
		ResultSet rs=stm.executeQuery(sql);
		while(rs.next())
		{
			String d=rs.getString("id");
			String e=rs.getString("name");
			String f=rs.getString("group");
			String g=rs.getString("contact");
			model.addRow(new Object[] {d,e,f,g});
			jt.setModel(model);
		}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
	public static void main(String ar[])
			{
		new avail();
			}
}
