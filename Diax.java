import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Diax extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private JTextField titlospar;
	private JTextField wrpar;


	public void Connection(){
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	try
	{
	
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionUrl = "jdbc:mysql://localhost:3306/dbsete";
		String connectionUser = "root";
		String connectionPassword = "omada28";
		conn = DriverManager.getConnection(connectionUrl, connectionUser,
		connectionPassword);
		stmt = conn.createStatement();
		String strpar= titlospar.getText();
		String strwr= wrpar.getText();
		
		String sql1 = "INSERT INTO par values('"+strpar+"')";
				stmt.executeUpdate(sql1);
		
		String sql2 = "INSERT INTO wres values('"+strpar+"','"+strwr+"')";
				stmt.executeUpdate(sql2);
				stmt.close();

		
	
		
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}
	finally
	{
	
		try { if (rs != null) rs.close(); } catch (SQLException e) {
			e.printStackTrace(); }
		
		try { if (stmt != null) stmt.close(); } catch (SQLException e) {
			e.printStackTrace(); }
		
		try { if (conn != null) conn.close(); } catch (SQLException e) {
			e.printStackTrace(); }
	}
	
	
	
		
	}
	
	public void Connectiondel(){
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	try
	{
	
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String connectionUrl = "jdbc:mysql://localhost:3306/dbsete";
		String connectionUser = "root";
		String connectionPassword = "omada28sete";
		conn = DriverManager.getConnection(connectionUrl, connectionUser,
		connectionPassword);
		stmt = conn.createStatement();
		String strpar= titlospar.getText();
		String strwr= wrpar.getText();
		//rs = stmt.executeQuery("SELECT * FROM par");
		
		String sql1 = "DELETE from par where name='"+strpar+"'";
				stmt.executeUpdate(sql1);
		
		String sql2 = "DELETE from wres where id='"+strpar+"' and wra='"+strwr+"'";
				stmt.executeUpdate(sql2);
				stmt.close();

		
		
	
		
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}
	finally
	{
	
		try { if (rs != null) rs.close(); } catch (SQLException e) {
			e.printStackTrace(); }
		
		try { if (stmt != null) stmt.close(); } catch (SQLException e) {
			e.printStackTrace(); }
		
		try { if (conn != null) conn.close(); } catch (SQLException e) {
			e.printStackTrace(); }
	}
	
	
	
		
	}
	
	
	
	public Diax() {
		super("Τροποποίηση πληροφοριών παράστασης");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				Login log= new Login();
			    log.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 514, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JLabel label = new JLabel("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03A4\u03AF\u03C4\u03BB\u03BF\u03C5 \u03A0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7\u03C2:");
		label.setBounds(24, 11, 354, 22);
		contentPane.add(label);
		
		
		
	    
		button = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				Connection();
				
				titlospar.setText("");
				wrpar.setText("");
				

			}
		});
		
		
		button.setBounds(266, 11, 222, 63);
		contentPane.add(button);
		button.setEnabled(false);
		
		titlospar = new JTextField();
		titlospar.setBounds(24, 44, 232, 30);
		contentPane.add(titlospar);
		titlospar.setColumns(10);
		
		Document document1 = titlospar.getDocument();
	    document1.addDocumentListener(new JButtonStateController(button));
	    
	
		
		JLabel lblNewLabel = new JLabel("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u038F\u03C1\u03B1\u03C2 \u03A0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7\u03C2:");
		lblNewLabel.setBounds(24, 85, 354, 22);
		contentPane.add(lblNewLabel);
		
		wrpar = new JTextField();
		wrpar.setBounds(24, 118, 232, 30);
		contentPane.add(wrpar);
		wrpar.setColumns(10);
		
		JButton button_1 = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE");
		button_1.setEnabled(false);
		button_1.setBounds(266, 85, 222, 63);
		contentPane.add(button_1);
	
		
		document1.addDocumentListener(new JButtonStateController(button_1));
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connectiondel();
				
				titlospar.setText("");
				wrpar.setText("");
				
				

			}
		});
		
	    
	    
	}
	
	class JButtonStateController implements DocumentListener {
		 JButton button;
		  
		  JButtonStateController(JButton button) {
		     this.button = button ;
		  }

		  public void changedUpdate(DocumentEvent e) {
		    disableIfEmpty(e);
		  }

		  public void insertUpdate(DocumentEvent e) {
		    disableIfEmpty(e);
		  }

		  public void removeUpdate(DocumentEvent e) {
		    disableIfEmpty(e);
		  }

		  public void disableIfEmpty(DocumentEvent e) {
		    button.setEnabled(e.getDocument().getLength() > 0);
		  }
		  
	}
}
