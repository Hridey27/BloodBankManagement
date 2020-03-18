package Java;
import java.applet.*;
/*<applet code="Event" width="100" height="400"></applet> */
public class Event extends Applet 
{
	public void init()
	{
		add MouseListener(new MouseAdapter())
		{
			public void mouseClicked(MouseEvent ae)
			{
				showstatus("Mouse clicked");
			}
		};
	};

}
