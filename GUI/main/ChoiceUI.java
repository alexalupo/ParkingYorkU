package main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ChoiceUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoiceUI frame = new ChoiceUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the frame.
	 */
	public ChoiceUI() {
		//JFrame frame = new JFrame();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome To the YorkU Parking System");
		welcomeLabel.setBounds(115, 6, 242, 16);
		contentPane.add(welcomeLabel);
		
		JLabel choiceLabel = new JLabel("Would You Like To...");
		choiceLabel.setBounds(162, 54, 137, 16);
		contentPane.add(choiceLabel);
		
		JButton signUpBtn = new JButton("Sign Up");
		signUpBtn.setToolTipText("Sign Up to the Parking Service");
		signUpBtn.setBounds(64, 129, 117, 29);
		contentPane.add(signUpBtn);
		
		
		JButton logInBtn = new JButton("Log In");
		logInBtn.setToolTipText("Log In to the Parking Service");
		logInBtn.setBounds(274, 129, 117, 29);
		contentPane.add(logInBtn);
		
		
		JButton userValiBtn = new JButton("User Validation");
		userValiBtn.setToolTipText("Check if your account is valid");
		userValiBtn.setBounds(160, 180, 130, 29);
		contentPane.add(userValiBtn);
		
		
		logInBtn.addActionListener(e -> {
			dispose();
			new LoginUI();
		});
		
		signUpBtn.addActionListener(e -> {
			dispose();
			new SignUpUI();
		});
		
		userValiBtn.addActionListener(e -> {
			dispose();
			new UserValCheck();
		});
	}

}
