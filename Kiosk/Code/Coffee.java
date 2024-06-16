import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.nio.channels.ClosedByInterruptException;

class Coffee extends Thread  
{
	int x, y;
	int speed;
	JFrame app;

	public Coffee (JFrame _app, int w, int h) 
	{
		app = _app;
		x = w;
		y = h;
		
	}

	public void run()
	{
		while(true)
		{
			speed = (int) (Math.random() *50 );
			y += speed;
			app.repaint();

			try{
				sleep(speed*80);
			}catch(Exception ex){}
		}
	}
}
