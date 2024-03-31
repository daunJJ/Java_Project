import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class LinePanel extends JPanel implements ActionListener
{
	JButton button;
	Color color1 = new Color(175,175,255);
	Color color2 = new Color(255,175,175);
	Color color3 = new Color(255,200,0);

	public LinePanel(){
		setLayout(new BorderLayout());
		button = new JButton("Color Change");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.setStroke(new BasicStroke(6));
		g2.setColor(color1);
		g2.drawLine(0,10,50,40);
		//g2.setColor(color1);
		g2.drawLine(50,40,100,60);
		//g2.setColor(color1);
		g2.drawLine(100,60,150,200);

		g2.setColor(color2);
		g2.drawLine(0,50,50,10);
		//g2.setColor(color2);
		g2.drawLine(50,10,100,80);
		//g2.setColor(color2);
		g2.drawLine(100,80,150,50);

		g2.setColor(color3);
		g2.drawLine(0,150,50,180);
		//g2.setColor(color3);
		g2.drawLine(50,180,100,160);
		//g2.setColor(color3);
		g2.drawLine(100,160,150,30);
	}
	public void actionPerformed(ActionEvent e){
		color1 = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
		color2 = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
		color3 = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
		repaint();
	}
}
