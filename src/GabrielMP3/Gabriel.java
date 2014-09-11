/**
 * Gabriel.java  5/27/2014
 *
 * @author - Gabriel Mata
 * @author - Period 2B-12
 * @author - Id 27129
 *
 * @author - This program will create an MP3 player that plays 4 songs
 * 	         It includes a stop button, a play button and a left and right arrow
 * 			 that allows you to cycle through the songs.
 *
 */

import java.applet.Applet;
import java.awt.Graphics;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;



public class Gabriel extends Applet implements MouseListener
{
	int xpos;
	int ypos;
	int track;

	AudioClip kingofamarillo;
	AudioClip bestofme;
	AudioClip cycles;
	AudioClip about_you;
	boolean playing1;
	boolean playing2;
	boolean playbutton;

	boolean mouseEntered;

	Font bigFont;
	Font artist;
	Font stopbutton;


	Image my_gif;
	Image issues_cover;
	Image adtr;
	Image rustie;
	Image xxyyxx;

	URL base;

	MediaTracker mt;

	public void init()
	{
 	  bigFont=new Font("Times New Roman",Font.BOLD,32);
 	  artist=new Font("Arial",Font.PLAIN,24);
 	  stopbutton=new Font("Arial",Font.BOLD,16);
	  kingofamarillo=getAudioClip(getDocumentBase(),"02_King_Of_Amarillo.wav");
	  bestofme=getAudioClip(getDocumentBase(),"05_Best_Of_Me.wav");
	  cycles=getAudioClip(getDocumentBase(),"slasher.wav");
	  about_you=getAudioClip(getDocumentBase(),"about_you.wav");
	  playing1=true;
	  addMouseListener(this);
	  mt = new MediaTracker(this);
	  try{
	  	base=getDocumentBase();
	  }
	  catch(Exception e){}

	  my_gif=getImage(base,"pokedex.jpg");
	  issues_cover=getImage(base,"black_diamonds.jpg");
	  adtr=getImage(base,"common_courtesy.jpg");
	  rustie=getImage(base,"rustie.jpg");
	  xxyyxx=getImage(base,"xxyyxx.jpg");

	  mt.addImage(my_gif,1);
	  mt.addImage(issues_cover,2);
	  mt.addImage(adtr,3);
	  mt.addImage(rustie,4);
	  mt.addImage(xxyyxx,5);

	  try{mt.waitForAll();}
	  catch(InterruptedException e){}
	  track=99;

	}

	public void paint(Graphics g)
	{
		//screen dimensions 296,45,298,217
	  g.drawImage(my_gif,0,0,this);

	  if(track==99)
	  	g.setFont(bigFont);
	  g.drawString("Press Play",350,150);
	 if(track==0)
	 {g.setFont(bigFont);
	 	g.drawImage(issues_cover,296,45,298,217,this);
	 g.drawString("King of Amarillo",302,414);
	 g.setFont(artist);
	 g.drawString("Issues",302,453);
	 g.setFont(bigFont);
	 g.drawString("Album:",302,547);
	 g.setFont(artist);
	 g.drawString("Black Diamonds",302,586);}

	  if(track==1)
	  {g.setFont(bigFont);
	    g.drawImage(adtr,296,45,298,217,this);
	    g.drawString("The Best of Me",302,414);
	    g.setFont(artist);
	    g.drawString("A Day to Remember",302,453);
	    g.setFont(bigFont);
	 g.drawString("Album:",302,547);
	 g.setFont(artist);
	 g.drawString("Common Courtesy",302,586);
	  }

	  if(track==2)
	  {	g.setFont(bigFont);
	  	g.drawImage(rustie,296,45,298,217,this);
	  	g.drawString("Slasherr",302,414);
	  	g.setFont(artist);
	  	g.drawString("Rustie",302,453);
	  	g.setFont(bigFont);
	 g.drawString("Album:",302,547);
	 g.setFont(artist);
	 g.drawString("Slasherr Single",302,586);}

	  if(track==3)
	  {	g.setFont(bigFont);
	  	g.drawImage(xxyyxx,296,45,298,217,this);
	  	g.drawString("About You",302,414);
	  	g.setFont(artist);
	  	g.drawString("XXYYXX",302,453);
	  	g.setFont(bigFont);
	 g.drawString("Album:",302,547);
	 g.setFont(artist);
	 g.drawString("XXYYXX",302,586);}
//		g.fillRect(148,467,39,22);
//		g.fillRect(216,467,39,22);
//		g.fillRect(746,458,58,48);
//		g.fillRect(803,418,15,15);
g.setColor(Color.red);

 	g.setFont(bigFont);
	  g.drawString("PLAY",733,492);
	  g.setFont(stopbutton);
	  g.drawString("Stop",801,432);
	}

	public void mouseClicked(MouseEvent me)
	{
	 	xpos=me.getX();
	 	ypos=me.getY();
	 	if(xpos>746&&xpos<(746+58)&&ypos>458&&
	 	ypos<(458+48))
	 	{//begin play button

	 	  kingofamarillo.stop();
	 	  bestofme.stop();
	 	  cycles.stop();
	 	  about_you.stop();
	 	  kingofamarillo.play();
	 	  track=0;
	 	}//end play button
	 	//(216,467,39,22) RIGHT ARROW
	 	//(148,467,39,22) LEFT ARROW
	 	if(xpos>803&&xpos<(803+15)&&ypos>418&&ypos<(418+15))
	 	{//begin stop button
	 	  kingofamarillo.stop();
	 	  bestofme.stop();
	 	  cycles.stop();
	 	  about_you.stop();
	 	  track=99;
	 	}//end stop button
	 	if(xpos>148&&xpos<(148+39)&&ypos>467&&ypos<(467+22))
	 	{
	 		if(track==0)
	 		{
	 		  kingofamarillo.stop();
	 		  about_you.play();
	 		  track=3;
	 		}
	 		else
	 		{
	 		  if(track==3)
	 		  {
	 		    about_you.stop();
	 		    cycles.play();
	 		    track=2;
	 		  }
	 		  else
	 		  {
	 		  	if(track==2)
	 		  	{
	 		    cycles.stop();
	 		    bestofme.play();
	 		    track=1;
	 		  	}
	 		  	else
	 		  		if(track==1)
	 		  		{bestofme.stop();
	 		  		kingofamarillo.play();
	 		  		track=0;}
	 		  }
	 		}
	 	}

	 	if(xpos>216&&xpos<(216+39)&&ypos>467&&ypos<(467+22))
	 	{	if(track==0) //begin right arrow
	 		{kingofamarillo.stop();
	 			bestofme.play();
	 			track=1;}
			else
		{	if(track==1)
	 		{
	 		  bestofme.stop();
	 		  cycles.play();
	 		  track=2;
	 		}
	 		else
	 			if(track==2)
	 			{
	 			  cycles.stop();
	 			  about_you.play();
	 			  track=3;
	 			}
	 			else
	 			{
	 			 if(track==3)
	 			 {
	 			 	about_you.stop();
	 			 	kingofamarillo.play();
	 			 	track=0;
	 			 }
	 			}
		}

	 	}//end right arrow
	 	repaint();
	}
    public void mousePressed(MouseEvent me){}

	public void mouseReleased(MouseEvent me){}

	public void mouseEntered(MouseEvent me)
	{
	   mouseEntered=true;

	}
	public void mouseExited(MouseEvent me)
	{
	   mouseEntered=false;

	}
}