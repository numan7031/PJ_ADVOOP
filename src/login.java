import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class login extends JFrame {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	public static String sLevel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/food","root","");
					String query ="SELECT * FROM material";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()){
						System.out.println("Material ID: "+rs.getString("id")+"\nName : "+rs.getString("name")+"\nType: "+rs.getString("type"));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 408, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(87, 157, 67, 19);
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(154, 157, 158, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(87, 188, 67, 19);
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(154, 188, 158, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				try {
					 Connection	con = DriverManager.getConnection("jdbc:mysql://localhost/food","root","");
					 String sql = " SELECT * FROM  user " +" WHERE username = ? " +" AND password = ? " ;
					  PreparedStatement pre ;
						pre = con.prepareStatement(sql);
						pre.setString(1, textField.getText());
						pre.setString(2, passwordField.getText());
						ResultSet rec = pre.executeQuery();
						if(rec.next()) {
							JOptionPane.showMessageDialog(null, "Correct Username/Password");
							sLevel = rec.getString("status");
							if(sLevel.equals("admin")) {
								ManageMain window = new ManageMain();
								window.frame.setVisible(true);
								frame.setVisible(false);
								// Menu Admin
								
								} else if (sLevel.equals("user")){
									
									likedislike window4 = new likedislike();
									window4.frame.setVisible(true);
									frame.setVisible(false);
				
							
								// Menu User
									
								}
							
						} else {
						JOptionPane.showMessageDialog(null, "Incorrect Username/Password");
						}
						} catch (Exception ex) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, ex.getMessage());
						ex.printStackTrace();
						}
						
			
			}
		});
		btnNewButton.setBounds(154, 259, 75, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancle = new JButton("Cancel");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnCancle.setBounds(237, 259, 75, 23);
		frame.getContentPane().add(btnCancle);
		
		JButton btnRegister = new JButton("Register ?");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			register window5 = new register();
				window5.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnRegister.setBounds(180, 219, 100, 23);
		frame.getContentPane().add(btnRegister);
		 
			
		
		
			
	}
}
