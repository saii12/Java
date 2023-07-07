package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TextField 실습\r\n");
		lblNewLabel.setBounds(12, 27, 100, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디\r\n");
		lblNewLabel_1.setBounds(23, 52, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setBounds(23, 80, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("휴대폰");
		lblNewLabel_1_2.setBounds(23, 108, 57, 15);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(79, 49, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(79, 77, 116, 21);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(79, 105, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lbUid = new JLabel("결과:");
		lbUid.setBounds(320, 52, 102, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과:");
		lbName.setBounds(317, 80, 105, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과:");
		lbHp.setBounds(316, 108, 106, 15);
		frame.getContentPane().add(lbHp);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : " + uid);
			
				
			}
		});
		btnUid.setBounds(208, 48, 97, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name = txtName.getText();
				lbName.setText("결과 : " + Name);
			}
		});
		btnName.setBounds(208, 76, 97, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 핸들러구현(design창에서 버튼 더블클릭)
				
				String Hp = txtHp.getText();
				lbHp.setText("결과 : " + Hp);
			}
		});
		btnHp.setBounds(207, 104, 97, 23);
		frame.getContentPane().add(btnHp);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Component Test");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_3.setBounds(100, 9, 167, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Button 실습");
		lblNewLabel_4.setBounds(23, 166, 89, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("버튼1 클릭...");
				
			}
		});
		btn1.setBounds(23, 191, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(137, 191, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) { // '예' 누를 때
					System.out.println("YES 클릭...");
				}else {
					System.out.println("NO 클릭..."); // '아니오' 누를 때
				}
			}
		});
		btn3.setBounds(250, 191, 97, 23);
		frame.getContentPane().add(btn3);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 267, 57, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(76, 267, 57, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(137, 267, 57, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(198, 267, 53, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(255, 267, 57, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("선택한 과일 :");
		lbChkFruit.setBounds(23, 296, 399, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText()); 
				}
				
				if(chk2.isSelected()) {
					fruits.add(chk2.getText()); 
				}
				
				if(chk3.isSelected()) {
					fruits.add(chk3.getText()); 
				}
				
				if(chk4.isSelected()) {
					fruits.add(chk4.getText()); //chk4 선언, 생성이 앞에 있어야 참조가 가능함. 앞에 없어서 참조가 안 됐던 것
				}
			
				if(chk5.isSelected()) {
					fruits.add(chk5.getText()); 
				}
				
				lbChkFruit.setText("선택한 과일 : " + fruits);
				
			}
		});
		
		btnChkFruit.setBounds(320, 267, 97, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_2 = new JLabel("CheckBox 실습");
		lblNewLabel_2.setBounds(28, 246, 99, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 실습");
		lblNewLabel_5.setBounds(23, 343, 120, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(23, 362, 57, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(86, 364, 57, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale); //그룹화 하면 하나만 선택가능하게 됨
		
		JLabel lbGender = new JLabel("선택결과:");
		lbGender.setBounds(23, 391, 399, 15);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdMale.isSelected()) {
					lbGender.setText("선택결과 : " + rdMale.getText()); //텍스트 입력할 땐 .setText, 리스트에 더할 땐 .add
				} else {
					lbGender.setText("선택결과 : " + rdFemale.getText());
				}
				
			} //lbGender를 참조하려면 lbGender선언,생성이 위에 있어야함
		});
		btnGender.setBounds(151, 362, 97, 23);
		frame.getContentPane().add(btnGender);
	}
}
