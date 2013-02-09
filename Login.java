import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;


import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Login extends JFrame {

	private JPanel contentPane;
	private JButton button;
	private JTextField txtDiaxTamias;
	private JRadioButton radioButton_1;
	private JRadioButton radioButton;
	private JLabel label_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		super("Είσοδος στο σύστημα");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2 \u03C9\u03C2:");
		label.setBounds(24, 11, 144, 22);
		contentPane.add(label);
		
		
		
	    
		button = new JButton("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtDiaxTamias.getText();
				
				String passt="Tamias";
				String passd="Diax";

				
				if(radioButton_1.isSelected()){
					if (text.equals(passt)) {
					Login.this.setVisible(false);
			    Ep epara= new Ep();
			    epara.setVisible(true);
					}else {
						
						txtDiaxTamias.setText("Λάθος Κωδικός!");
					}
				}else {
					if(radioButton.isSelected()){
				
						if (text.equals(passd)) {
						Login.this.setVisible(false);
				    Diax dia= new Diax();
				    dia.setVisible(true);
						}else {
							
							txtDiaxTamias.setText("Λάθος Κωδικός!");
						}
					}
				
				}
			   
			}
		});
		
		button.setBounds(24, 118, 327, 38);
		contentPane.add(button);
		button.setEnabled(false);
		
		radioButton = new JRadioButton("\u0394\u03B9\u03B1\u03C7\u03B5\u03B9\u03C1\u03B7\u03C3\u03C4\u03AE\u03C2");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDiaxTamias.setVisible(true);
				button.setEnabled(true);
				label_1.setVisible(true);
				
			}
		});
		radioButton.setBounds(24, 71, 109, 23);
		contentPane.add(radioButton);
		
		radioButton_1 = new JRadioButton("\u03A4\u03B1\u03BC\u03AF\u03B1\u03C2");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDiaxTamias.setVisible(true);
				button.setEnabled(true);
				label_1.setVisible(true);
				
			}
		});
		radioButton_1.setBounds(24, 40, 109, 23);
		contentPane.add(radioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton);
		group.add(radioButton_1);
		
		
		txtDiaxTamias = new JTextField("Password:", 30);
		//textField = new JTextField();
		txtDiaxTamias.setHorizontalAlignment(SwingConstants.CENTER);
		txtDiaxTamias.setText("(Diax \u03AE Tamias)");
		txtDiaxTamias.setBounds(199, 44, 160, 50);
		contentPane.add(txtDiaxTamias);
		txtDiaxTamias.setColumns(10);
		
		label_1 = new JLabel("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B1\u03B9 \u03C4\u03BF\u03BD \u03BA\u03C9\u03B4\u03B9\u03BA\u03CC \u03C3\u03B1\u03C2:");
		label_1.setBounds(199, 15, 160, 22);
		contentPane.add(label_1);
		
		label_1.setVisible(false);
		txtDiaxTamias.setVisible(false);
	
		
	    
	    
	}

}
