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

import factory.PaymentFactory;
import observer.Booking;
import service.UserService;
import template.User;

public class ExtendBookingUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private UserService service = new UserService();
	private JTextField numberField = new JTextField();
	private JLabel messageLabel = new JLabel();
	private JLabel warningLabel = new JLabel("Warning: Invalid Input");
	
	public static final String bookingPath = "booking.csv";
	public static final String parkSpacePath = "parkingSpace.csv";
	
	
	public ExtendBookingUI(User user) throws IOException{
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Extend Booking");
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
			
			
		messageLabel.setBounds(38, 19, 500, 16);
		int size = bookingList.size() - 1;
			
		if(size < 0) {
			messageLabel.setText("No Bookings Found For You");
			bookConfirmBtn.setEnabled(false);
		}else if(size == 0) messageLabel.setText("There Is 1 Booking found, Enter '0'");
		else messageLabel.setText("Please Enter a Booking Integer Between 0-"+size);
		contentPane.add(messageLabel);
			
			
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
					messageLabel.setText("Is This The Booking You Want to Extend?");
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
		
		JLabel endLabel = new JLabel("End Time: "+bookingList.get(choice).getEndTime() + ":00");
		endLabel.setBounds(289, 94, 117, 16);
		contentPane.add(endLabel);
		
		JLabel licenceLabel = new JLabel("Licence: "+booking.getLicense());
		licenceLabel.setBounds(179, 94, 117, 16);
		contentPane.add(licenceLabel);
		
		JButton yesBtn = new JButton("Yes");
		yesBtn.setBounds(16, 216, 117, 29);
		contentPane.add(yesBtn);
		
		JButton noBtn = new JButton("No");
		noBtn.setBounds(304, 216, 117, 29);
		contentPane.add(noBtn);
		
		contentPane.repaint();
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setBounds(172, 190, 145, 26);
		
		JLabel finishedLabel = new JLabel("Booking Cannot Be Extended Further");
		finishedLabel.setForeground(new Color(255, 0, 0));
		finishedLabel.setBounds(139, 130, 230, 16);
		
		returnBtn.addActionListener(e -> {
			dispose();
			new UserUI(user);
		});
		 
		
		yesBtn.addActionListener(e -> {	
			contentPane.removeAll();
			if(bookingList.get(choice).getEndTime() == 23) {
				contentPane.add(finishedLabel);
				contentPane.add(returnBtn);
				contentPane.repaint();
			}else {
				chooseExtention(user, bookingList.get(choice));
			}
			
		});
		
		noBtn.addActionListener(e -> {
			dispose();
			try {
				numberField.setText("");
				new ExtendBookingUI(user);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	});
		
		
	}
	
	private void chooseExtention(User user, Booking booking) {
		JButton confirmBtn = new JButton("Confirm");
		//confirmBtn.setBounds(160, 100, 117, 29);
		confirmBtn.setBounds(172, 190, 145, 26);
		contentPane.add(confirmBtn);
		contentPane.add(numberField);
		
		JButton returnBtn = new JButton("Confirm");
		returnBtn.setBounds(160, 100, 117, 29);
		
		messageLabel.setBounds(97, 10, 500, 16);
		
		returnBtn.addActionListener(e -> {
			dispose();
			new UserUI(user);
		});
		
		JLabel finishedLabel = new JLabel("Booking Has Been Extended");
		finishedLabel.setForeground(new Color(0, 6, 255));
		finishedLabel.setBounds(139, 177, 178, 16);
		
		numberField.setText("");
		messageLabel.setText("Please Enter a time Integer Between "+(booking.getEndTime()+1)+"-23");
		contentPane.add(messageLabel);
		contentPane.repaint();
		
		confirmBtn.addActionListener(e -> { 
			String value = numberField.getText();
				
			try {
				int i = Integer.parseInt(value.trim());
				if(i < booking.getEndTime()+1 || i > 23) {
					warningLabel.setText("Warning: Invalid Input");
					contentPane.add(warningLabel);
				}else {
					contentPane.removeAll();
					extendPayment(user, booking, i);
					}
			}	
			catch(Exception e1) {
				contentPane.add(warningLabel);
			}
			contentPane.repaint();
		});
	}
	
	private void extendPayment(User user, Booking booking, int newEndTime) throws IOException {
	//	service.editBookingTime(booking, newEndTime);
		
		JLabel messageLabel = new JLabel("Your new Order is...");
		messageLabel.setBounds(172, 6, 150, 16);
		contentPane.add(messageLabel);
		JLabel lotLabel = new JLabel("Parking Lot: "+booking.getParkingSpace().getLocation());
		lotLabel.setBounds(16, 54, 219, 16);
		contentPane.add(lotLabel);
		
		JLabel spaceLabel = new JLabel("Parking Space: "+booking.getParkingSpace().getId());

		spaceLabel.setBounds(16, 94, 117, 16);
		contentPane.add(spaceLabel);
		
		JLabel startLabel = new JLabel("Start Time: "+booking.getStartTime()+":00");
		startLabel.setBounds(289, 54, 117, 16);
		contentPane.add(startLabel);
		
		JLabel priceLabel = new JLabel("Price: $"+(newEndTime-booking.getEndTime())*user.getPayRate());
		priceLabel.setBounds(179, 54, 150, 16);
		contentPane.add(priceLabel);
		
		JLabel endLabel = new JLabel("End Time: "+newEndTime+":00");
		endLabel.setBounds(289, 94, 117, 16);
		contentPane.add(endLabel);
		
		JLabel choiceLabel = new JLabel("Please Select Payment Option");
		choiceLabel.setBounds(129, 156, 184, 16);
		contentPane.add(choiceLabel);
		
		JButton paypalBtn = new JButton("PayPal");
		paypalBtn.setBounds(16, 216, 117, 29);
		contentPane.add(paypalBtn);
		
		JButton creditBtn = new JButton("Credit Card");
		creditBtn.setBounds(160, 216, 117, 29);
		contentPane.add(creditBtn);
		
		JButton debitBtn = new JButton("Debit Card");
		debitBtn.setBounds(304, 216, 117, 29);
		contentPane.add(debitBtn);
		
		JLabel licenceLabel = new JLabel("Licence: "+booking.getLicense());
		licenceLabel.setBounds(179, 94, 117, 16);
		contentPane.add(licenceLabel);
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setBounds(160, 122, 117, 29);
		
		JLabel finishedLabel = new JLabel("Booking Has Been Edited");
		finishedLabel.setForeground(new Color(0, 6, 255));
		finishedLabel.setBounds(139, 177, 178, 16);
		
		
		paypalBtn.addActionListener(e -> {
			try {
				service.editBookingTime(bookingPath, booking, newEndTime, PaymentFactory.createPayment("paypal"));
				//service.createBooking(PaymentFactory.createPayment("paypal"), (endTime-startTime)*user.getPayRate(), user, space, startTime, endTime);
				contentPane.removeAll();
				contentPane.add(returnBtn);
				contentPane.add(finishedLabel);
				contentPane.repaint();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		creditBtn.addActionListener(e -> {
			try {
				service.editBookingTime(bookingPath, booking, newEndTime, PaymentFactory.createPayment("credit"));
				contentPane.removeAll();
				contentPane.add(returnBtn);
				contentPane.add(finishedLabel);
				contentPane.repaint();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		debitBtn.addActionListener(e -> {
			try {
				service.editBookingTime(bookingPath, booking, newEndTime, PaymentFactory.createPayment("debit"));
				contentPane.removeAll();
				contentPane.add(returnBtn);
				contentPane.add(finishedLabel);
				contentPane.repaint();
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
	


