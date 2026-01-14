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

public class ToggleSpaceUI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private ManagerService service = new ManagerService();
	private JLabel warningLabel = new JLabel();
	private JLabel messageLabel = new JLabel("Please Enter the Name of the Parking Lot ");
	
	public static final String parkLotPath = "parkingLot.csv";
	public static final String parkSpacePath = "parkingSpace.csv";
	public static final String bookingPath = "booking.csv";
	
	public ToggleSpaceUI(User user) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Toggle Space");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		messageLabel.setBounds(98, 54, 500, 16);
		contentPane.add(messageLabel);
		
		nameField = new JTextField();
		nameField.setBounds(161, 106, 130, 26);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setBounds(327, 6, 117, 29);
		contentPane.add(returnBtn);
		
		JButton confirmBtn = new JButton("Confirm");
		confirmBtn.setBounds(185, 188, 117, 29);
		contentPane.add(confirmBtn);
		
		warningLabel.setBounds(85, 161, 283, 16);
		
		
		
		returnBtn.addActionListener(e -> {
			dispose();
			new ManagerUI(user);
		});
		
		confirmBtn.addActionListener(e -> {
			String s = nameField.getText().trim().toLowerCase();
			try {
				if(service.getLotIDByLotName(parkLotPath, s).equals("null")) {
					warningLabel.setForeground(new Color(255, 0, 0));
					warningLabel.setText("Parking lot '" +s+ "' not found");
					contentPane.add(warningLabel);
				}else {
					contentPane.remove(warningLabel);
					contentPane.remove(confirmBtn);
					selectParking(user, service.getLotIDByLotName(parkLotPath, s), s);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			contentPane.repaint();
			
		});
	}
	
	private void selectParking(User user, String lotID, String name) {
		nameField.setText("");
		messageLabel.setText("Please Enter Parking Space Number Between 0-99");
		
		JButton enableBtn = new JButton("Enable");
		enableBtn.setBounds(53, 209, 112, 29);
		contentPane.add(enableBtn);
		
		JButton disableBtn = new JButton("Disable");
		disableBtn.setBounds(283, 209, 117, 29);
		contentPane.add(disableBtn);
		
		contentPane.repaint();
		
		enableBtn.addActionListener(e -> {
			try {
				int i = Integer.parseInt(nameField.getText().trim());
				if(i < 0 || i > 99) {
					warningLabel.setForeground(new Color(255, 0, 0));
					warningLabel.setText("Warning: Invalid Input");
				}else {
					try {
						service.parkingSpaceEnableDisable(
								parkSpacePath, bookingPath, 
								lotID, Integer.toString(i), true
								);
						warningLabel.setForeground(new Color(0, 0, 255));
						warningLabel.setText("Parking space '" + i + "' now enabled for '"+name+"'");	
					}catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}catch(Exception e2) {
				warningLabel.setForeground(new Color(255, 0, 0));
				warningLabel.setText("Warning: Invalid Input");
			}
			contentPane.add(warningLabel);
			contentPane.repaint();
		});
		
		disableBtn.addActionListener(e -> {
			try {
				int i = Integer.parseInt(nameField.getText().trim());
				if(i < 0 || i > 99) {
					warningLabel.setForeground(new Color(255, 0, 0));
					warningLabel.setText("Warning: Invalid Input");
				}else {
					try {
						service.parkingSpaceEnableDisable(
								parkSpacePath, bookingPath, 
								lotID, Integer.toString(i), false
								);
						warningLabel.setForeground(new Color(0, 0, 255));
						warningLabel.setText("Parking space '" + i + "' now disable for '"+name+"'");	
					}catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			} catch(Exception e2) {
				warningLabel.setForeground(new Color(255, 0, 0));
				warningLabel.setText("Warning: Invalid Input");
			}
			contentPane.add(warningLabel);
			contentPane.repaint();
		});
	}
}


