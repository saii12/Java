package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc {

	private JFrame frmMycalcV;
	private JTextField txtDsp;
	
	private int num1 = 0;
	private int num2 = 0;
	private int operator = 0; // 1:plus, 2:minus, 3:multi, 4:div

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMycalcV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalcV = new JFrame();
		frmMycalcV.setTitle("MyCalc v1.0");
		frmMycalcV.setBounds(100, 100, 329, 396);
		frmMycalcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalcV.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setBackground(Color.WHITE);
		txtDsp.setEditable(false);
		txtDsp.setFont(new Font("굴림", Font.PLAIN, 24));
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 289, 55);
		frmMycalcV.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(22, 75, 55, 55);
		frmMycalcV.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(92, 75, 55, 55);
		frmMycalcV.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(159, 75, 55, 55);
		frmMycalcV.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(226, 75, 55, 55);
		frmMycalcV.getContentPane().add(btnDiv);
		
		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(226, 140, 55, 55);
		frmMycalcV.getContentPane().add(btnMulti);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(22, 140, 55, 55);
		frmMycalcV.getContentPane().add(btn4);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(159, 140, 55, 55);
		frmMycalcV.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(92, 140, 55, 55);
		frmMycalcV.getContentPane().add(btn5);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(226, 205, 55, 55);
		frmMycalcV.getContentPane().add(btnMinus);
		
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDsp.setText("1");
				
				num1 = 1;
				
			}
		});
		btn1.setBounds(22, 205, 55, 55);
		frmMycalcV.getContentPane().add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(159, 205, 55, 55);
		frmMycalcV.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = 2;
				
			}
		});
		btn2.setBounds(92, 205, 55, 55);
		frmMycalcV.getContentPane().add(btn2);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operator = 1;
				
			}
		});
		btnPlus.setBounds(226, 270, 55, 55);
		frmMycalcV.getContentPane().add(btnPlus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(22, 270, 55, 55);
		frmMycalcV.getContentPane().add(btn0);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
						
				if(operator == 1) {
					result = num1 + num2;
				}else if(operator == 2) {
					result = num1 - num2;
				}else if(operator == 3) {
					result = num1 * num2;
				}else if(operator == 4) {
					result = num1 / num2;
				}
				
				txtDsp.setText(""+result);
				
			}
		});
		btnEq.setBounds(159, 270, 55, 55);
		frmMycalcV.getContentPane().add(btnEq);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(92, 270, 55, 55);
		frmMycalcV.getContentPane().add(btnCancel);
	}

}
