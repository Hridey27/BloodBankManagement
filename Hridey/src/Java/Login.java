package Java;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
JButton b1,b2,b3; JLabel l1,l2,l3,l4,li; JTextField t1;ImageIcon i;JPasswordField t2;
Login()
{
	Container con=getContentPane();
	setSize(800,700);
	setLayout(null);
	i=new ImageIcon("C:\\Users\\gurdial sharma\\Desktop\\Pics\\blooddrive.jpg");
    li=new JLabel(i,JLabel.CENTER);
    li.setSize(800,700);
    JPanel p=new JPanel();
    p.setBounds(80,80, 500, 200);
    p.setBackground(new Color(0,0,0,40));  
	b1=new JButton("LOGIN");
	setLayout(null);
	b1.setBounds(330, 200, 40, 50);
	b1.setSize(100,50);
	b1.addActionListener(this);
	t1=new JTextField(50);
	t1.setLayout(null);
	t1.setBounds(250, 100, 40, 50);
	t1.setSize(300,30);
	t2=new JPasswordField(50);
	t2.setLayout(null);
	t2.setBounds(250, 150, 40, 50);
	t2.setSize(300,30);
	l1=new JLabel("Username-");
    l1.setFont(new Font("Serif", Font.ITALIC, 25));
	l1.setForeground(Color.BLACK);
	l1.setBounds(100,88,400,50);
	l2=new JLabel("Password-");
    l2.setFont(new Font("Serif", Font.ITALIC, 25));
	l2.setForeground(Color.BLACK);
	l2.setBounds(100,138,400,50);
	add(li);
	li.add(t1);
	li.add(t2);
	li.add(b1);
	li.add(l1);
	li.add(l2);
	li.add(p);
	setVisible(true);
	addWindowListener (new WindowAdapter() {
	});
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
public void actionPerformed(ActionEvent ae)
{
	String s1=t1.getText();
	char[] c=t2.getPassword();
	String s2=String.valueOf(c);
	if((s1.equals("admin"))&&(s2.equals("admin")))
	{
		if(ae.getActionCommand().equals("LOGIN"));
		{
			setVisible(false);
			new Login1();
		}
	}
	else
		JOptionPane.showMessageDialog(this, "Wrong Username/Password");

}
/*public static void main(String arg[])
{
	new Login();
}*/
}
