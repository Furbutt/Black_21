/**
 * SoundExample.java  5/9/2014
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */

import java.applet.*;
import java.awt.event.*;
import java.awt.*;
@SuppressWarnings("serial")
public class SoundExample extends Applet implements MouseListener
{
	AudioClip soundFile1;
	AudioClip soundFile2;
	boolean playing1;

	public void init()
	{
		soundFile1=getAudioClip(getDocumentBase(),"02_King_Of_Amarillo.wav");
		soundFile2=getAudioClip(getDocumentBase(),"05_Best_Of_Me.wav");
        playing1=true;
		addMouseListener(this);
		setBackground(Color.yellow);
		soundFile1.play();
	}

	public void paint(Graphics g)
	{
		g.drawString("Click to hear a sound",20,20);
	}

    public void mouseClicked(MouseEvent evt)
    {

      soundFile1.stop();
      soundFile2.play();
      playing1=false;

      if(playing1=false)
      {
        soundFile2.stop();
        soundFile1.play();
        playing1=true;
      }

    }
	public void mousePressed(MouseEvent evt){}
	public void mouseReleased(MouseEvent evt){}
	public void mouseEntered(MouseEvent evt){}
	public void mouseExited(MouseEvent evt){}
}