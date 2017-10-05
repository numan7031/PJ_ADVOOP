import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.ImageIcon;


public class likedislike {

	JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					likedislike window4 = new likedislike();
					window4.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public likedislike() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 454, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LIKE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("DSN RatBuRaNa", Font.PLAIN, 60));
		lblNewLabel.setBounds(26, 11, 136, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u0E1C\u0E31\u0E01");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(36, 89, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("\u0E40\u0E19\u0E37\u0E49\u0E2D");
		buttonGroup.add(radioButton);
		radioButton.setBounds(36, 63, 109, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u0E40\u0E2A\u0E49\u0E19");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(36, 117, 109, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\u0E2D\u0E30\u0E44\u0E23\u0E01\u0E47\u0E44\u0E14\u0E49");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(36, 143, 109, 23);
		frame.getContentPane().add(radioButton_2);
		
		JLabel lblDislike = new JLabel("DISLIKE");
		lblDislike.setForeground(Color.WHITE);
		lblDislike.setFont(new Font("DSN RatBuRaNa", Font.PLAIN, 60));
		lblDislike.setBounds(172, 11, 256, 45);
		frame.getContentPane().add(lblDislike);
		
		JRadioButton radioButton_3 = new JRadioButton("\u0E40\u0E19\u0E37\u0E49\u0E2D");
		buttonGroup_1.add(radioButton_3);
		radioButton_3.setBounds(230, 63, 109, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\u0E1C\u0E31\u0E01");
		buttonGroup_1.add(radioButton_4);
		radioButton_4.setBounds(230, 89, 109, 23);
		frame.getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("\u0E40\u0E2A\u0E49\u0E19");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(230, 117, 109, 23);
		frame.getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("\u0E2D\u0E30\u0E44\u0E23\u0E01\u0E47\u0E44\u0E14\u0E49");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(230, 143, 109, 23);
		frame.getContentPane().add(radioButton_6);
		
		JButton btnNewButton = new JButton("RANDOM");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Stout Deco", Font.BOLD, 50));
		btnNewButton.setBounds(76, 181, 258, 75);
		frame.getContentPane().add(btnNewButton);
	}
}
