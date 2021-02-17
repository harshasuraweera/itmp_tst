package Harsha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Desktop.Action;
import javax.swing.UIManager;

public class TestScreen {

	private JFrame frmWelcomeToFroza;
	private JTextField name;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestScreen window = new TestScreen();
					window.frmWelcomeToFroza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToFroza = new JFrame();
		frmWelcomeToFroza.getContentPane().setBackground(new Color(102, 204, 255));
		frmWelcomeToFroza.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Chrome Downloads\\\u2014Pngtree\u2014graduation caps vector convocation students_5320293.png"));
		frmWelcomeToFroza.setTitle("Welcome to Froza Student Management!");
		frmWelcomeToFroza.setBounds(100, 100, 848, 539);
		frmWelcomeToFroza.setSize(800, 400);
		frmWelcomeToFroza.setResizable(false);
		frmWelcomeToFroza.setLocationRelativeTo(null);
		frmWelcomeToFroza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToFroza.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FROZA Student Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(144, 10, 530, 60);
		frmWelcomeToFroza.getContentPane().add(lblNewLabel);
		
		JButton add = new JButton("Add");
		add.setBackground(new Color(51, 51, 255));
		add.setForeground(new Color(255, 255, 255));
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addToDb();
			}
		});
		add.setFont(new Font("Tahoma", Font.PLAIN, 17));
		add.setBounds(188, 295, 105, 29);
		frmWelcomeToFroza.getContentPane().add(add);
		
		name = new JTextField();
		name.setBounds(230, 115, 444, 19);
		frmWelcomeToFroza.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(144, 114, 76, 16);
		frmWelcomeToFroza.getContentPane().add(lblNewLabel_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(230, 160, 444, 19);
		frmWelcomeToFroza.getContentPane().add(email);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(144, 159, 76, 16);
		frmWelcomeToFroza.getContentPane().add(lblNewLabel_1_1);
	}
	
	public void addToDb() {
	
	
		Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rss = null;

		
		try {
			
    		conn = DBConnect.getConnection();
    		
    		stmt = conn.createStatement();
    		String h = "sgdsdgs";
	        String j = "ffsafa";
    	    String sql = "INSERT INTO Students (id, name, email) Values ("+49+",'"+h+"','"+j+"')";
    	    ((java.sql.Statement) stmt).executeUpdate(sql);
    	    
    		
    		
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
		
		
		
		
		
		
		
		
	}
	
}
