package eg.edu.alexu.csd.oop.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame {
	calc his = new calc();
	public static double getResult() {
		return result;
	}


	private JPanel contentPane;
	public static double a=0,b=0,result=0;
	public static int operator=0;

	public static double getA() {
		return a;
	}
	public static double getB() {
		return b;
	}
	public static int getOperator() {
		return operator;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	JFrame f;
	JTextPane t;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndivde,btnmultiply,btnminus,btnplus,btnclear,btnequal,btndelete,btnsave,btndot,btnload,btnprev,btnnext;
	private final JLabel lblClickCTo = new JLabel("**click C to start new operation\r\n");
	private final JLabel lblMadeBy = new JLabel("Made By : Omar Emam");
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 458);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane t = new JTextPane();
		t.setEditable(false);
		t.setFont(new Font("Tahoma", Font.PLAIN, 23));
		t.setBounds(12, 13, 264, 64);
		contentPane.add(t);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				his.save();
				t.setText("Saved Successfully");
				
			}
		});
		btnSave.setBackground(Color.CYAN);
		btnSave.setForeground(Color.BLUE);
		btnSave.setBounds(12, 90, 71, 36);
		contentPane.add(btnSave);
		
		JButton btnload = new JButton("Load");
		btnload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				his.load();
				t.setText("Loaded Successfully");
				
			}
		});
		btnload.setBackground(Color.CYAN);
		btnload.setForeground(Color.BLUE);
		btnload.setBounds(81, 90, 71, 36);
		contentPane.add(btnload);
		
		JButton btnPrev = new JButton("Prev");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans1 = his.prev();
					t.setText(ans1);
				

				
			}
		});
		btnPrev.setBackground(Color.CYAN);
		btnPrev.setForeground(Color.BLUE);
		btnPrev.setBounds(150, 90, 61, 36);
		contentPane.add(btnPrev);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans2=his.next();
				
					t.setText(ans2);
		
			}
		});
		btnNext.setBackground(Color.CYAN);
		btnNext.setForeground(Color.BLUE);
		btnNext.setBounds(205, 90, 71, 36);
		contentPane.add(btnNext);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("7"));
				
			}
		});
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBackground(Color.BLUE);
		btn7.setBounds(12, 139, 61, 36);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				t.setText(t.getText().concat("8"));
				
			}
		});
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBackground(Color.BLUE);
		btn8.setBounds(81, 139, 61, 36);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("9"));
				
			}
		});
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBackground(Color.BLUE);
		btn9.setBounds(150, 139, 61, 36);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("6"));
				
			}
		});
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBackground(Color.BLUE);
		btn6.setBounds(150, 188, 61, 36);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("5"));
				
			}
		});
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBackground(Color.BLUE);
		btn5.setBounds(81, 188, 61, 36);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("4"));
				
			}
		});
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBackground(Color.BLUE);
		btn4.setBounds(12, 188, 61, 36);
		contentPane.add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("3"));
				
			}
		});
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBackground(Color.BLUE);
		btn3.setBounds(150, 239, 61, 36);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("2"));
				
			}
		});
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBackground(Color.BLUE);
		btn2.setBounds(81, 239, 61, 36);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t.setText(t.getText().concat("1"));
				
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBackground(Color.BLUE);
		btn1.setBounds(12, 239, 61, 36);
		contentPane.add(btn1);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(t.getText());
				operator=1;
				t.setText("");
			}
		});
		btnplus.setForeground(Color.WHITE);
		btnplus.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnplus.setBackground(Color.BLUE);
		btnplus.setBounds(150, 290, 61, 36);
		contentPane.add(btnplus);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(t.getText().concat("."));
			}
		});
		btndot.setVerticalAlignment(SwingConstants.BOTTOM);
		btndot.setForeground(Color.WHITE);
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btndot.setBackground(Color.BLUE);
		btndot.setBounds(215, 339, 61, 36);
		contentPane.add(btndot);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText(t.getText().concat("0"));
				
			}
		});
		btn0.setForeground(Color.WHITE);
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0.setBackground(Color.BLUE);
		btn0.setBounds(12, 290, 61, 36);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("");
			}
		});
		btnC.setForeground(Color.WHITE);
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnC.setBackground(Color.BLUE);
		btnC.setBounds(215, 139, 61, 36);
		contentPane.add(btnC);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(t.getText());
				operator=4;
				t.setText("");
			}
		});
		btndivide.setForeground(Color.WHITE);
		btndivide.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btndivide.setBackground(Color.BLUE);
		btndivide.setBounds(215, 239, 61, 36);
		contentPane.add(btndivide);
		
		JButton btnmultiplty = new JButton("X");
		btnmultiplty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(t.getText());
				operator=3;
				t.setText("");
			}
		});
		btnmultiplty.setForeground(Color.WHITE);
		btnmultiplty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnmultiplty.setBackground(Color.BLUE);
		btnmultiplty.setBounds(215, 290, 61, 36);
		contentPane.add(btnmultiplty);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(t.getText());
				operator=2;
				t.setText("");
			}
		});
		btnminus.setForeground(Color.WHITE);
		btnminus.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnminus.setBackground(Color.BLUE);
		btnminus.setBounds(81, 290, 61, 36);
		contentPane.add(btnminus);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Double.parseDouble(t.getText());
				int flag =0;
				switch(operator)
				{
					case 1: result=a+b;
						break;
			
					case 2: result=a-b;
						break;
			
					case 3: result=a*b;
						break;
			
					case 4: 
						if(b==0) {
							flag=1;
						}
						result=a/b;
						break;
			
					default: result=0;
				}
				if(flag==1) {
					t.setText("Math Error : cannot divide by zero :(");
					flag=0;
				}
				else {
			
				t.setText(""+result);
				String A = Double.toString(GUI.getA());
				String B = Double.toString(GUI.getB());
				String C;
				switch(GUI.getOperator())
				{
					case 1: C=" + ";
						break;
			
					case 2: C=" - ";
						break;
			
					case 3: C=" x ";
						break;
			
					case 4: C=" / ";
						break;
			
					default: C=" ";
				}
				String D = his.getResult();
				String s = A+C+B+" = "+D;
				his.input(s);
				}
			}
		});
		btnequal.setForeground(Color.WHITE);
		btnequal.setBackground(Color.GREEN);
		btnequal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnequal.setBounds(12, 339, 199, 36);
		contentPane.add(btnequal);
		
		JButton btndelete = new JButton("Del");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=t.getText();
				t.setText("");
				for(int i=0;i<s.length()-1;i++)
				t.setText(t.getText()+s.charAt(i));
			}
		});
		btndelete.setForeground(Color.WHITE);
		btndelete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btndelete.setBackground(Color.BLUE);
		btndelete.setBounds(215, 188, 61, 36);
		contentPane.add(btndelete);
		lblClickCTo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblClickCTo.setBounds(12, 362, 292, 36);
		contentPane.add(lblClickCTo);
		lblMadeBy.setBounds(114, 380, 249, 36);
		contentPane.add(lblMadeBy);
		lblMadeBy.setForeground(Color.WHITE);
		lblMadeBy.setFont(new Font("Tahoma", Font.BOLD, 15));
		

		
		
	}
}
