package facade;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import observer.ParkingLot;
import observer.ParkingSpace;
import service.UserService;
import template.User;

public class CreateBookingUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private UserService service = new UserService();
	private JTextField numberField = new JTextField();
	private JLabel messageLabel = new JLabel();
	private JLabel warningLabel = new JLabel("Warning: Invalid Input");
	
	public static final String bookingPath = "booking.csv";
	public static final String parkLotPath = "parkingLot.csv";
	public static final String parkSpacePath = "parkingSpace.csv";
	
	
	public CreateBookingUI(User user) throws IOException {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Create Booking");
		setBounds(100, 100, 496, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		int ctr = service.getParkingLots(parkLotPath);
		
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setToolTipText("Return to the Previous Screen");
		returnBtn.setBounds(373, 6, 117, 29);
		contentPane.add(returnBtn);
		
		returnBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new UserUI(user);
			}
			
		});	
		
		numberField.setBounds(172, 135, 145, 26);
		contentPane.add(numberField);
		numberField.setColumns(10);
		
		
		
		JButton lotConfirmBtn = new JButton("Confirm");
		lotConfirmBtn.setBounds(185, 188, 117, 29);
		contentPane.add(lotConfirmBtn);
		
		
		messageLabel.setBounds(38, 19, 339, 16);
		
		if (ctr < 0) {
			messageLabel.setText("There Are No Parking Lots Available");
			lotConfirmBtn.setEnabled(false);
		} else if (ctr == 0) {
			messageLabel.setText("There Is One Parking Lot Available, Enter '0' To Continue");
		} else {
			messageLabel.setText("Please Enter a Parking Lot Integer Between 0-" + ctr);
		}
		
		contentPane.add(messageLabel);
		
		warningLabel.setForeground(new Color(255, 4, 0));
		warningLabel.setBounds(172, 87, 315, 16);
		
		lotConfirmBtn.addActionListener(e -> { 
			String value = numberField.getText();
			
			
			try {
				int i = Integer.parseInt(value.trim());
				
				if (i < 0 || i > ctr) {
					warningLabel.setText("Warning: Invalid Input");
					contentPane.add(warningLabel);
				} else {
					numberField.setText("");
					contentPane.remove(warningLabel);
					
					if (!service.checkIfDisabled(parkLotPath, Integer.toString(i))) {
						messageLabel.setText("Please Enter a Parking Space Integer from 0-99");
						contentPane.remove(lotConfirmBtn);
						
						ParkingLot parkingLot = service.getParkingLotByID(parkLotPath, parkSpacePath, i);
						handleParkingSpace(user, parkingLot);
					} else {
						warningLabel.setText("This lot is currently disabled");
						contentPane.add(warningLabel);
					}
				}
				
				numberField.setText("");
			} catch(Exception e1) {
				contentPane.add(warningLabel);
			}
			contentPane.repaint();
		});
	}
	
	private void handleParkingSpace(User user, ParkingLot lot){
		messageLabel.setText("Please Enter a Parking Space Integer from 0-99");
		
		
		JButton spaceConfirmBtn = new JButton("Confirm");
		spaceConfirmBtn.setBounds(185, 188, 117, 29);
		contentPane.add(spaceConfirmBtn);
		contentPane.repaint();
		
		
		spaceConfirmBtn.addActionListener(e -> {
			String value = numberField.getText();
			
			try {
				int i = Integer.parseInt(value.trim());
				if(i < 0 || i > 99) {
					warningLabel.setText("Warning: Invalid Input");
					contentPane.add(warningLabel);
				} else {
					if (lot.getSpaces()[i].isTaken()) {
						warningLabel.setText("This Parking Spot is Unavailable");
						contentPane.add(warningLabel);
					} else {
						contentPane.remove(warningLabel);
						contentPane.remove(spaceConfirmBtn);
						contentPane.remove(numberField);
						handleTimeSelection(user, lot, i);
					}
				}
			} catch(Exception e1) {
				contentPane.add(warningLabel);
			}
			contentPane.repaint();
		});
		
	}
	
	private void handleTimeSelection(User user, ParkingLot lot, int spaceID) {
		warningLabel.setBounds(129, 221, 315, 16);
		JTextField startField = new JTextField();
		startField.setBounds(76, 89, 130, 26);
		contentPane.add(startField);
		startField.setColumns(10);
		
		JLabel toLabel = new JLabel("to");
		toLabel.setBounds(252, 94, 20, 16);
		contentPane.add(toLabel);
		
		JTextField endField = new JTextField();
		endField.setBounds(314, 89, 130, 26);
		endField.setColumns(10);
		contentPane.add(endField);
		
		messageLabel.setText("Please choose a time for both between 0 and 23");
		
		JButton bookingConfirmBtn = new JButton("Confirm");
		bookingConfirmBtn.setBounds(185, 188, 117, 29);
		contentPane.add(bookingConfirmBtn);
		contentPane.repaint();
		
		bookingConfirmBtn.addActionListener(e -> {
			
			try {
				int i = Integer.parseInt(startField.getText().trim());
				int j = Integer.parseInt(endField.getText().trim());
				if(i < 0 || i > 23 || j < 0 || j > 23) {
					warningLabel.setText("Warning: Invalid Input");
					contentPane.add(warningLabel);
				}else if(j < i){
					warningLabel.setText("Start Time cannot be greater than End Time");
					contentPane.add(warningLabel);
				}else if(i == j) {
					warningLabel.setText("Start Time cannot be equal to End Time");
					contentPane.add(warningLabel);
				}else {
						contentPane.remove(bookingConfirmBtn);
						contentPane.remove(startField);
						contentPane.remove(endField);
						contentPane.remove(toLabel);
						contentPane.remove(warningLabel);
						handleLicensePlate(user, lot.getSpaces()[spaceID], i, j);
					}
			}
			catch(Exception e1) {
				warningLabel.setText("Warning: Invalid Input");
				contentPane.add(warningLabel);
			}
			contentPane.repaint();
		});
	}
	
	private void handleLicensePlate(User user, ParkingSpace space, int startTime, int endTime) {
		JButton bookingConfirmBtn = new JButton("Confirm");
		bookingConfirmBtn.setBounds(185, 188, 117, 29);
		contentPane.add(bookingConfirmBtn);
		
		messageLabel.setText("Enter Your Car's License Plate (6 characters long)");
		numberField.setText("");
		contentPane.add(numberField);
		contentPane.repaint();
		
		
		bookingConfirmBtn.addActionListener(e -> {
				String s = numberField.getText().trim();
				if(s.length() != 6) {
					warningLabel.setText("Warning: Invalid Input");
					contentPane.add(warningLabel);
				}else {
					dispose();
					new PaymentUI(user, space, startTime, endTime, s);
				}
			contentPane.repaint();
		});
	}
}
