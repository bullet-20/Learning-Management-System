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

public class EAAP extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EAAP frame = new EAAP();
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
	public EAAP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 550, 850, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 59, 824, 497);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 11, 392, 147);
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("1. Which of the following is NOT an example of academic writing?");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel.setBounds(6, 18, 376, 14);
		panel_1.add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("An essay on the history of cinema");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBounds(6, 39, 491, 23);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("A blog post about a recent trip to the beach");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(6, 63, 491, 23);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("A research paper on climate change");
		rdbtnNewRadioButton_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(6, 89, 491, 23);
		panel_1.add(rdbtnNewRadioButton_2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(442, 11, 372, 137);
		panel.add(panel_1_1);

		JLabel lblNewLabel_1 = new JLabel("2, Which of the following is the correct spelling?");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 11, 352, 26);
		panel_1_1.add(lblNewLabel_1);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Preperation");
		rdbtnNewRadioButton_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(6, 39, 491, 23);
		panel_1_1.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Preperashun");
		rdbtnNewRadioButton_1_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1.setBounds(6, 63, 491, 23);
		panel_1_1.add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Preparation");
		rdbtnNewRadioButton_2_1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1.setBounds(6, 89, 491, 23);
		panel_1_1.add(rdbtnNewRadioButton_2_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_3);
		buttonGroup2.add(rdbtnNewRadioButton_1_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_1);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(10, 179, 417, 137);
		panel.add(panel_1_2);

		JLabel lblNewLabel_2 = new JLabel("3. Which of the following is an appropriate way to start a formal email?");
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(6, 11, 401, 26);
		panel_1_2.add(lblNewLabel_2);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Hey");
		rdbtnNewRadioButton_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_4.setBounds(6, 39, 491, 23);
		panel_1_2.add(rdbtnNewRadioButton_4);

		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Hi there!");
		rdbtnNewRadioButton_1_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_2.setBounds(6, 63, 491, 23);
		panel_1_2.add(rdbtnNewRadioButton_1_2);

		JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton("Dear Sir/Madam");
		rdbtnNewRadioButton_2_2.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_2.setBounds(6, 89, 491, 23);
		panel_1_2.add(rdbtnNewRadioButton_2_2);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_4);
		buttonGroup3.add(rdbtnNewRadioButton_1_2);
		buttonGroup3.add(rdbtnNewRadioButton_2_2);

		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(437, 179, 377, 137);
		panel.add(panel_1_3);

		JLabel lblNewLabel_3 = new JLabel("4. Which of the following is an example of a passive sentence?");
		lblNewLabel_3.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 11, 367, 26);
		panel_1_3.add(lblNewLabel_3);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("The dog chased the cat.");
		rdbtnNewRadioButton_5.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_5.setBounds(6, 39, 491, 23);
		panel_1_3.add(rdbtnNewRadioButton_5);

		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("The cat was chased by the dog.");
		rdbtnNewRadioButton_1_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_3.setBounds(6, 63, 491, 23);
		panel_1_3.add(rdbtnNewRadioButton_1_3);

		JRadioButton rdbtnNewRadioButton_2_3 = new JRadioButton("The dog and the cat played together.");
		rdbtnNewRadioButton_2_3.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_3.setBounds(6, 89, 491, 23);
		panel_1_3.add(rdbtnNewRadioButton_2_3);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_5);
		buttonGroup4.add(rdbtnNewRadioButton_1_3);
		buttonGroup4.add(rdbtnNewRadioButton_2_3);

		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBounds(178, 348, 543, 137);
		panel.add(panel_1_4);

		JLabel lblNewLabel_4 = new JLabel(
				"5. Which of the following is an appropriate way to cite a source in an academic paper?");
		lblNewLabel_4.setFont(new Font("Serif", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 11, 500, 26);
		panel_1_4.add(lblNewLabel_4);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("\"I read in a book that...\"");
		rdbtnNewRadioButton_6.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_6.setBounds(6, 39, 491, 23);
		panel_1_4.add(rdbtnNewRadioButton_6);

		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton(
				"\"According to my friend, who is an expert on the topic...\"");
		rdbtnNewRadioButton_1_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_4.setBounds(6, 63, 491, 23);
		panel_1_4.add(rdbtnNewRadioButton_1_4);

		JRadioButton rdbtnNewRadioButton_2_4 = new JRadioButton("\"Smith (2018) argues that...\"");
		rdbtnNewRadioButton_2_4.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_4.setBounds(6, 89, 491, 23);
		panel_1_4.add(rdbtnNewRadioButton_2_4);

		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(rdbtnNewRadioButton_6);
		buttonGroup5.add(rdbtnNewRadioButton_1_4);
		buttonGroup5.add(rdbtnNewRadioButton_2_4);

		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int score = 0;
				if (rdbtnNewRadioButton_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_3.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_4.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_2.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(EAAP.this, "Your score is: " + score);
			}

		});
		btnNewButton.setBounds(36, 559, 229, 66);
		contentPane.add(btnNewButton);

		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Segoe UI Semilight", Font.BOLD, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile profile = new Profile();
				profile.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(556, 559, 229, 66);
		contentPane.add(btnBack);

		JLabel lblNewLabel_5 = new JLabel("English for Academic and Professional Purposes");
		lblNewLabel_5.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		lblNewLabel_5.setBounds(287, 11, 351, 32);
		contentPane.add(lblNewLabel_5);
	}
}
