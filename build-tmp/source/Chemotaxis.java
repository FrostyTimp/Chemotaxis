import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] dot;
 public void setup()   
 {     
 	size(800,800);
 	dot=new Bacteria[100];
 	for(int i=0;i<dot.length;i++)
 	{
 		dot[i]=new Bacteria((int)(Math.random()*780)+10,(int)(Math.random()*780)+10);
 	}
 	frameRate(200);
 }
 public void draw()   
 {    
 	background(0);
 	for(int i=0;i<dot.length;i++)
 	{
 		dot[i].walk();
 		dot[i].show();
 	}
 }  
 class Bacteria    
 {     
 	int myX,myY,r,g,b;
 	Bacteria(int x,int y)
 	{
 		show();
 		myX=x;
 		myY=y;
 		r=(int)(Math.random()*256);
 		g=(int)(Math.random()*256);
 		b=(int)(Math.random()*256);

 	}
 	public void show()
 	{
 		stroke(r,g,b);
 		fill(r,g,b);
 		ellipse(myX,myY,10,10);
 	}
 	public void walk()
 	{
 			if(mouseX<myX)
 			{
 				myX=myX+(int)(Math.random()*4)-2;
 			}
 			else 
 			{
 				myX=myX+(int)(Math.random()*4)-1;
 			}
 			if(mouseY<myY)
 			{
 				myY=myY+(int)(Math.random()*4)-2;
 			}
 			else
 			{
 				myY=myY+(int)(Math.random()*4)-1;
 			}

 	}
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
