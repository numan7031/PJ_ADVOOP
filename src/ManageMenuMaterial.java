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


public class ManageMenuMaterial {

	JFrame frame;
	private static JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageMenuMaterial window3 = new ManageMenuMaterial();
					window3.frame.setVisible(true);
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
	public ManageMenuMaterial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("Manage Menu Material");
		lblRegister.setForeground(Color.WHITE);
		lblRegister.setFont(new Font("Nulshock Rg", Font.BOLD, 24));
		lblRegister.setBounds(20, 52, 420, 55);
		frame.getContentPane().add(lblRegister);
		
		JLabel lblEmail = new JLabel("Material");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(20, 148, 64, 14);
		frame.getContentPane().add(lblEmail);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(112, 147, 224, 20);
		frame.getContentPane().add(textField3);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageMain window = new ManageMain();
				window.frame.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(20, 21, 64, 30);
		frame.getContentPane().add(btnBack);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					 Connection	con = DriverManager.getConnection("jdbc:mysql://localhost/food","root","");
					Statement stmt = con.createStatement();
					String query =("insert into material (material_name) values("+textField3.getText()+")");
				stmt.executeUpdate(query);
				JOptionPane.showMessageDialog(null,String.format("Insert complete") );
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}
			}
		});
		btnAdd.setBounds(346, 116, 82, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(346, 144, 82, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		btnUpdate.setBounds(346, 180, 82, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(346, 209, 82, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton button = new JButton("<<");
		button.setBounds(66, 198, 49, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(125, 198, 49, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.setBounds(184, 198, 49, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(">>");
		button_3.setBounds(243, 198, 49, 23);
		frame.getContentPane().add(button_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("E:\\backUp 8-22-2016\\oop\\TestGUI\\bg.jpg"));
		lblNewLabel.setBounds(0, 0, 450, 291);
		frame.getContentPane().add(lblNewLabel);
	}
}
