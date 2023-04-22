import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class EMTEC extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EMTEC frame = new EMTEC();
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
	public EMTEC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 550, 745, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(10, 26, 543, 137);
		contentPane.add(panel_1_4);

		JLabel lblNewLabel_4 = new JLabel("1. What does the acronym \"EMTEC\" stand for?");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4.setBounds(10, 11, 500, 26);
		panel_1_4.add(lblNewLabel_4);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Electronic Media Technology Education Centre");
		rdbtnNewRadioButton_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_6.setBounds(6, 39, 650, 23);
		panel_1_4.add(rdbtnNewRadioButton_6);

		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("Educational Media Technology and Communications");
		rdbtnNewRadioButton_1_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_4.setBounds(6, 63, 650, 23);
		panel_1_4.add(rdbtnNewRadioButton_1_4);

		JRadioButton rdbtnNewRadioButton_2_4 = new JRadioButton("Electronic Music Technology and Entertainment Centre");
		rdbtnNewRadioButton_2_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_2_4.setBounds(6, 89, 634, 23);
		panel_1_4.add(rdbtnNewRadioButton_2_4);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton_6);
		buttonGroup.add(rdbtnNewRadioButton_1_4);
		buttonGroup.add(rdbtnNewRadioButton_2_4);

		JPanel panel_1_4_1 = new JPanel();
		panel_1_4_1.setLayout(null);
		panel_1_4_1.setBounds(10, 174, 543, 123);
		contentPane.add(panel_1_4_1);

		JLabel lblNewLabel_4_1 = new JLabel("2. Which of the following is a type of EMTEC data storage device?");
		lblNewLabel_4_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(10, 11, 651, 26);
		panel_1_4_1.add(lblNewLabel_4_1);

		JRadioButton rdbtnNewRadioButton_6_1 = new JRadioButton("Flash drive");
		rdbtnNewRadioButton_6_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_6_1.setBounds(6, 39, 504, 23);
		panel_1_4_1.add(rdbtnNewRadioButton_6_1);

		JRadioButton rdbtnNewRadioButton_1_4_1 = new JRadioButton("Mouse");
		rdbtnNewRadioButton_1_4_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_4_1.setBounds(6, 63, 311, 23);
		panel_1_4_1.add(rdbtnNewRadioButton_1_4_1);

		JRadioButton rdbtnNewRadioButton_2_4_1 = new JRadioButton("Monitor");
		rdbtnNewRadioButton_2_4_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_2_4_1.setBounds(6, 89, 311, 23);
		panel_1_4_1.add(rdbtnNewRadioButton_2_4_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_6_1);
		buttonGroup2.add(rdbtnNewRadioButton_1_4_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_4_1);

		JPanel panel_1_4_1_1 = new JPanel();
		panel_1_4_1_1.setLayout(null);
		panel_1_4_1_1.setBounds(10, 308, 543, 137);
		contentPane.add(panel_1_4_1_1);

		JLabel lblNewLabel_4_1_1 = new JLabel("3. Which of the following is a common use for EMTEC products?");
		lblNewLabel_4_1_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_1_1.setBounds(10, 11, 670, 26);
		panel_1_4_1_1.add(lblNewLabel_4_1_1);

		JRadioButton rdbtnNewRadioButton_6_1_1 = new JRadioButton("Playing video games");
		rdbtnNewRadioButton_6_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_6_1_1.setBounds(6, 39, 504, 23);
		panel_1_4_1_1.add(rdbtnNewRadioButton_6_1_1);

		JRadioButton rdbtnNewRadioButton_1_4_1_1 = new JRadioButton("Listening to music");
		rdbtnNewRadioButton_1_4_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_4_1_1.setBounds(6, 63, 311, 23);
		panel_1_4_1_1.add(rdbtnNewRadioButton_1_4_1_1);

		JRadioButton rdbtnNewRadioButton_2_4_1_1 = new JRadioButton("Making phone calls");
		rdbtnNewRadioButton_2_4_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_2_4_1_1.setBounds(6, 89, 311, 23);
		panel_1_4_1_1.add(rdbtnNewRadioButton_2_4_1_1);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_6_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_1_4_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_2_4_1_1);

		JPanel panel_1_4_1_1_1 = new JPanel();
		panel_1_4_1_1_1.setLayout(null);
		panel_1_4_1_1_1.setBounds(10, 456, 543, 137);
		contentPane.add(panel_1_4_1_1_1);

		JLabel lblNewLabel_4_1_1_1 = new JLabel(
				"4. Which of the following is an advantage of using EMTEC storage devices?");
		lblNewLabel_4_1_1_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_1_1_1.setBounds(10, 11, 639, 26);
		panel_1_4_1_1_1.add(lblNewLabel_4_1_1_1);

		JRadioButton rdbtnNewRadioButton_6_1_1_1 = new JRadioButton("They are easily damaged");
		rdbtnNewRadioButton_6_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_6_1_1_1.setBounds(6, 39, 504, 23);
		panel_1_4_1_1_1.add(rdbtnNewRadioButton_6_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_4_1_1_1 = new JRadioButton("They are portable and convenient");
		rdbtnNewRadioButton_1_4_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_4_1_1_1.setBounds(6, 63, 311, 23);
		panel_1_4_1_1_1.add(rdbtnNewRadioButton_1_4_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_4_1_1_1 = new JRadioButton("They are prone to data loss");
		rdbtnNewRadioButton_2_4_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_2_4_1_1_1.setBounds(6, 89, 311, 23);
		panel_1_4_1_1_1.add(rdbtnNewRadioButton_2_4_1_1_1);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_6_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_1_4_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_2_4_1_1_1);

		JPanel panel_1_4_1_1_1_1 = new JPanel();
		panel_1_4_1_1_1_1.setLayout(null);
		panel_1_4_1_1_1_1.setBounds(10, 604, 543, 137);
		contentPane.add(panel_1_4_1_1_1_1);

		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("5. Which of the following is a feature of some EMTEC products?");
		lblNewLabel_4_1_1_1_1.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel_4_1_1_1_1.setBounds(10, 11, 500, 26);
		panel_1_4_1_1_1_1.add(lblNewLabel_4_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_6_1_1_1_1 = new JRadioButton("Wireless charging");
		rdbtnNewRadioButton_6_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_6_1_1_1_1.setBounds(6, 39, 230, 23);
		panel_1_4_1_1_1_1.add(rdbtnNewRadioButton_6_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_4_1_1_1_1 = new JRadioButton("Built-in projector");
		rdbtnNewRadioButton_1_4_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_1_4_1_1_1_1.setBounds(6, 63, 311, 23);
		panel_1_4_1_1_1_1.add(rdbtnNewRadioButton_1_4_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_4_1_1_1_1 = new JRadioButton("Voice recognition");
		rdbtnNewRadioButton_2_4_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		rdbtnNewRadioButton_2_4_1_1_1_1.setBounds(6, 89, 311, 23);
		panel_1_4_1_1_1_1.add(rdbtnNewRadioButton_2_4_1_1_1_1);

		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(rdbtnNewRadioButton_6_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_1_4_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_2_4_1_1_1_1);

		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int score = 0;
				if (rdbtnNewRadioButton_1_4.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_6_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_4_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_4_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_4_1_1_1_1.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(EMTEC.this, "Your score is: " + score);
			}
		});
		btnNewButton.setBounds(354, 77, 156, 46);
		panel_1_4_1_1_1_1.add(btnNewButton);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile profile = new Profile();
				profile.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(563, 680, 156, 46);
		contentPane.add(btnBack);

		JLabel lblNewLabel = new JLabel("Empowerment Technologies");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		lblNewLabel.setBounds(276, 0, 341, 25);
		contentPane.add(lblNewLabel);

	}
}