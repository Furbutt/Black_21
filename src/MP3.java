/**
 * MP3.java  05/07/14
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
import java.awt.event.*;

@SuppressWarnings("serial")
public class MP3 extends Applet implements MouseListener
{
	int xpos;
	int ypos;

	int rectlxco,rectlyco,rectlwidth,rectlheight;

	boolean mouseEntered;

	boolean rectlclicked;

	public void init()
	{
	  rectlxco=20;
	  rectlyco=20;
	  rectlwidth=100;
	  rectlheight=50;

	  addMouseListener(this);
	}


	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(rectlxco,rectlyco,rectlwidth,rectlheight);
		g.setColor(Color.red);

		g.drawString("("+xpos+","+ypos+")",xpos,ypos);

		if(rectlclicked)g.drawString("You clicked in the Rectangle",20,120);
		else g.drawString("You clicked outside of the Rectangle",20,120);

		if(mouseEntered)g.drawString("Mouse is in the applet area",20,160);
		else g.drawString("Mouse is the outside the Applet area",20,160);

	}


	 public void mouseClicked(MouseEvent me)
	 {
	 	xpos=me.getX();
	 	ypos=me.getY();

	 	if(xpos>rectlxco && xpos<rectlxco+rectlwidth && ypos>rectlyco&&
	 		ypos<rectlyco+rectlheight) rectlclicked=true;
	 		else
	 			rectlclicked=false;
	 			repaint();
	 }
	 public void mousePressed(MouseEvent me){}

	 public void mouseReleased(MouseEvent me){}

	 public void mouseEntered(MouseEvent me)
	 {
	   mouseEntered=true;
	   repaint();
	 }
	 public void mouseExited(MouseEvent me)
	 {
	   mouseEntered=false;
	   repaint();
	 }

}