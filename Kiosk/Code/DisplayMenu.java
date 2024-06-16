import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DisplayMenu 
{
	JFrame f;
	JTabbedPane tabpane;
	Color color1 = new Color(204,204,153);

	public DisplayMenu(String msg){
		f = new JFrame(msg);
		tabpane = new JTabbedPane();

		JPanel coffee = new JPanel();
		JPanel noncoffee = new JPanel();

		/////// coffee menu
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		// menu list
		p1.setLayout(new GridLayout(3,2));

		//Americano
		JPanel p11 = new JPanel();
		p11.setLayout(new BorderLayout());

		ImageIcon c1 = new ImageIcon("./image/americano.jpg");
		Image img1 = c1.getImage();
    	Image upImg1 = img1.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon1 = new ImageIcon(upImg1);
		JLabel l1 = new JLabel(upIcon1);
		JLabel t1 = new JLabel("Americano: 3000");
		Font myFont = new Font("SanSerif", Font.BOLD, 15);
		t1.setFont(myFont);
		t1.setPreferredSize(new Dimension(180, 40));
		p11.add(l1);
		p11.add(t1, BorderLayout.SOUTH);
		p1.add(p11);

		//Apogato
		JPanel p12 = new JPanel();
		p12.setLayout(new BorderLayout());

		ImageIcon c2 = new ImageIcon("./image/apogato.jpg");
		Image img2 = c2.getImage();
    	Image upImg2 = img2.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon2 = new ImageIcon(upImg2);
		JLabel l2 = new JLabel(upIcon2);
		JLabel t2 = new JLabel("Apogato: 4000");
		t2.setFont(myFont);
		t2.setPreferredSize(new Dimension(180, 40));
		p12.add(l2);
		p12.add(t2, BorderLayout.SOUTH);
		p1.add(p12);

		//Cappuccino
		JPanel p13 = new JPanel();
		p13.setLayout(new BorderLayout());

		ImageIcon c3 = new ImageIcon("./image/cappuccino.jpg");
		Image img3 = c3.getImage();
    	Image upImg3 = img3.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon3 = new ImageIcon(upImg3);
		JLabel l3 = new JLabel(upIcon3);
		JLabel t3 = new JLabel("Cappuccino: 3500");
		t3.setFont(myFont);
		t3.setPreferredSize(new Dimension(180, 40));
		p13.add(l3);
		p13.add(t3, BorderLayout.SOUTH);
		p1.add(p13);
		
		//Espresso
		JPanel p14 = new JPanel();
		p14.setLayout(new BorderLayout());

		ImageIcon c4 = new ImageIcon("./image/espresso.jpg");
		Image img4 = c4.getImage();
    	Image upImg4 = img4.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon4 = new ImageIcon(upImg4);
		JLabel l4 = new JLabel(upIcon4);
		JLabel t4 = new JLabel("Espresso: 3000");
		t4.setFont(myFont);
		t4.setPreferredSize(new Dimension(180, 40));
		p14.add(l4);
		p14.add(t4, BorderLayout.SOUTH);
		p1.add(p14);

		//Latte
		JPanel p15 = new JPanel();
		p15.setLayout(new BorderLayout());

		ImageIcon c5 = new ImageIcon("./image/latte.jpg");
		Image img5 = c5.getImage();
    	Image upImg5 = img5.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon5 = new ImageIcon(upImg5);
		JLabel l5 = new JLabel(upIcon5);
		JLabel t5 = new JLabel("Latte: 3500");
		t5.setFont(myFont);
		t5.setPreferredSize(new Dimension(180, 40));
		p15.add(l5);
		p15.add(t5, BorderLayout.SOUTH);
		p1.add(p15);

		//Mocha
		JPanel p16 = new JPanel();
		p16.setLayout(new BorderLayout());

		ImageIcon c6 = new ImageIcon("./image/mocha.jpg");
		Image img6 = c6.getImage();
    	Image upImg6 = img6.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon6 = new ImageIcon(upImg6);
		JLabel l6 = new JLabel(upIcon6);
		JLabel t6 = new JLabel("Caffe Mocha: 3500");
		t6.setFont(myFont);
		t6.setPreferredSize(new Dimension(180, 40));
		p16.add(l6);
		p16.add(t6, BorderLayout.SOUTH);
		p1.add(p16);

		// collect list
		p2.setLayout(new BorderLayout());
		String columnName[] = {"Menu: Price"};
		String data[][] = {{"a"},{"b"}, {"c"}};
		JTable table = new JTable(data, columnName);
		table.getColumn("Menu: Price").setPreferredWidth(280);
		p2.add(table);

		// Button
		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(2,1));
		JButton b11 = new JButton("SELECT");
        JButton b21 = new JButton("CANCEL"); 
		p5.add(b11);
		p5.add(b21);
		p2.add(p5, BorderLayout.EAST);

		coffee.add(p1);
		coffee.add(p2, BorderLayout.SOUTH);

		coffee.setBackground(color1);
		tabpane.addTab("Coffee", coffee);


		/////// non-coffee menu
		// non coffee menu
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();

		// menu list
		p3.setLayout(new GridLayout(3,2));

		//Green Tea
		JPanel p21 = new JPanel();
		p21.setLayout(new BorderLayout());

		ImageIcon c21 = new ImageIcon("./image/greentea.jpg");
		Image img21 = c21.getImage();
    	Image upImg21 = img21.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon21 = new ImageIcon(upImg21);
		JLabel l21 = new JLabel(upIcon21);
		JLabel t21 = new JLabel("Green Tea: 3000");
		t21.setFont(myFont);
		t21.setPreferredSize(new Dimension(180, 40));
		p21.add(l21);
		p21.add(t21, BorderLayout.SOUTH);
		p3.add(p21);

		//Earl Gray
		JPanel p22 = new JPanel();
		p22.setLayout(new BorderLayout());

		ImageIcon c22 = new ImageIcon("./image/earlgray.jpg");
		Image img22 = c22.getImage();
    	Image upImg22 = img22.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon22 = new ImageIcon(upImg22);
		JLabel l22 = new JLabel(upIcon22);
		JLabel t22 = new JLabel("Earl Gray Tea: 3000");
		t22.setFont(myFont);
		t22.setPreferredSize(new Dimension(180, 40));
		p22.add(l22);
		p22.add(t22, BorderLayout.SOUTH);
		p3.add(p22);

		//Lime Sparkling
		JPanel p23 = new JPanel();
		p23.setLayout(new BorderLayout());

		ImageIcon c23 = new ImageIcon("./image/lime.jpg");
		Image img23 = c23.getImage();
    	Image upImg23 = img23.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon23 = new ImageIcon(upImg23);
		JLabel l23 = new JLabel(upIcon23);
		JLabel t23 = new JLabel("Lime Sparkling: 3500");
		t23.setFont(myFont);
		t23.setPreferredSize(new Dimension(180, 40));
		p23.add(l23);
		p23.add(t23, BorderLayout.SOUTH);
		p3.add(p23);
		
		//mango blended
		JPanel p24 = new JPanel();
		p24.setLayout(new BorderLayout());

		ImageIcon c24 = new ImageIcon("./image/mango.jpg");
		Image img24 = c24.getImage();
    	Image upImg24 = img24.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon24 = new ImageIcon(upImg24);
		JLabel l24 = new JLabel(upIcon24);
		JLabel t24 = new JLabel("Mango Blended: 4000");
		t24.setFont(myFont);
		t24.setPreferredSize(new Dimension(180, 40));
		p24.add(l24);
		p24.add(t24, BorderLayout.SOUTH);
		p3.add(p24);

		//Mint Choco
		JPanel p25 = new JPanel();
		p25.setLayout(new BorderLayout());

		ImageIcon c25 = new ImageIcon("./image/mintchoco.jpg");
		Image img25 = c25.getImage();
    	Image upImg25 = img25.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon25 = new ImageIcon(upImg25);
		JLabel l25 = new JLabel(upIcon25);
		JLabel t25 = new JLabel("Mint Choco: 3500");
		t25.setFont(myFont);
		t25.setPreferredSize(new Dimension(180, 40));
		p25.add(l25);
		p25.add(t25, BorderLayout.SOUTH);
		p3.add(p25);

		//strawberry
		JPanel p26 = new JPanel();
		p26.setLayout(new BorderLayout());

		ImageIcon c26 = new ImageIcon("./image/strawberry.jpg");
		Image img26 = c26.getImage();
    	Image upImg26 = img26.getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        ImageIcon upIcon26 = new ImageIcon(upImg26);
		JLabel l26 = new JLabel(upIcon26);
		JLabel t26 = new JLabel("Strawberry: 3500");
		t26.setFont(myFont);
		t26.setPreferredSize(new Dimension(180, 40));
		p26.add(l26);
		p26.add(t26, BorderLayout.SOUTH);
		p3.add(p26);

		// collect list
		p4.setLayout(new BorderLayout());
		String columnName2[] = {"Menu: Price"};
		String data2[][] = {{"a"},{"b"}, {"c"}};
		JTable table2 = new JTable(data, columnName);
		table2.getColumn("Menu: Price").setPreferredWidth(280);
		p4.add(table2);

		// Button
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(2,1));
		JButton b12 = new JButton("SELECT");
        JButton b22 = new JButton("CANCEL"); 
		p6.add(b12);
		p6.add(b22);
		p4.add(p6, BorderLayout.EAST);

		noncoffee.add(p3);
		noncoffee.add(p4, BorderLayout.SOUTH);
		noncoffee.setBackground(color1);
		tabpane.addTab("Non-Coffee", noncoffee);

		f.getContentPane().add(tabpane, BorderLayout.CENTER);
		f.setSize (600, 800);
		f.setVisible(true);

		//Event
		b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				new DisplayMake();
                f.setVisible(false);  
            }
        });

		b21.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DisplayHome("Menu: JDU");
                f.setVisible(false);  
            }
        });

		b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DisplayMake();
                f.setVisible(false);  
            }
        });

		b22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DisplayHome("Menu: JDU");
                f.setVisible(false);  
            }
        });
	}
}