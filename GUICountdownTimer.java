package JavaCountdownTimer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUICountdownTimer {

	private JFrame frame;
	private JTextField inputtextField;
	private JTextField countdownTextField;
	
	Timer timer;
	private JTextField processingtextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICountdownTimer window = new GUICountdownTimer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUICountdownTimer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitleLabel = new JLabel("Countdown Timer");
		lblTitleLabel.setBackground(new Color(153, 255, 204));
		lblTitleLabel.setForeground(new Color(0, 0, 0));
		lblTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTitleLabel.setBounds(189, 11, 183, 24);
		frame.getContentPane().add(lblTitleLabel);
		
		inputtextField = new JTextField();
		inputtextField.setBounds(217, 226, 86, 20);
		frame.getContentPane().add(inputtextField);
		inputtextField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insert number for countdown");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setBounds(174, 201, 198, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnStartButton = new JButton("Start");
		btnStartButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				try {// try - catch statement in place for errors
					
					int number = Integer.parseInt(inputtextField.getText());
					
					//processingtextField.setText("Counting down ... ");
					//processingtextField.getText();
					
					// for loop to countdown number 
						for(int start = number; start >= 0; start = start - 1) {
							
							countdownTextField.setText("Countdown completed ") ;// store text
							countdownTextField.getText();// display text
							//countdownTextField.setText(String.valueOf(start));
							
							Thread.sleep(1000); // Delay for 1 second
						}
						
						}catch (Exception e){ // catches any errors
							
							JOptionPane.showMessageDialog(null, "Error please try again");// display text
							
						}
				
			}
			
			//processingtextField.revalidate();
			//processingtextField.repaint();
			//Thread.sleep(500);
			//countdownTextField.revalidate();
			//countdownTextField.repaint();
			
		/*
			timer = new Timer(1000, new ActionListener()) {
				
				public void actionPerformed(ActionEvent e) {
					
				}
			};
			*/
			
		});
		btnStartButton.setBounds(217, 257, 89, 23);
		frame.getContentPane().add(btnStartButton);
		
		countdownTextField = new JTextField();
		countdownTextField.setBounds(155, 35, 203, 20);
		frame.getContentPane().add(countdownTextField);
		countdownTextField.setColumns(10);
		
		processingtextField = new JTextField();
		processingtextField.setFont(new Font("Tahoma", Font.BOLD, 11));
		processingtextField.setText("Press start & countdown begins");
		processingtextField.setBounds(165, 130, 188, 20);
		frame.getContentPane().add(processingtextField);
		processingtextField.setColumns(10);
	}
}
