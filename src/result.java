import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class result {

	private JFrame frame;
	JLabel label;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					result window = new result();
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
	public result() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 402, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMoreInfo = new JButton("MORE INFO >>>");
		btnMoreInfo.setBounds(239, 249, 137, 23);
		frame.getContentPane().add(btnMoreInfo);
		
		JButton btnRandomAgian = new JButton("RANDOM AGIAN");
		btnRandomAgian.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent  e) {
					   
					   // JDBC driver name and database URL
						
						
						final  String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
						  final  String DB_URL = "jdbc:mysql://localhost/food";

						   //  Database credentials
						   String USER = "root";
						   String PASS = "";
				   Connection conn = null;
				   Statement stmt = null;
					double a=0,b;
					
					a = (int) (10 * Math.random());
					b =a;
					System.out.printf("%.0f\n" ,b );
				   try{
				      //STEP 2: Register JDBC driver
				      Class.forName("com.mysql.jdbc.Driver");

				      //STEP 3: Open a connection
				      System.out.println("Connecting to a selected database...");
				      conn = DriverManager.getConnection(DB_URL, USER, PASS);
				      System.out.println("Connected database successfully...");
				      
				      //STEP 4: Execute a query
				      System.out.println("Creating statement...");
				      stmt = conn.createStatement();

				      String sql = "SELECT 	menu_id,menu_name, 	menu_cal, menu_desc FROM menu WHERE menu_id = " + b;
				      ResultSet rs = stmt.executeQuery(sql);
				      //STEP 5: Extract data from result set
				      while(rs.next()){
				         //Retrieve by column name
				         
						int id  = rs.getInt("menu_id");
				         String name = rs.getString("menu_name");
				         String cal = rs.getString("menu_cal");
				         String desc = rs.getString("menu_desc");

				         //Display values
				         //System.out.print("ID: " + id);
				        label.setText("\n Name: " +name);
				         System.out.print("\n Cal: " + cal);
				         System.out.println("\n Description: " + desc);
				      }
				      rs.close();
				   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e1){
				      //Handle errors for Class.forName
				      e1.printStackTrace();
				   }finally{
				      //finally block used to close resources
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }// do nothing
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("\nGoodbye!");
				}//end main
			
		});
		
		btnRandomAgian.setBounds(10, 249, 137, 23);
		frame.getContentPane().add(btnRandomAgian);
		
		label = new JLabel("");
		label.setBounds(56, 102, 286, 54);
		frame.getContentPane().add(label);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNameLogout = new JLabel("Name | Logout");
		lblNameLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNameLogout.setForeground(Color.WHITE);
		lblNameLogout.setBackground(Color.WHITE);
		lblNameLogout.setBounds(262, 0, 124, 23);
		frame.getContentPane().add(lblNameLogout);
	}
}
