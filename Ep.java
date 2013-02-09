import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;


public class Ep extends JFrame {

	private JPanel contentPane;
	private JList list;
	private JButton button;
	
	
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
		rs = stmt.executeQuery("SELECT * FROM par");
		
		
		DefaultListModel listModel = new DefaultListModel();
		while (rs.next())
		{
			
		
		String onoma = rs.getString("name");
		
		listModel.addElement(onoma);
		list = new JList(listModel);
		

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

	public Ep() {
		super("Επιλογή Παράστασης");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				Login log= new Login();
			    log.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 434, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Connection();
		
		
		
		
		JLabel label = new JLabel("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03A0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7:");
		label.setBounds(24, 11, 400, 22);
		contentPane.add(label);
		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setBounds(24, 44, 212, 158);
		contentPane.add(list);
		
	    
		button = new JButton("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ep.this.setVisible(false);
				String selection = list.getSelectedValue().toString();
			    Ew epwr= new Ew(selection);
			    epwr.setVisible(true);
			   
			}
		});
		
		button.setBounds(271, 77, 115, 85);
		contentPane.add(button);
		button.setEnabled(false);
		
		
		MyListListener listener = new MyListListener();
	    list.addListSelectionListener(listener);
	    
	    
	}
	public class MyListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent event) {
		if (event.getValueIsAdjusting() == false) {
			
		
	
		button.setEnabled(true);
		
				}
			}
		}

}
