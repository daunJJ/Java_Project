//making Calculator with swing
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingCal 
{
	JPanel p1;
	JPanel p2;
	JButton[][] buttons = new JButton[5][4];
	JTextField tf1;
	JTextField tf2;
	int n1 = 0;
	int n2 = 0;
	int CalCase = 0;
	String total = null;
	String txt = "";
	boolean count;

	MyListener listener = new MyListener();
	Calculator myCal = new Calculator();
	Operator operator = new Operator();
	Equal equal = new Equal();
	Clear clear = new Clear();

	public SwingCal(String msg){
		
		JFrame jf = new JFrame(msg);
		jf.setSize(400,500);
		jf.setLayout(new BorderLayout());
		
		// Display window
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		tf1 = new JTextField(30);
		p1.add("North", tf1);
		tf2 = new JTextField(10);
		p1.add("East", tf2);
		jf.add("North", p1);

		//Input Panel
		p2 = new JPanel();
		p2.setLayout(new GridLayout(5,4,5,5));

		buttons[0][0] = new JButton("C");
		buttons[0][0].addActionListener(clear);
		p2.add(buttons[0][0]);
		buttons[0][1] = new JButton("/");
		buttons[0][1].addActionListener(listener);
		buttons[0][1].addActionListener(operator);
		p2.add(buttons[0][1]);
		buttons[0][2] = new JButton("x");
		buttons[0][2].addActionListener(listener);
		buttons[0][2].addActionListener(operator);
		p2.add(buttons[0][2]);
		buttons[0][3] = new JButton("DEL");
		buttons[0][3].addActionListener(listener);
		p2.add(buttons[0][3]);
		buttons[1][0] = new JButton("7");
		buttons[1][0].addActionListener(listener);
		buttons[1][0].addActionListener(myCal);
		p2.add(buttons[1][0]);
		buttons[1][1] = new JButton("8");
		buttons[1][1].addActionListener(listener);
		buttons[1][1].addActionListener(myCal);
		p2.add(buttons[1][1]);
		buttons[1][2] = new JButton("9");
		buttons[1][2].addActionListener(listener);
		buttons[1][2].addActionListener(myCal);
		p2.add(buttons[1][2]);
		buttons[1][3] = new JButton("-");
		buttons[1][3].addActionListener(listener);
		buttons[1][3].addActionListener(operator);
		p2.add(buttons[1][3]);
		buttons[2][0] = new JButton("4");
		buttons[2][0].addActionListener(listener);
		buttons[2][0].addActionListener(myCal);
		p2.add(buttons[2][0]);
		buttons[2][1] = new JButton("5");
		buttons[2][1].addActionListener(listener);
		buttons[2][1].addActionListener(myCal);
		p2.add(buttons[2][1]);
		buttons[2][2] = new JButton("6");
		buttons[2][2].addActionListener(listener);
		buttons[2][2].addActionListener(myCal);
		p2.add(buttons[2][2]);
		buttons[2][3] = new JButton("+");
		buttons[2][3].addActionListener(listener);
		buttons[2][3].addActionListener(operator);
		p2.add(buttons[2][3]);
		buttons[3][0] = new JButton("1");
		buttons[3][0].addActionListener(listener);
		buttons[3][0].addActionListener(myCal);
		p2.add(buttons[3][0]);
		buttons[3][1] = new JButton("2");
		buttons[3][1].addActionListener(listener);
		buttons[3][1].addActionListener(myCal);
		p2.add(buttons[3][1]);
		buttons[3][2] = new JButton("3");
		buttons[3][2].addActionListener(listener);
		buttons[3][2].addActionListener(myCal);
		p2.add(buttons[3][2]);
		buttons[3][3] = new JButton("( )");
		buttons[3][3].addActionListener(listener);
		p2.add(buttons[3][3]);
		buttons[4][0] = new JButton("0");
		buttons[4][0].addActionListener(listener);
		buttons[4][0].addActionListener(myCal);
		p2.add(buttons[4][0]);
		buttons[4][1] = new JButton(".");
		buttons[4][1].addActionListener(listener);
		p2.add(buttons[4][1]);
		buttons[4][2] = new JButton("+/-");
		buttons[4][2].addActionListener(listener);
		p2.add(buttons[4][2]);
		buttons[4][3] = new JButton("=");
		buttons[4][3].addActionListener(equal);
		p2.add(buttons[4][3]);

		// p2.add(new Button("enter"));
		jf.add(p2);
		jf.setVisible(true);
	}

	// Create Event
	private class MyListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e){
			JButton button = (JButton)e.getSource();
				txt += button.getText();
				tf1.setText(txt);
		}
	}
	private class Calculator implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource();
			if (count==false){
				if(button.getText().equals("1"))
					n1 = 1;
				else if(button.getText().equals("2"))
					n1 = 2;	
				else if(button.getText().equals("3"))
					n1 = 3;
				else if(button.getText().equals("4"))
					n1 = 4;
				else if(button.getText().equals("5"))
					n1 = 5;
				else if(button.getText().equals("6"))
					n1 = 6;
				else if(button.getText().equals("7"))
					n1 = 7;
				else if(button.getText().equals("8"))
					n1 = 8;
				else if(button.getText().equals("9"))
					n1 = 9;
				else if(button.getText().equals("0"))
					n1 = 0;
				}
			else if(count==true) {
				if(button.getText().equals("1"))
					n2 = 1;
				else if(button.getText().equals("2"))
					n2 = 2;
				else if(button.getText().equals("3"))
					n2 = 3;
				else if(button.getText().equals("4"))
					n2 = 4;
				else if(button.getText().equals("5"))
					n2 = 5;
				else if(button.getText().equals("6"))
					n2 = 6;
				else if(button.getText().equals("7"))
					n2 = 7;
				else if(button.getText().equals("8"))
					n2 = 8;
				else if(button.getText().equals("9"))
					n2 = 9;
				else if(button.getText().equals("0"))
					n2 = 0;
				}
		}
	}
					
	private class Operator implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton)e.getSource();
			count = true;
			if(button.getText().equals("+"))
				CalCase = 1;
			else if(button.getText().equals("-"))
				CalCase = 2;
			else if(button.getText().equals("x"))
				CalCase = 3;
			else if(button.getText().equals("/"))
				CalCase = 4;
		}
	}
	
	private class Equal implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(CalCase==1) {
				total = Integer.toString(n1+n2);
			}
			else if(CalCase==2) {
				total = Integer.toString(n1-n2);
			}
			else if(CalCase==3) {
				total = Integer.toString(n1*n2);
			}
			else if(CalCase==4) {
				total = Integer.toString(n1/n2);
			}
			tf2.setText(total);
		}
	}
	private class Clear implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			n1 = 0;
			n2 = 0;
			CalCase = 0;
			total = null;
			tf2.setText(null);
			txt="";
			tf1.setText(txt);
			count = false;
		}
	}
}

