import java.awt.*;

public class GridBagTest 
{
	public GridBagTest(String msg){
		Frame f = new Frame(msg);
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraint = new GridBagConstraints();
		f.setLayout(gridbag);

		constraint.fill = GridBagConstraints.BOTH;
		constraint.weightx=1;
		constraint.weighty=1;

		// Create TextField
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		constraint.gridheight = 1;

		TextField tf = new TextField(30);
		gridbag.setConstraints(tf, constraint);
		f.add(tf);

		// Create Calculator Button
		constraint.gridwidth = 1;
		constraint.gridheight = 1;

		Button b1 = new Button("C");
		gridbag.setConstraints(b1, constraint);
		f.add(b1);
		Button b2 = new Button("/");
		gridbag.setConstraints(b2, constraint);
		f.add(b2);

		Button b3 = new Button("X");
		gridbag.setConstraints(b3, constraint);
		f.add(b3);

		constraint.gridwidth = GridBagConstraints.REMAINDER;
		Button b4 = new Button("DEL");
		gridbag.setConstraints(b4, constraint);
		f.add(b4);

		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		Button b5 = new Button("7");
		gridbag.setConstraints(b5, constraint);
		f.add(b5);

		Button b6 = new Button("8");
		gridbag.setConstraints(b6, constraint);
		f.add(b6);

		Button b7 = new Button("9");
		gridbag.setConstraints(b7, constraint);
		f.add(b7);

		constraint.gridwidth = GridBagConstraints.REMAINDER;
		Button b8 = new Button("-");
		gridbag.setConstraints(b8, constraint);
		f.add(b8);

		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		Button b9 = new Button("4");
		gridbag.setConstraints(b9, constraint);
		f.add(b9);

		Button b10 = new Button("5");
		gridbag.setConstraints(b10, constraint);
		f.add(b10);

		Button b11 = new Button("6");
		gridbag.setConstraints(b11, constraint);
		f.add(b11);

		constraint.gridwidth = GridBagConstraints.REMAINDER;
		Button b12 = new Button("+");
		gridbag.setConstraints(b12, constraint);
		f.add(b12);

		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		Button b13 = new Button("1");
		gridbag.setConstraints(b13, constraint);
		f.add(b13);

		Button b14 = new Button("2");
		gridbag.setConstraints(b14, constraint);
		f.add(b14);

		Button b15 = new Button("3");
		gridbag.setConstraints(b15, constraint);
		f.add(b15);

		constraint.gridwidth = GridBagConstraints.REMAINDER;
		Button b16 = new Button("( )");
		gridbag.setConstraints(b16, constraint);
		f.add(b16);

		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		Button b17 = new Button("0");
		gridbag.setConstraints(b17, constraint);
		f.add(b17);

		Button b18 = new Button(".");
		gridbag.setConstraints(b18, constraint);
		f.add(b18);

		// Increase the size of the button
		constraint.gridwidth = 2;
		constraint.gridheight = 1;
		Button b19 = new Button("=");
		gridbag.setConstraints(b19, constraint);
		f.add(b19);

		f.pack();
		f.setSize(500,400);
		f.setVisible(true);
	}
}

