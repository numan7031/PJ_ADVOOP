import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class register {

	JFrame frame;
	private static  JTextField textField1;
	private static JTextField textField2;
	private static JTextField textField3;
	private static JTextField textField4;
	 private static JComboBox comboBox1;
	private JComboBox comboBox2;
	private JComboBox comboBox3;
	JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window5 = new register();
					window5.frame.setVisible(true);
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Nulshock Rg", Font.BOLD, 28));
		lblRegister.setBounds(43, 13, 218, 27);
		frame.getContentPane().add(lblRegister);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(43, 51, 82, 14);
		frame.getContentPane().add(lblUsername);
		
		textField1 = new JTextField();
		textField1.setBounds(112, 50, 184, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(43, 76, 82, 14);
		frame.getContentPane().add(lblPassword);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(112, 75, 184, 20);
		frame.getContentPane().add(textField2);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(43, 102, 64, 14);
		frame.getContentPane().add(lblEmail);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(112, 101, 184, 20);
		frame.getContentPane().add(textField3);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhone.setBounds(43, 129, 64, 14);
		frame.getContentPane().add(lblPhone);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(112, 128, 184, 20);
		frame.getContentPane().add(textField4);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setForeground(Color.WHITE);
		lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirthday.setBounds(43, 158, 64, 19);
		frame.getContentPane().add(lblBirthday);
		
		 comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox1.setBounds(112, 158, 58, 19);
		frame.getContentPane().add(comboBox1);
		
		 comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox2.setBounds(176, 158, 58, 19);
		frame.getContentPane().add(comboBox2);
		
		 comboBox3 = new JComboBox();
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016"}));
		comboBox3.setBounds(240, 158, 58, 19);
		frame.getContentPane().add(comboBox3);
		
		 btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					 Connection	con = DriverManager.getConnection("jdbc:mysql://localhost/food","root","");
					Statement stmt = con.createStatement();
					
					String query =("insert into user (username,password,email,phone,birthday) values('"+textField1.getText()+"','"+textField2.getText()+"','"+textField3.getText()+"','"+textField4.getText()+"',"+comboBox1.getToolTipText()+")");
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(null,String.format("Insert complete") );
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}
			}
		});
		btnSubmit.setBounds(112, 188, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnCancle = new JButton("Cancel");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancle.setBounds(211, 188, 89, 23);
		frame.getContentPane().add(btnCancle);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\backUp 8-22-2016\\oop\\TestGUI\\bg.jpg"));
		lblNewLabel.setBounds(0, 0, 334, 223);
		frame.getContentPane().add(lblNewLabel);
	}
}
