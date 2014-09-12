/**
 * ImageExample.java  5/9/2014
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */

import java.awt.*;
import java.applet.*;
import java.net.*;
@SuppressWarnings("serial")
public class ImageExample extends Applet
{
	Image my_gif;

	URL base;

	MediaTracker mt;

	public void init()
	{
	  mt = new MediaTracker(this);
	  try{
	  	base=getDocumentBase();
	  }
	  catch(Exception e){}

	  my_gif=getImage(base,"pokedex.jpg");

	  mt.addImage(my_gif,1);

	  try{mt.waitForAll();}
	  catch(InterruptedException e){}
	}

	public void paint(Graphics g)
	{
	  g.drawImage(my_gif,0,0,this);
	  //g.drawImage(my_gif,20,140,30,40,this);


	}
}