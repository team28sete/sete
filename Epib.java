import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Epib extends JFrame {

	private JPanel contentPanet;
	private JList list1;
	private JButton buttont;
	private JList list2;
	private JList list3;
	private JList list4;
	private JList list5;
	private JList list6;
	private JList list7;
	private JList list8;
	private JList list9;
	private JList list10;
	private JList list13;
	private JList list14;
	private JList list15;
	private JList list16;
	private JList list17;
	private JList list11;
	private JList list12;
	private JLabel label;


	
	public String Ektypwsi(){
		return null;
	}
	
	public Epib(final String selection, final String selection1, Object[] selection2, int length, Object[] selection3, Object[] selection4, Object[] selection5, Object[] selection6, Object[] selection7, Object[] selection8, Object[] selection9, Object[] selection10, Object[] selection11, Object[] selection12, Object[] selection13, Object[] selection14, Object[] selection15, Object[] selection16, Object[] selection17, Object[] selection18) {
		super("Επιβεβαίωση Έκδωσης");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				Et epth= new Et(selection, selection1);
			    epth.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPanet = new JPanel();
		contentPanet.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanet);
		contentPanet.setLayout(null);
		
		JLabel labelt = new JLabel("Επιλέξατε τις θέσεις:");
		labelt.setBounds(24, 11, 380, 22);
		contentPanet.add(labelt);
		
		
		list1 = new JList(selection2);
		list1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list1.setBounds(10, 60, 21, 93);
		contentPanet.add(list1);
		
		
		
		buttont = new JButton("\u0395\u03BA\u03C4\u03CD\u03C0\u03C9\u03C3\u03B7");
		buttont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Epib.this.setVisible(false);
				
				Ektypwsi();
				
				Ep epar= new Ep();
			    epar.setVisible(true);
				
				
			}
		});
		buttont.setBounds(266, 177, 141, 82);
		contentPanet.add(buttont);
		buttont.setEnabled(true);
		
		
		list2 = new JList(selection3);
		list2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list2.setBounds(30, 60, 21, 93);
		contentPanet.add(list2);

		
		
		
		
		
		list3 = new JList(selection4);
		list3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list3.setBounds(50, 60, 21, 93);
		contentPanet.add(list3);
		
		
		
		list4 = new JList(selection5);
		list4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list4.setBounds(70, 60, 21, 93);
		contentPanet.add(list4);
		
		
		
		list5 = new JList(selection6);
		list5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list5.setBounds(90, 60, 21, 93);
		contentPanet.add(list5);
		
		
		list6 = new JList(selection7);
		list6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list6.setBounds(146, 60, 21, 93);
		contentPanet.add(list6);
		
		
		list7 = new JList(selection8);
		list7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list7.setBounds(166, 60, 21, 93);
		contentPanet.add(list7);
		
		
		list8 = new JList(selection9);
		list8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list8.setBounds(186, 60, 21, 93);
		contentPanet.add(list8);
		
		
		list9 = new JList(selection10);
		list9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list9.setBounds(206, 60, 21, 93);
		contentPanet.add(list9);
		
		list10 = new JList(selection11);
		list10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list10.setBounds(226, 60, 21, 93);
		contentPanet.add(list10);
		
		list13 = new JList(selection14);
		list13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list13.setBounds(323, 60, 21, 93);
		contentPanet.add(list13);
		
		list14 = new JList(selection15);
		list14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list14.setBounds(343, 60, 21, 93);
		contentPanet.add(list14);
		
		list15 = new JList(selection16);
		list15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list15.setBounds(363, 60, 21, 93);
		contentPanet.add(list15);
		
		list16 = new JList(selection17);
		list16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list16.setBounds(383, 60, 21, 93);
		contentPanet.add(list16);
		
		list17 = new JList(selection18);
		list17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list17.setBounds(403, 60, 21, 93);
		contentPanet.add(list17);
		
		list11 = new JList(selection12);
		list11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list11.setBounds(246, 60, 21, 93);
		contentPanet.add(list11);
		
		list12 = new JList(selection13);
		list12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list12.setBounds(266, 60, 21, 93);
		contentPanet.add(list12);
		
		JLabel lbla = new JLabel("\u0391\u03C1\u03B9\u03C3\u03C4\u03B5\u03C1\u03AC");
		lbla.setBounds(35, 40, 51, 14);
		contentPanet.add(lbla);
		
		JLabel lblk = new JLabel("\u039A\u03AD\u03BD\u03C4\u03C1\u03BF");
		lblk.setBounds(201, 40, 46, 14);
		contentPanet.add(lblk);
		
		JLabel lbld = new JLabel("\u0394\u03B5\u03BE\u03B9\u03AC");
		lbld.setBounds(362, 40, 46, 14);
		contentPanet.add(lbld);
		
		label = new JLabel("\u0393\u03B9\u03B1 \u03C4\u03B7\u03BD \u03C0\u03B1\u03C1\u03AC\u03C3\u03C4\u03B1\u03C3\u03B7: ");
		label.setBounds(24, 164, 150, 22);
		contentPanet.add(label);
		
		JLabel label_1 = new JLabel(""+selection);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(28, 184, 200, 22);
		contentPanet.add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(24, 184, 208, 22);
		contentPanet.add(panel);
		
		JLabel label_2 = new JLabel("T\u03B7\u03BD \u03CE\u03C1\u03B1: ");
		label_2.setBounds(24, 217, 138, 22);
		contentPanet.add(label_2);
		
		JLabel label_3 = new JLabel(""+selection1);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(28, 237, 138, 22);
		contentPanet.add(label_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(24, 237, 146, 22);
		contentPanet.add(panel_1);
		
	    
	}
	
}
