import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ListSelectionModel;


public class Ew extends JFrame {

	private JPanel contentPanew;
	private JList listw;
	private JButton buttonw;

	
	public void Connection(String selection){
		
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
		rs = stmt.executeQuery("SELECT * FROM wres WHERE id='"+selection+"'");

		
		DefaultListModel listModel = new DefaultListModel();
		while (rs.next())
		{

		
		String wra = rs.getString("wra");
		
		
		listModel.addElement(wra);
		listw = new JList(listModel);
		

		}
	
		
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
	
	public Ew(final String selection) {
		super("Επιλογή Ώρας");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				Ep epar= new Ep();
			    epar.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 376, 271);
		contentPanew = new JPanel();
		contentPanew.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanew);
		contentPanew.setLayout(null);
		
		
		Connection(selection);
		
		
		JLabel labelw = new JLabel("Επιλέξτε Ώρα για την παράσταση "+selection+":");
		labelw.setBounds(24, 11, 400, 22);
		contentPanew.add(labelw);
		
		
		listw.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listw.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		listw.setBounds(24, 44, 155, 158);
		contentPanew.add(listw);
		
		
		buttonw = new JButton("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE");
		buttonw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ew.this.setVisible(false);
				String selection1 = listw.getSelectedValue().toString();
			    Et epth= new Et(selection,selection1);
			    epth.setVisible(true);
			}
		});
		buttonw.setBounds(213, 78, 115, 85);
		contentPanew.add(buttonw);
		buttonw.setEnabled(false);
		
		MyListListener listenerw = new MyListListener();
	    listw.addListSelectionListener(listenerw);
	    
	    
	}
	private class MyListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent eventw) {
		if (eventw.getValueIsAdjusting() == false) {
			
		buttonw.setEnabled(true);
		
				}
			}
		}
	
	
}
