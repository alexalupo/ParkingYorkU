package main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.csvreader.CsvReader;

import facade.UserUI;
import managerUI.ManagerUI;
import singleton.SuperManager;
import template.FacultyMember;
import template.Manager;
import template.NonFacultyMember;
import template.Student;
import template.Visitor;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField emailField;
	private JTextField passwordField;
	private JLabel warningLabel;

	public LoginUI() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Login");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel usrLabel = new JLabel("email");
		usrLabel.setBounds(66, 70, 34, 16);
		usrLabel.setVerticalAlignment(SwingConstants.TOP);
		usrLabel.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setVerticalAlignment(SwingConstants.TOP);
		passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
		passwordLabel.setBounds(66, 136, 65, 16);
		
		emailField = new JTextField();
		emailField.setBounds(66, 98, 130, 26);
		emailField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(66, 164, 130, 26);
		
		JButton usrBtn = new JButton("user");
		usrBtn.setToolTipText("Login to User Account");
		usrBtn.setBounds(99, 248, 117, 29);
		contentPane.add(usrBtn);
		
		JButton managerBtn = new JButton("manager");
		managerBtn.setToolTipText("Login to Manager Account");
		managerBtn.setBounds(268, 248, 117, 29);
		contentPane.add(managerBtn);
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setToolTipText("Return to the Previous Screen");
		returnBtn.setBounds(373, 6, 117, 29);
		contentPane.add(returnBtn);
		
		warningLabel = new JLabel("One Or More Options Are Not Filled Out");
		warningLabel.setForeground(new Color(255, 4, 0));
		warningLabel.setBounds(120, 220, 258, 16);
		
		contentPane.add(usrLabel);
		contentPane.add(emailField);
		contentPane.add(passwordLabel);
		contentPane.add(passwordField);
		
		usrBtn.addActionListener(e -> handleLogin("user"));
		
		managerBtn.addActionListener(e -> handleLogin("manager"));
		
		returnBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ChoiceUI();
			}
			
		});	
	}
	
	private void handleLogin(String userType) {
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();
        
        if (email.isEmpty() || password.isEmpty()) {
            contentPane.add(warningLabel);
            contentPane.repaint();
        } else {
        	contentPane.remove(warningLabel);
			contentPane.repaint();
			try {
				if(!loginCheck(email, password, userType)) {
					warningLabel.setText("Login Failed");
					contentPane.add(warningLabel);
		            contentPane.repaint();
		        }
			} catch (IOException e) {
				e.printStackTrace();
			}

        }
	}
	
	private boolean loginCheck(String email, String password, String userType) throws IOException {
        String path = "user.csv";
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();
        
        while (reader.readRecord()) {
            String[] newLine = new String[6];
            newLine[0] = reader.get("name");
            newLine[1] = reader.get("id");
            newLine[2] = reader.get("email");
            newLine[3] = reader.get("password");
            newLine[4] = reader.get("isValidated");
            newLine[5] = reader.get("userType");
            
            if (newLine[2].equals(email) && newLine[3].equals(password)) {
                if (userType.equals("user") && isUser(newLine[5])) {
                	dispose();
                    createUser(newLine);
                    break;
                } else if (userType.equals("manager") && isManager(newLine[5])) {
                	dispose();
                	createUser(newLine);
                	break;
                }
                
            }
        }
        return false;
	}
	
	private boolean isUser(String userType) {
		if (userType.equals("student") || userType.equals("faculty") || userType.equals("nonfaculty") || userType.equals("visitor")) {
			return true;
		}
		return false;
	}
	
	private boolean isManager(String userType) {
		if (userType.equals("manager") || userType.equals("supermanager")) {
			return true;
		}
		return false;
	}
	
	private void createUser(String[] user) {
		switch(user[5]) {
		case "student":
			new UserUI(new Student(user[0], Integer.parseInt(user[1]), user[2], user[3], getValidation(user[4])));
			break;
		case "faculty":
			new UserUI(new FacultyMember(user[0], Integer.parseInt(user[1]), user[2], user[3], getValidation(user[4])));
			break;
		case "nonfaculty":
			new UserUI(new NonFacultyMember(user[0], Integer.parseInt(user[1]), user[2], user[3], getValidation(user[4])));
			break;
		case "visitor":
			new UserUI(new Visitor(user[0], Integer.parseInt(user[1]), user[2], user[3], getValidation(user[4])));
			break;
		case "supermanager":
			SuperManager superManager = SuperManager.getInstance();
			new ManagerUI(superManager);
			break;
		case "manager":
			new ManagerUI(new Manager(user[0], Integer.parseInt(user[1]), user[2], user[3], true));
			break;
		}
	}
	
	private boolean getValidation(String s) {
		if(s.equals("t")) {
			return true;
		} else {
			return false;
		}
	}
}

