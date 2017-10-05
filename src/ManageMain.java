import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.Window;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ManageMain {

	JFrame frame;
	JButton  btnManageMenu;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					ManageMain window = new ManageMain();
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
	public ManageMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 377, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblManageMain = new JLabel("Management");
		lblManageMain.setForeground(Color.WHITE);
		lblManageMain.setFont(new Font("Nulshock Rg", Font.BOLD, 28));
		lblManageMain.setBounds(51, 46, 266, 27);
		frame.getContentPane().add(lblManageMain);
		
		btnManageMenu = new JButton("Manage Menu");
		btnManageMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// New Form
				ManageMenu window2 = new ManageMenu();
				window2.frame.setVisible(true);
				
				frame.setVisible(false);
			}

			
		});
		btnManageMenu.setBounds(55, 100, 259, 35);
		frame.getContentPane().add(btnManageMenu);
		
		JButton btnManageMenuMaterial = new JButton("Manage Menu Material");
		btnManageMenuMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageMenuMaterial window3 = new ManageMenuMaterial();
				window3.frame.setVisible(true);
				
				frame.setVisible(false);
			}
		});
		btnManageMenuMaterial.setBounds(55, 146, 259, 35);
		frame.getContentPane().add(btnManageMenuMaterial);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login window = new login();
				window.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnLogout.setBounds(262, 11, 89, 23);
		frame.getContentPane().add(btnLogout);
	}

	

	

}
