package Sationisa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Login {

	private JFrame frame;
	private JTextField txtHellowWelcomeTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("employee");
		btnNewButton.setFont(new Font("Casual", Font.PLAIN, 15));
		
		JButton btnPassanger = new JButton("passanger");
		btnPassanger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close();
				passengerLogin passenger = new passengerLogin();
				passenger.setVisible(true);
				
				
				
			}
		});
		btnPassanger.setFont(new Font("Casual", Font.PLAIN, 15));
		
		txtHellowWelcomeTo = new JTextField();
		txtHellowWelcomeTo.setFont(new Font("HanziPen TC", Font.ITALIC, 20));
		txtHellowWelcomeTo.setBackground(new Color(64, 224, 208));
		txtHellowWelcomeTo.setText("hello welcome to our bus station");
		txtHellowWelcomeTo.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtHellowWelcomeTo, 287, 287, 287)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(74)
							.addComponent(btnPassanger)))
					.addContainerGap(99, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(35)
					.addComponent(txtHellowWelcomeTo, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnPassanger))
					.addGap(43))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
