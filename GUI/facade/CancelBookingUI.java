package facade;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import observer.Booking;
import service.UserService;
import template.User;

public class CancelBookingUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private UserService service = new UserService();
	private JTextField numberField = new JTextField();
	private JLabel messageLabel = new JLabel();
	private JLabel warningLabel = new JLabel("Warning: Invalid Input");
	
	public static final String bookingPath = "booking.csv";
	public static final String parkLotPath = "parkingLot.csv";
	public static final String parkSpacePath = "parkingSpace.csv";
	
	public CancelBookingUI(User user) throws IOException {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Cancel Booking");
		setBounds(100, 100, 496, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ArrayList<Booking> bookingList = service.getUserBookings(bookingPath, parkSpacePath, user);
		

		numberField.setBounds(172, 135, 145, 26);
		contentPane.add(numberField);
		numberField.setColumns(10);
		
		
		
		JButton bookConfirmBtn = new JButton("Confirm");
		bookConfirmBtn.setBounds(185, 188, 117, 29);
		contentPane.add(bookConfirmBtn);
		
		
		messageLabel.setBounds(38, 19, 339, 16);
		int size = bookingList.size() - 1;
		
		if(size < 0) {
			messageLabel.setText("No Bookings Found For You");
			bookConfirmBtn.setEnabled(false);
		}else if(size == 0) messageLabel.setText("There Is Booking dound, Enter '0' To Continue");
		else messageLabel.setText("Please Enter a Booking Integer Between 0-"+size);
		contentPane.add(messageLabel);
		
		
		
		
		warningLabel.setForeground(new Color(255, 4, 0));
		warningLabel.setBounds(172, 87, 315, 16);

		
		bookConfirmBtn.addActionListener(e -> { 
			String value = numberField.getText();
			
			try {
				int i = Integer.parseInt(value.trim());
				if(i < 0 || i > size) {
					warningLabel.setText("Warning: Invalid Input");
					contentPane.add(warningLabel);
				}else {
					contentPane.remove(warningLabel);
					messageLabel.setText("Is This The Booking You Want to Cancel?");
					contentPane.remove(bookConfirmBtn);
					contentPane.remove(numberField);
					showBooking(user, bookingList, i);
					}
			}	
			catch(Exception e1) {
				contentPane.add(warningLabel);
			}
			contentPane.repaint();
		});
		
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
	}
	
	private void showBooking(User user, ArrayList<Booking> bookingList, int choice) {
		Booking booking = bookingList.get(choice);
		
		messageLabel.setBounds(97, 10, 255, 16);
		contentPane.add(messageLabel);
		
		JLabel lotLabel = new JLabel("Parking Lot: " + booking.getParkingSpace().getLocation());
		lotLabel.setBounds(16, 54, 219, 16);
		contentPane.add(lotLabel);
		
		JLabel spaceLabel = new JLabel("Parking Space: " + booking.getParkingSpace().getId());

		spaceLabel.setBounds(16, 94, 117, 16);
		contentPane.add(spaceLabel);
		
		JLabel startLabel = new JLabel("Start Time: " + booking.getStartTime() + ":00");
		startLabel.setBounds(289, 54, 117, 16);
		contentPane.add(startLabel);
		
		JLabel priceLabel = new JLabel("Payed: $" + booking.getTotalCost(booking.getStartTime(), booking.getEndTime(), booking.getUser().getPayRate()));
		priceLabel.setBounds(179, 54, 150, 16);
		contentPane.add(priceLabel);
		
		JLabel licenceLabel = new JLabel("Licence: "+booking.getLicense());
		licenceLabel.setBounds(179, 94, 117, 16);
		contentPane.add(licenceLabel);
		
		JLabel endLabel = new JLabel("End Time: " + booking.getEndTime() + ":00");
		endLabel.setBounds(289, 94, 117, 16);
		contentPane.add(endLabel);
		
		JButton yesBtn = new JButton("Yes");
		yesBtn.setBounds(16, 216, 117, 29);
		contentPane.add(yesBtn);
		
		JButton noBtn = new JButton("No");
		noBtn.setBounds(304, 216, 117, 29);
		contentPane.add(noBtn);
		
		contentPane.repaint();
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setBounds(160, 122, 117, 29);
		
		
		JLabel finishedLabel = new JLabel("Booking Has Been Cancelled");
		finishedLabel.setForeground(new Color(0, 6, 255));
		finishedLabel.setBounds(139, 177, 178, 16);
		
		yesBtn.addActionListener(e -> {
			try {
				service.deleteBooking(bookingPath, parkSpacePath, booking);
				contentPane.removeAll();
				contentPane.add(finishedLabel);
				contentPane.add(returnBtn);
				contentPane.repaint();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	});
		
		noBtn.addActionListener(e -> {
			dispose();
			try {
				new CancelBookingUI(user);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	});
		
		returnBtn.addActionListener(e -> {
			dispose();
			new UserUI(user);
	});
	}
}
