package managerUI;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import service.ManagerService;
import template.User;



public class UserValToggleUI extends JFrame {
	private final ManagerService managerService;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final int x = 220;
	private JTextField input;
	private JLabel output;
	private JButton toggleFalse;
	private JButton toggleTrue;
	
	public static final String userPath = "user.csv";
	
	public UserValToggleUI(User user) {
		this.managerService = new ManagerService();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Validation Site");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		output = new JLabel();
		output.setBounds(x, 100, 160, 30);
		
		toggleFalse = new JButton("Toggle False");
		toggleFalse.setBounds(370, 300, 130, 36);
		
		
		toggleTrue = new JButton("Toggle True");
		toggleTrue.setBounds(130, 300, 130, 36);
		
		
		handleToggleBtn(toggleTrue, true);
		handleToggleBtn(toggleFalse, false);
		
		contentPane.add(toggleFalse);
		contentPane.add(toggleTrue);
		
		JLabel inputLabel = new JLabel("Enter your Email:");
		inputLabel.setBounds(x, 150, 130, 26);
		
		input = new JTextField();
		input.setBounds(x, 180, 130, 26);
		
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setToolTipText("Return to the Previous Screen");
		returnBtn.setBounds(500, 6, 100, 29);
		
		returnBtn.addActionListener(e -> {
			dispose();
			new ManagerUI(user);
		});
		
		contentPane.add(returnBtn);
		contentPane.add(input);
		contentPane.add(inputLabel);
		contentPane.add(returnBtn);
	}
	
	private void handleToggleBtn (JButton toggle, boolean flag) {
		toggle.addActionListener(e -> {
			try {
				String email = input.getText().trim();
				if(email.equals("")) {
					output.setForeground(new Color(255, 0, 0));
					output.setText("Text Field Is Empty");
				} else {
					managerService.validateUser(userPath, email, flag);
					output.setForeground(new Color(0, 0, 255));
					
					if (flag) {
						output.setText("Email is verified");
					} else {
						output.setText("Email is NOT verified");
					}
				}
				contentPane.add(output);
				contentPane.repaint();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		});
	}
}
