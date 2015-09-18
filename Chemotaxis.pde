Bacteria [] dot;
 void setup()   
 {     
 	size(800,800);
 	dot=new Bacteria[100];
 	for(int i=0;i<dot.length;i++)
 	{
 		dot[i]=new Bacteria((int)(Math.random()*780)+10,(int)(Math.random()*780)+10);
 	}
 	frameRate(200);
 }
 void draw()   
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
 	void show()
 	{
 		stroke(r,g,b);
 		fill(r,g,b);
 		ellipse(myX,myY,10,10);
 	}
 	void walk()
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