package main;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.csvreader.CsvReader;

public class UserValCheck extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField input;
	private JLabel output;
	private final int x = 250;
	
	public UserValCheck() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Validation Site");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel inputLabel = new JLabel("Enter your Email:");
		inputLabel.setBounds(x, 50, 130, 26);
		
		input = new JTextField();
		input.setBounds(x, 100, 130, 26);
		
		output = new JLabel();
		output.setBounds(x, 300, 200, 26);
		contentPane.add(output);
		
		JButton enter = new JButton("Submit");
		enter.setBounds(x, 150, 130, 26);
		
		enter.addActionListener(e -> {
			String email = input.getText().trim().toLowerCase();
			
			try {
				String result = checkEmail(email);
				
				if (result.isEmpty()) {
					output.setText("Error: Email Not Found");
				} else {
					if(result.equals("t")) {
						output.setText("The email is verified");
					}else {
						output.setText("The email is not verified");
					}
				}
				contentPane.repaint();

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		
		
		JButton returnBtn = new JButton("Return");
		returnBtn.setToolTipText("Return to the Previous Screen");
		returnBtn.setBounds(450, 6, 100, 29);
		
		returnBtn.addActionListener(e -> {
			dispose();
			new ChoiceUI();
		});
		
		contentPane.add(returnBtn);
		contentPane.add(input);
		contentPane.add(inputLabel);
		contentPane.add(returnBtn);
		contentPane.add(enter);
	}

	private String checkEmail(String email) throws IOException {
		String path = "user.csv";
		
		CsvReader reader = new CsvReader(path);
		reader.readHeaders();
		
		while (reader.readRecord()) {
			String dataBaseEmail = reader.get("email");
			
			if (email.equals(dataBaseEmail)) {
				return reader.get("isValidated");
			}
		}
		return "";
	}
}
