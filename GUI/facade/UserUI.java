package facade;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.ChoiceUI;
import template.User;

public class UserUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public UserUI(User user) {
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("User Menu");
		setBounds(100, 100, 496, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* There are 3 buttons for the User to see
		 * 1: Create a Booking for a parking space,
		 * 2: Cancel a Booking
		 * 3: Extend a Booking
		 * */
		
		JLabel usrLabel = new JLabel("Welcome " + user.getName() + ", choose your booking option");
		usrLabel.setBounds(66, 70, 500, 500);
		usrLabel.setVerticalAlignment(SwingConstants.TOP);
		usrLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(usrLabel);
		
		JButton createBtn = new JButton("Create Booking");
		createBtn.setBounds(25, 250, 150, 29);
		contentPane.add(createBtn);
		
		JButton cancelBtn = new JButton("Cancel Booking");
		cancelBtn.setBounds(168, 250, 150, 29);
		contentPane.add(cancelBtn);
		
		JButton extendBtn = new JButton("Extend Booking");
		extendBtn.setBounds(312, 250, 150, 29);
		contentPane.add(extendBtn);
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setBounds(350, 6, 100, 29);
		contentPane.add(returnBtn);
		
		if(!user.isValidated()) {
			createBtn.setEnabled(false);
			cancelBtn.setEnabled(false);
			extendBtn.setEnabled(false);
			usrLabel.setText("Welcome " + user.getName() + ", please wait for verification from management");
			contentPane.add(returnBtn);
		}
		
		/* ADD ACTION LISTENERS */
		createBtn.addActionListener(e -> {
			dispose();
			try {
				new CreateBookingUI(user);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		cancelBtn.addActionListener(e -> {
			dispose();
			try {
				new CancelBookingUI(user);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		extendBtn.addActionListener(e -> {
			dispose();
			try {
				new ExtendBookingUI(user);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		returnBtn.addActionListener(e -> {
			dispose();
			new ChoiceUI();
		});
	}
}
