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



public class ToggleParkingUI extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameField;
	private ManagerService service = new ManagerService();
	
	public static final String parkLotPath = "parkingLot.csv";
	public static final String parkSpacePath = "parkingSpace.csv";
	public static final String bookingPath = "booking.csv";
	
	public ToggleParkingUI(User user) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Toggle Parking");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel messageLabel = new JLabel("Please Enter the Name of the Parking Lot ");
		messageLabel.setBounds(98, 54, 259, 16);
		contentPane.add(messageLabel);
		
		nameField = new JTextField();
		nameField.setBounds(161, 106, 130, 26);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JButton enableBtn = new JButton("Enable");
		enableBtn.setBounds(53, 209, 112, 29);
		contentPane.add(enableBtn);
		
		JButton disableBtn = new JButton("Disable");
		disableBtn.setBounds(283, 209, 117, 29);
		contentPane.add(disableBtn);
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setBounds(327, 6, 117, 29);
		contentPane.add(returnBtn);
		
		JLabel warningLabel = new JLabel();
		
		warningLabel.setBounds(85, 161, 283, 16);
		
		returnBtn.addActionListener(e -> {
			dispose();
			new ManagerUI(user);
		});
		
		enableBtn.addActionListener(e -> {
			String name = nameField.getText().trim().toLowerCase();
			try {
				if(service.parkingLotEnableDisable(parkLotPath, parkSpacePath, bookingPath, name, true)) {
					warningLabel.setForeground(new Color(0, 0, 255));
					warningLabel.setText("Parking lot '" + name + "' now enabled");
				}else {
					warningLabel.setForeground(new Color(255, 0, 0));
					warningLabel.setText("There is no parking lot called '" + name + "'");
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			contentPane.add(warningLabel);
			contentPane.repaint();
		});
		
		disableBtn.addActionListener(e -> {
			String name = nameField.getText().trim().toLowerCase();
			try {
				if(service.parkingLotEnableDisable(parkLotPath, parkSpacePath, bookingPath, name, false)) {
					warningLabel.setForeground(new Color(0, 0, 255));
					warningLabel.setText("Parking lot '"+name+"' now disabled");
				}else {
					warningLabel.setForeground(new Color(255, 0, 0));
					warningLabel.setText("There is no parking lot called '"+name+"'");
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			contentPane.add(warningLabel);
			contentPane.repaint();
		});
	}
}
