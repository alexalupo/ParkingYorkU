package facade;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import factory.PaymentFactory;
import factory.PaymentOption;
import observer.Booking;
import observer.ParkingLot;
import observer.ParkingSpace;
import service.UserService;
import template.User;

public class PaymentUI extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton returnBtn;
	private JLabel finishedLabel;
	
	private UserService service = new UserService();
	
	public static final String parkLotPath = "parkingLot.csv";
	public static final String bookingPath = "booking.csv";
	public static final String parkSpacePath = "parkingSpace.csv";
	
	public PaymentUI(User user, ParkingSpace space, int startTime, int endTime, String licensePlate) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Payment");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel messageLabel = new JLabel("Your Order is...");
		messageLabel.setBounds(172, 6, 105, 16);
		contentPane.add(messageLabel);
		
		JLabel lotLabel = new JLabel("Parking Lot: " + space.getLocation());
		lotLabel.setBounds(16, 54, 219, 16);
		contentPane.add(lotLabel);
		
		JLabel spaceLabel = new JLabel("Parking Space: " + space.getId());
		spaceLabel.setBounds(16, 94, 117, 16);
		contentPane.add(spaceLabel);
		
		JLabel startLabel = new JLabel("Start Time: " + startTime + ":00");
		startLabel.setBounds(289, 54, 117, 16);
		contentPane.add(startLabel);
		
		JLabel priceLabel = new JLabel("Price: $" + (endTime-startTime) * user.getPayRate());
		priceLabel.setBounds(179, 54, 75, 16);
		
		contentPane.add(priceLabel);
		
		JLabel endLabel = new JLabel("End Time: " + endTime + ":00");
		endLabel.setBounds(289, 94, 117, 16);
		contentPane.add(endLabel);
		
		JLabel licenceLabel = new JLabel("Licence: " + licensePlate);
		licenceLabel.setBounds(179, 94, 117, 16);
		contentPane.add(licenceLabel);
		
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
		
		returnBtn = new JButton("Return");
		returnBtn.setBounds(160, 122, 117, 29);
		
		
		finishedLabel = new JLabel("Booking Has Been Created");
		finishedLabel.setForeground(new Color(0, 6, 255));
		finishedLabel.setBounds(139, 177, 178, 16);
		
		handlePaymentBtn(paypalBtn, user, space, startTime, endTime, licensePlate, "paypal");
		handlePaymentBtn(creditBtn, user, space, startTime, endTime, licensePlate, "credit");
		handlePaymentBtn(debitBtn, user, space, startTime, endTime, licensePlate, "debit");
		
		returnBtn.addActionListener(e -> {
				dispose();
				new UserUI(user);
		});
	}

	private void handlePaymentBtn(JButton btn, User user, ParkingSpace space, int startTime, int endTime, String licensePlate, String payment) {
		btn.addActionListener(e -> {
			try {
				int bookingID = service.getNextId(bookingPath);
				ParkingLot parkingLot = space.getParkingLot();
				PaymentOption paymentType = PaymentFactory.createPayment(payment);
				
				Booking booking = new Booking(
						bookingID, user, parkingLot, 
						space, startTime, endTime, 
						paymentType, licensePlate
						);
				
				service.createBooking(bookingPath, parkSpacePath, booking);
				
				contentPane.removeAll();
				contentPane.add(returnBtn);
				contentPane.add(finishedLabel);
				contentPane.repaint();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
	}
}

