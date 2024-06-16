import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

class DisplayMake extends JFrame{

	Coffee a;
	ImageIcon img1;

	public DisplayMake() 
	{
		super("Thread Test");
		Color color = new Color(204,204,153);
		setLayout(new BorderLayout());
		setSize (600, 800);
		setBackground(color);

		JLabel label = new JLabel("Making a drink . . .", JLabel.CENTER);
		Font myFont = new Font("SanSerif", Font.BOLD, 18);
		label.setFont(myFont);

		add(label, BorderLayout.NORTH);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		a = new Coffee(this, 170, 30);

		a.start();
	}

	public void paint(Graphics g){
		img1 = new ImageIcon("./image/coffee3.jpg");

		g.drawImage(img1.getImage(), a.x, a.y, null);

	}	
}
