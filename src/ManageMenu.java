import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ManageMenu {

	JFrame frame;
	private static JTextField textField2;
	private static JTextField textField3;
	private static JTextField textField4;
	private JTextField textField;
	JButton  btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					ManageMenu window2 = new ManageMenu();
					window2.frame.setVisible(true);
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/food","root","");
			
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}

	/**
	 * Create the application.
	 */
	public ManageMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("Manage Menu");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Nulshock Rg", Font.BOLD, 37));
		lblRegister.setBounds(20, 52, 376, 55);
		frame.getContentPane().add(lblRegister);
		
		JLabel lblPassword = new JLabel("Name");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(20, 118, 82, 14);
		frame.getContentPane().add(lblPassword);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(112, 117, 224, 20);
		frame.getContentPane().add(textField2);
		
		JLabel lblEmail = new JLabel("Calories");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(20, 149, 64, 14);
		frame.getContentPane().add(lblEmail);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(112, 148, 224, 20);
		frame.getContentPane().add(textField3);
		
		JLabel lblPhone = new JLabel("Image");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhone.setBounds(20, 180, 64, 14);
		frame.getContentPane().add(lblPhone);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(112, 179, 224, 20);
		frame.getContentPane().add(textField4);
		
		JLabel lblBirthday = new JLabel("Description");
		lblBirthday.setForeground(Color.WHITE);
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirthday.setBounds(20, 209, 89, 19);
		frame.getContentPane().add(lblBirthday);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(112, 210, 224, 20);
		frame.getContentPane().add(textField);
		
		 btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// New Form
				
				ManageMain window = new ManageMain();
				window.frame.setVisible(true);
				frame.setVisible(false);
			
			}
		});
		btnBack.setBounds(20, 21, 64, 30);
		frame.getContentPane().add(btnBack);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(346, 116, 82, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(346, 144, 82, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(346, 180, 82, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(346, 209, 82, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton button = new JButton("<<");
		button.setBounds(109, 248, 49, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(168, 248, 49, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(227, 248, 49, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(286, 248, 49, 23);
		frame.getContentPane().add(button_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\backUp 8-22-2016\\oop\\TestGUI\\bg.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 291);
		frame.getContentPane().add(lblNewLabel);
	}

	
	
}
