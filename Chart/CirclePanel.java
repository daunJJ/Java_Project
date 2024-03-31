import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.event.*;

class CirclePanel extends JPanel implements ActionListener
{
	JButton button;
	Color color1 = new Color(175,175,255);
	Color color2 = new Color(255,175,175);
	Color color3 = new Color(255,200,0);

	public CirclePanel(){
		setLayout(new BorderLayout());
		button = new JButton("Color Change");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		g2.setPaint(color1);
		g2.fill(new Arc2D.Float(20, 30, 200, 200, 45, 160, Arc2D.PIE));

		g2.setPaint(color2);
		g2.fill(new Arc2D.Float(20, 30, 200, 200, 205, 70, Arc2D.PIE));

		g2.setPaint(color3);
		g2.fill(new Arc2D.Float(20, 30, 200, 200, 275, 130, Arc2D.PIE));
	}
	public void actionPerformed(ActionEvent e){
		color1 = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
		color2 = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
		color3 = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
		repaint();
	}
}

