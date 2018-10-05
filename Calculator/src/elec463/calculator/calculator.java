package elec463.calculator;

import java.awt.Button;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculator implements ActionListener {
	
	private static JTextField firstField;
	private static JTextField secondField;
	private static JLabel firstLabel;
	private static JLabel secondLabel;
	private static JLabel answerLabel;
	private static JLabel outputAns;
	private static JButton add,sub,mod,max,min,mul,div;
	public static float xaxis1,xaxis2;
	
	

	public static void main(String[] args) {
		
	firstField= new JTextField(10);
	secondField=  new JTextField(10);
	
	firstLabel= new JLabel("First Number: ", JLabel.RIGHT);
	firstLabel.setDisplayedMnemonic('F');
	firstLabel.setLabelFor(firstField);
	

	secondLabel= new JLabel("Second Number: ", JLabel.RIGHT);
	secondLabel.setDisplayedMnemonic('S');
	secondLabel.setLabelFor(secondField);
	

	answerLabel= new JLabel("Answer: ", JLabel.RIGHT);
	answerLabel.setDisplayedMnemonic('A');
	
	outputAns= new JLabel("0",JLabel.CENTER);
	
	mul= new JButton ("x");
	div= new JButton ("/");
	add= new JButton ("+");
	sub= new JButton("-");
	mod= new JButton("%");
	max= new JButton("MAX");
	min= new JButton("MIN");
	add.setVisible(true);
	
	
	
	mul.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			outputAns.setText(firstField.getText()+" "+ "x" + secondField.getText()+" "+"= " + multiplication());			
		}


	});
	
	div.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			outputAns.setText(firstField.getText()+" "+ "/" + secondField.getText()+" "+"= " + division());			
		}


	});
	
	
	//give each buttons their actions and 
	add.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			outputAns.setText(firstField.getText()+" "+ "+" + secondField.getText()+" "+"= " + addition());			
		}
	});
	

	sub.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			outputAns.setText(firstField.getText()+" "+ "- " + secondField.getText()+" "+"= " + substraction());	
		}		
	});
	
	mod.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			outputAns.setText(firstField.getText()+" "+ "% " + secondField.getText()+" "+"= " + modulus());
			
		}
	});
	
	max.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			outputAns.setText("MAX is "+"= " + maximum());
			
		}
		
	});
	
	min.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			outputAns.setText("MIN is "+"= " + minimum());
			
		}
		
	});
	
	
	//add everything to the frame
	JPanel p= new JPanel();
	p.setLayout(new GridLayout(7,2,5,5));
	p.add(firstLabel);
	p.add(firstField);
	p.add(secondLabel);
	p.add(secondField);
	p.add(answerLabel);
	p.add(outputAns);
	p.add(mul);
	p.add(div);
	p.add(add);
	p.add(sub);
	p.add(mod);
	p.add(max);
	p.add(min);
	
	
	JFrame frame= new JFrame("Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setContentPane(p);
	frame.pack();
	frame.setVisible(true);

	}
	
	public static void convert() {
		String text= firstField.getText();
		xaxis1= Float.valueOf(text.trim()).floatValue();
		String text2= secondField.getText();
		xaxis2= Float.valueOf(text2.trim()).floatValue();
	}
	
	public static String division() {
		float div;
		convert();
		div= xaxis1/xaxis2;
		String y= Float.toString(div);
	
		return y;
	}
	
	
	public static String multiplication() {
		float mul;
		convert();
		mul= xaxis1*xaxis2;
		String y= Float.toString(mul);
	
		return y;
	}
	
	public static String addition() {
		float sum;
		convert();
		sum= xaxis1+xaxis2;
		String y= Float.toString(sum);
	
		return y;
	}
	public static String substraction() {
		float sub;
		convert();
		sub= xaxis1-xaxis2;
		String y= Float.toString(sub);
	
		return y;
	}
	public static String modulus() {
		float mod;
		convert();
		mod= xaxis1%xaxis2;
		String y= Float.toString(mod);
	
		return y;
	}
	
	public static String maximum() {
		float max;
		convert();
		if(xaxis1>xaxis2) {
			max=xaxis1;
			String y= Float.toString(max);
			return y;
			
		}else if(xaxis1==xaxis2) {
			String c= "They are equal";
			return c;
			
		}else {
				max=xaxis2;
				String y= Float.toString(max);
				return y;
			}
		}
	
	public static String minimum() {
		float min;
		convert();
		if(xaxis1>xaxis2) {
			min=xaxis2;
			String y= Float.toString(min);
			return y;
			
		}else if(xaxis1==xaxis2) {
			String c= "They are equal";
			return c;
			
		}else {
				min=xaxis1;
				String y= Float.toString(min);
				return y;
			}
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
