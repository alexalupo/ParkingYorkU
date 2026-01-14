package managerUI;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.ChoiceUI;
import singleton.SuperManager;
import template.User;

public class ManagerUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton parkingLotToggle;
	private JButton createManagement;
	private JButton userToggle;
	private JButton createParkingLot;
	private JLabel label;
	private JButton parkingSpaceToggle;
	private final int y = 266;
	private final int width = 117;
	private final int height = 29;
	
	public static final String userPath = "user.csv";
	/* 
	 * There are 4 buttons for the Manager to see
	 * 1: Enable or Disable Parking lots
	 * 2: Create new Management Accounts (SUPER MANAGER ONLY)
	 * 3: Validate Users
	 * 4: Add OR Remove Parking lots
	 * 
	 * */
	
	public ManagerUI(User user) {
		setVisible(true);
		setTitle("Manager Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		parkingLotToggle = new JButton("Toggle Parking Lot");
		parkingLotToggle.setBounds(25, y, width + 100, height);
		
		createManagement = new JButton("Create Management Accounts");
		createManagement.setBounds(25, 100, width + 100, height);
		
		userToggle = new JButton("Validate Users");
		userToggle.setBounds(312, y, width, height);
		
		parkingSpaceToggle = new JButton("Toggle Parking Space");
		parkingSpaceToggle.setBounds(180, 180, width+100, height);
		
		createParkingLot = new JButton("Create or Remove Parking Lot");
		createParkingLot.setBounds(312, 100, width + 100, height);
		
		label = new JLabel();
		label.setBounds(25, 40, 400, height);
		label.setForeground(new Color(255, 4, 0));
		
		contentPane.add(parkingLotToggle);
		contentPane.add(createManagement);
		contentPane.add(userToggle);
		contentPane.add(createParkingLot);
		contentPane.add(parkingSpaceToggle);
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setBounds(400, 6, 100, 29);
		contentPane.add(returnBtn);

		contentPane.repaint();
		
		userToggle.addActionListener(e -> {
			dispose();
			new UserValToggleUI(user);
		});
		
		createParkingLot.addActionListener(e -> {
			dispose();
			new CreateParkingUI(user);
		});
		
		parkingLotToggle.addActionListener(e -> {
			dispose();
			new ToggleParkingUI(user);
		});
		

		createManagement.addActionListener(e -> {
			if (user instanceof SuperManager) {
				try {
					((SuperManager) user).createManagementAccount(userPath);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				label.setText("Success: Manager Account was created.");
				contentPane.add(label);
				label.repaint();
			} else {
				label.setText("Avaliable for Super Manager only.");
				contentPane.add(label);
				label.repaint();
			}
		});
		
		returnBtn.addActionListener(e -> {
			dispose();
			new ChoiceUI();
		});
		
		parkingSpaceToggle.addActionListener(e ->{
			dispose();
			new ToggleSpaceUI(user);
		});
	}
}
