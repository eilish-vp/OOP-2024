package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{
    public void settings()
    {
        size(500,500);
    }

    public void setup() {

    } 

    float x1, y1, x2, y2;
    float x1dir, y1dir, x2dir, y2dir;
    float c = 0;

    public void draw()
    {
        background(255,231,205);
        
        triangle(100, 170, 250, 172, 185, 280);
        ellipse(150, 150, 105, 100);
        ellipse(205, 150, 100, 105);
        fill(0,0,0);
  
    }

}

    package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
		
	}
	
	public void draw()
	{
		background(255, 0xFF, 0); 
		stroke(0, 255, 0);
		line(10, 10, 100, 100); // x1, y1, x2, y2
		fill(90, 0, 0);
		ellipse(200, 90, 80, 200); // cx, cy
		circle(200, 300, 80);
		fill(90, 78, 88);
		rect(400, 380, 50, 100); // x, y, w, h
		triangle(10, 200, 200, 200, 300, 400);
	
	}
}
