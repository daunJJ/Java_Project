import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//make main display
public class DisplayHome
{
	public DisplayHome(String msg){
		JFrame f = new JFrame(msg);
		Color color = new Color(204,204,153);
		f.setLayout(new GridLayout(2,1));
		f.setSize (600, 800);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setBackground(color);
		p2.setBackground(color);
		p1.setLayout(new BorderLayout());

		JLabel label = new JLabel("<html><body><center>Hello<br> <br>Where do you eat?</center></body></html>", JLabel.CENTER);

		Font myFont = new Font("SanSerif", Font.BOLD, 22);
		label.setFont(myFont);
		label.setLocation(300,200);
		//label.setHorizontalAlignment(JLabel.CENTER);

		p1.add(label, BorderLayout.CENTER);
		f.add(p1);

		JButton b1 = new JButton("In");
        JButton b2 = new JButton("Out");

		b1.setPreferredSize(new Dimension(100, 60));
        b2.setPreferredSize(new Dimension(100, 60));

		p2.add(b1);
		p2.add(b2);
		f.add(p2);

		f.setVisible(true);

		//Change Page from Home to Menu
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DisplayMenu("Menu: JDU");
                f.setVisible(false);  
            }
        });

		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DisplayMenu("Menu: JDU");
                f.setVisible(false);  
            }
        });
	}
} 
