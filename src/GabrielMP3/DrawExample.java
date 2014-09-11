/**
 * DrawExample.java  5/19/2014
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */

import java.applet.*;
import java.awt.*;

public class DrawExample extends Applet
{
	Font bigFont;

	Color redColor;
	Color weirdColor;
	Color bgColor;

	public void init()
	{
	  bigFont=new Font("Arial",Font.BOLD,16);
	  redColor=Color.red;
	  weirdColor=new Color(60,60,122);
	  bgColor=Color.blue;
	  setBackground(bgColor);
	}
	public void stop()
	{}

	public void paint(Graphics g)
	{
	  g.setFont(bigFont);
	  g.drawString("Shapes and Colors",80,20);

	  g.setColor(redColor);

	  g.drawRect(100,100,100,100);

	  g.fillRect(110,110,80,80);
	  g.setColor(weirdColor);
	  g.fillArc(120,120,60,60,0,360);
	  g.setColor(Color.yellow);
	  g.drawLine(140,140,160,160);
	  g.setColor(Color.black);
	}
}