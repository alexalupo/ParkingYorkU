package main;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import service.UserService;
import template.*;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;



public class SignUpUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField emailField;
	private JTextField passwordField;
	private JTextField nameField;
	private final JLabel warningLabel;
	private final JLabel successLabel;
	private JButton successBtn;
	
	private final UserService userService;
	public static final String userPath = "user.csv";

	
	/*
	/**
	 * Launch the application.
	*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpUI frame = new SignUpUI();
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
	public SignUpUI() {
		this.userService = new UserService();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel whatAreYouLabel = new JLabel("Enter your information then press the button that corresponds to your status");
		whatAreYouLabel.setBounds(15, 20, 494, 16);
		contentPane.add(whatAreYouLabel);
		
		JButton studentBtn = new JButton("Student");
		studentBtn.setBounds(25, 266, 117, 29);
		contentPane.add(studentBtn);
		
		JButton nonFacultyBtn = new JButton("Non-Faculty");
		nonFacultyBtn.setBounds(168, 266, 117, 29);
		contentPane.add(nonFacultyBtn);
		
		JButton facultyBtn = new JButton("Faculty");
		facultyBtn.setBounds(312, 266, 117, 29);
		contentPane.add(facultyBtn);
		
		JButton visitorBtn = new JButton("Visitor");
		visitorBtn.setBounds(461, 266, 117, 29);
		contentPane.add(visitorBtn);
		
		JLabel nameLabel = new JLabel("Full Name");
		nameLabel.setBounds(400, 85, 86, 16);
		
		
		nameField = new JTextField();
		nameField.setBounds(410, 117, 130, 26);
		nameField.setColumns(10);
		
		
		warningLabel = new JLabel("One or more options are not filled out");
		warningLabel.setForeground(new Color(255, 4, 0));
		warningLabel.setBounds(326, 223, 258, 16);
		
		
		successLabel = new JLabel("Success: User has been created.");
		successLabel.setForeground(new Color(97, 173, 152));
		successLabel.setBounds(326, 223, 258, 16);
		
		successBtn = new JButton("Return to Menu");
		successBtn.setBounds(326, 170, 130, 29);
		successBtn.addActionListener(e -> {
			dispose();
			new ChoiceUI();
		});
		
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setToolTipText("Return to the Previous Screen");
		returnBtn.setBounds(480, 6, 100, 29);
		contentPane.add(returnBtn);
		returnBtn.addActionListener(e -> {
			dispose();
			new ChoiceUI();
		});
		
		
		emailField = new JTextField();
		emailField.setBounds(86, 117, 130, 26);
		emailField.setColumns(10);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(70, 85, 61, 16);
		
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(70, 193, 61, 16);
		
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(86, 221, 130, 26);
		
		contentPane.add(passwordField);
		contentPane.add(emailField);
		contentPane.add(emailLabel);
		contentPane.add(passwordLabel);
		contentPane.add(nameLabel);
		contentPane.add(nameField);
		
		handleUserCreation(facultyBtn, "faculty");
		handleUserCreation(nonFacultyBtn, "nonfaculty");
		handleUserCreation(studentBtn, "student");
		handleUserCreation(visitorBtn, "visitor");
		
	}
	
    private void handleUserCreation(JButton btn, String userType) {
        btn.addActionListener(e -> {
            String email = emailField.getText().trim();
            String name = nameField.getText().trim();
            String password = passwordField.getText().trim();

            if (email.isEmpty() || name.isEmpty() || password.isEmpty()) {
                contentPane.add(warningLabel);
                contentPane.repaint();
            } else {
            	try {
            		User user = null;

            		switch (userType) {
            			case "student":
            				user = new Student(name, userService.getNextId(userPath), email, password, userType.equals("visitor"));
            				break;
            			case "faculty":
            				user = new FacultyMember(name, userService.getNextId(userPath), email, password, userType.equals("visitor"));
            				break;
            			case "nonfaculty":
            				user = new NonFacultyMember(name, userService.getNextId(userPath), email, password, userType.equals("visitor"));
            				break;
            			case "visitor":
            				user = new Visitor(name, userService.getNextId(userPath), email, password, userType.equals("visitor"));
            				break;
            		}
            		
            		userService.createUser(userPath, user);
            		
                    contentPane.remove(warningLabel);
                    contentPane.add(successLabel);
                    contentPane.add(successBtn);
                    contentPane.repaint();
                    
            	} catch (IOException e1) {
            		e1.printStackTrace();
            	}
            }
        });
    }
}
