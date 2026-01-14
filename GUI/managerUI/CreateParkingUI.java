package managerUI;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import observer.ParkingLot;
import service.ManagerService;
import service.UserService;
import template.User;

public class CreateParkingUI extends JFrame {
	private final JLabel warningLabel;
	private static final long serialVersionUID = 1L;

	
	private ManagerService managerService;
	private JPanel contentPane;
	private JTextField nameTextField;
	private JButton addParkingBtn;
	private JButton removeParkingBtn;
	private JLabel messageLabel = new JLabel("Enter a name for the parking lot");
	
	private UserService userService = new UserService();
	
	public static final String parkLotPath = "parkingLot.csv";
	public static final String parkSpacePath = "parkingSpace.csv";
	public static final String bookingPath = "booking.csv";
	
	public CreateParkingUI(User user) {
		this.managerService = new ManagerService();
		setVisible(true);
		setTitle("Create Parking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		messageLabel.setBounds(38, 19, 339, 16);
		
		warningLabel = new JLabel();
		warningLabel.setBounds(326, 223, 258, 16);
		
		addParkingBtn = new JButton("Add Parking Lot");
		addParkingBtn.setBounds(370, 300, 160, 36);
		
		removeParkingBtn = new JButton("Remove Parking Lot");
		removeParkingBtn.setBounds(130, 300, 160, 36);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(220, 150, 130, 26);
		
		handleParking(addParkingBtn, true);
		handleParking(removeParkingBtn, false);
		
		contentPane.add(addParkingBtn);
		contentPane.add(removeParkingBtn);
		contentPane.add(nameTextField);
		contentPane.add(messageLabel);
		JButton returnBtn = new JButton("Return");
		returnBtn.setToolTipText("Return to the Previous Screen");
		returnBtn.setBounds(500, 6, 100, 29);
		contentPane.add(returnBtn);
		returnBtn.addActionListener(e -> {
			dispose();
			new ManagerUI(user);
		});
	}
	
	
	private void handleParking(JButton btn, boolean flag) {
		
		btn.addActionListener(e -> {
			String name = nameTextField.getText().trim().toLowerCase();
			if(name.equals("")) {
				warningLabel.setForeground(new Color(255, 4, 0));
				warningLabel.setText("Text field is empty");
			} else if (flag) {
				try {
					int lotID = userService.getNextId(parkLotPath);
					ParkingLot parkingLot = new ParkingLot(lotID, true, name);
					
					managerService.addParkingLot(parkLotPath, parkSpacePath, parkingLot);
					
					warningLabel.setText("Parking Lot successfully added");
					warningLabel.setForeground(new Color(255, 4, 0));
				} catch (IOException e1) {
					warningLabel.setText("There is already a parking lot named '"+name+"'");
					warningLabel.setForeground(new Color(255, 4, 0));
				}
			} else {
				try {
					managerService.removeParkingLot(parkLotPath, parkSpacePath, bookingPath, name.trim());
					
					warningLabel.setText("Parking Lot successfully added");
					warningLabel.setForeground(new Color(255, 4, 0));
				} catch (IOException e1) {
					warningLabel.setText("There is no parking lot named '"+name+"'");
					warningLabel.setForeground(new Color(255, 4, 0));
				}
			}
			contentPane.add(warningLabel);
			contentPane.repaint();
			
		});
	}
}

