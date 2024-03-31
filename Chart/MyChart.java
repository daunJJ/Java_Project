import javax.swing.*;
import java.awt.*;

public class MyChart
{
	public MyChart(String msg){
		JFrame f = new JFrame(msg);
		JPanel p = new JPanel();

		p.setLayout(new GridLayout(1,3));
		p.add(new CirclePanel());
		p.add(new RectanglePanel());
		p.add(new LinePanel());
		f.add(p);
		f.setSize(800,400);
		f.setVisible(true);
	}
} 
