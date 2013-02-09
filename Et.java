import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
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



public class Et extends JFrame {

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

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param selection 
	 * @param selection1 
	 */

	public Et(final String selection, final String selection1) {
		super("Επιλογή Θέσης");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				Ew epwr= new Ew(selection);
			    epwr.setVisible(true);
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 238);
		contentPanet = new JPanel();
		contentPanet.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanet);
		contentPanet.setLayout(null);
		
		JLabel labelt = new JLabel("Επιλέξτε Θέση για την παράσταση "+selection+" την ώρα "+selection1+":");
		labelt.setBounds(24, 11, 380, 22);
		contentPanet.add(labelt);
		
		DefaultListModel listModel1 = new DefaultListModel();
		for(int i=1; i<86; i+=17){
		listModel1.addElement(i);
		}
		list1 = new JList(listModel1);
		list1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list1.setBounds(10, 60, 21, 93);
		contentPanet.add(list1);
		
		list1.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		
		buttont = new JButton("\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE");
		buttont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Et.this.setVisible(false);
				
				Object[] selection2 = list1.getSelectedValues();
				Object[] selection3 = list2.getSelectedValues();
				Object[] selection4 = list3.getSelectedValues();
				Object[] selection5 = list4.getSelectedValues();
				Object[] selection6 = list5.getSelectedValues();
				Object[] selection7 = list6.getSelectedValues();
				Object[] selection8 = list7.getSelectedValues();
				Object[] selection9 = list8.getSelectedValues();
				Object[] selection10 = list9.getSelectedValues();
				Object[] selection11 = list10.getSelectedValues();
				Object[] selection12 = list11.getSelectedValues();
				Object[] selection13 = list12.getSelectedValues();
				Object[] selection14 = list13.getSelectedValues();
				Object[] selection15 = list14.getSelectedValues();
				Object[] selection16 = list15.getSelectedValues();
				Object[] selection17 = list16.getSelectedValues();
				Object[] selection18 = list17.getSelectedValues();
				
				
				Epib epek= new Epib(selection, selection1, selection2 , selection2.length, 
						selection3, selection4, selection5, selection6, selection7, selection8, selection9, 
						selection10, selection11, selection12, selection13, selection14, selection15, selection16, 
						selection17, selection18);
			    epek.setVisible(true);
				
				//doSomethingWith(selection);
				for (int i=0; i<selection2.length; i++){
				System.out.println("Emfanise " + selection2[i]);
				}
			}
		});
		buttont.setBounds(10, 164, 414, 28);
		contentPanet.add(buttont);
		buttont.setEnabled(false);
		
		DefaultListModel listModel2 = new DefaultListModel();
		for(int i=2; i<86; i+=17){
		listModel2.addElement(i);
		}
		list2 = new JList(listModel2);
		list2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list2.setBounds(30, 60, 21, 93);
		contentPanet.add(list2);
		
		
		list2.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		}); 
		
		
		
		
		DefaultListModel listModel3 = new DefaultListModel();
		for(int i=3; i<86; i+=17){
		listModel3.addElement(i);
		}
		list3 = new JList(listModel3);
		list3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list3.setBounds(50, 60, 21, 93);
		contentPanet.add(list3);
		
		list3.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel4 = new DefaultListModel();
		for(int i=4; i<86; i+=17){
		listModel4.addElement(i);
		}
		list4 = new JList(listModel4);
		list4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list4.setBounds(70, 60, 21, 93);
		contentPanet.add(list4);
		
		list4.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel5 = new DefaultListModel();
		for(int i=5; i<86; i+=17){
		listModel5.addElement(i);
		}
		list5 = new JList(listModel5);
		list5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list5.setBounds(90, 60, 21, 93);
		contentPanet.add(list5);
		
		list5.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel6 = new DefaultListModel();
		for(int i=6; i<86; i+=17){
		listModel6.addElement(i);
		}
		list6 = new JList(listModel6);
		list6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list6.setBounds(146, 60, 21, 93);
		contentPanet.add(list6);
		
		list6.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel7 = new DefaultListModel();
		for(int i=7; i<86; i+=17){
		listModel7.addElement(i);
		}
		list7 = new JList(listModel7);
		list7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list7.setBounds(166, 60, 21, 93);
		contentPanet.add(list7);
		
		list7.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel8 = new DefaultListModel();
		for(int i=8; i<86; i+=17){
		listModel8.addElement(i);
		}
		list8 = new JList(listModel8);
		list8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list8.setBounds(186, 60, 21, 93);
		contentPanet.add(list8);
		
		list8.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel9 = new DefaultListModel();
		for(int i=9; i<86; i+=17){
		listModel9.addElement(i);
		}
		list9 = new JList(listModel9);
		list9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list9.setBounds(206, 60, 21, 93);
		contentPanet.add(list9);
		
		list9.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel10 = new DefaultListModel();
		for(int i=10; i<86; i+=17){
		listModel10.addElement(i);
		}
		list10 = new JList(listModel10);
		list10.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list10.setBounds(226, 60, 21, 93);
		contentPanet.add(list10);
		
		list10.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel13 = new DefaultListModel();
		for(int i=13; i<86; i+=17){
		listModel13.addElement(i);
		}
		list13 = new JList(listModel13);
		list13.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list13.setBounds(323, 60, 21, 93);
		contentPanet.add(list13);
		
		list13.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel14 = new DefaultListModel();
		for(int i=14; i<86; i+=17){
		listModel14.addElement(i);
		}
		list14 = new JList(listModel14);
		list14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list14.setBounds(343, 60, 21, 93);
		contentPanet.add(list14);
		
		list14.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel15 = new DefaultListModel();
		for(int i=15; i<86; i+=17){
		listModel15.addElement(i);
		}
		list15 = new JList(listModel15);
		list15.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list15.setBounds(363, 60, 21, 93);
		contentPanet.add(list15);
		
		list15.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel16 = new DefaultListModel();
		for(int i=16; i<86; i+=17){
		listModel16.addElement(i);
		}
		list16 = new JList(listModel16);
		list16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list16.setBounds(383, 60, 21, 93);
		contentPanet.add(list16);
		
		list16.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel17 = new DefaultListModel();
		for(int i=17; i<86; i+=17){
		listModel17.addElement(i);
		}
		list17 = new JList(listModel17);
		list17.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list17.setBounds(403, 60, 21, 93);
		contentPanet.add(list17);
		
		list17.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel11 = new DefaultListModel();
		for(int i=11; i<86; i+=17){
		listModel11.addElement(i);
		}
		list11 = new JList(listModel11);
		list11.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list11.setBounds(246, 60, 21, 93);
		contentPanet.add(list11);
		
		list11.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		DefaultListModel listModel12 = new DefaultListModel();
		for(int i=12; i<86; i+=17){
		listModel12.addElement(i);
		}
		list12 = new JList(listModel12);
		list12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list12.setBounds(266, 60, 21, 93);
		contentPanet.add(list12);
		
		list12.setSelectionModel(new DefaultListSelectionModel() {
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if(super.isSelectedIndex(index0)) {
		            super.removeSelectionInterval(index0, index1);
		        }
		        else {
		            super.addSelectionInterval(index0, index1);
		        }
		    }
		});
		
		JLabel lbla = new JLabel("\u0391\u03C1\u03B9\u03C3\u03C4\u03B5\u03C1\u03AC");
		lbla.setBounds(35, 40, 51, 14);
		contentPanet.add(lbla);
		
		JLabel lblk = new JLabel("\u039A\u03AD\u03BD\u03C4\u03C1\u03BF");
		lblk.setBounds(201, 40, 46, 14);
		contentPanet.add(lblk);
		
		JLabel lbld = new JLabel("\u0394\u03B5\u03BE\u03B9\u03AC");
		lbld.setBounds(362, 40, 46, 14);
		contentPanet.add(lbld);
		
		MyListListener listenert = new MyListListener();
	    list1.addListSelectionListener(listenert);
	    list2.addListSelectionListener(listenert);
	    list3.addListSelectionListener(listenert);
	    list4.addListSelectionListener(listenert);
	    list5.addListSelectionListener(listenert);
	    list6.addListSelectionListener(listenert);
	    list7.addListSelectionListener(listenert);
	    list8.addListSelectionListener(listenert);
	    list9.addListSelectionListener(listenert);
	    list10.addListSelectionListener(listenert);
	    list11.addListSelectionListener(listenert);
	    list12.addListSelectionListener(listenert);
	    list13.addListSelectionListener(listenert);
	    list14.addListSelectionListener(listenert);
	    list15.addListSelectionListener(listenert);
	    list16.addListSelectionListener(listenert);
	    list17.addListSelectionListener(listenert);
	    
	    
	    
	}
	private class MyListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent eventw) {
		if (eventw.getValueIsAdjusting() == false) {
			
		
		buttont.setEnabled(true);
		
				}
			}
		}
}
