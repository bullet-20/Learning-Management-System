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

public class Statistics extends JFrame {

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
					Statistics frame = new Statistics();
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
	public Statistics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 47, 647, 643);
		contentPane.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("1. What is the definition of probability?");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_1.setBounds(6, 18, 572, 14);
		panel_1.add(lblNewLabel_1);

		JRadioButton rdbtnTheStudyOf = new JRadioButton("The study of uncertainty");
		rdbtnTheStudyOf.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnTheStudyOf.setBounds(6, 39, 641, 23);
		panel_1.add(rdbtnTheStudyOf);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("The measure of the likelihood of an event");
		rdbtnNewRadioButton_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(6, 63, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("The calculation of averages");
		rdbtnNewRadioButton_2.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(6, 89, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnTheStudyOf);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_1_1 = new JLabel("2. What is the difference between variance and standard deviation?");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(6, 131, 553, 14);
		panel_1.add(lblNewLabel_1_1);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton(
				"Variance is always positive, while standard deviation can be negative");
		rdbtnNewRadioButton_3.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(6, 152, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Standard deviation is the square of the variance");
		rdbtnNewRadioButton_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1.setBounds(6, 178, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Variance is the square of the standard deviation");
		rdbtnNewRadioButton_2_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1.setBounds(6, 204, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_3);
		buttonGroup2.add(rdbtnNewRadioButton_1_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("3. What is a confidence interval?");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(6, 243, 597, 14);
		panel_1.add(lblNewLabel_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton(
				"A range of values that is likely to contain the true value of a population parameter");
		rdbtnNewRadioButton_3_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1.setBounds(6, 264, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1);

		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton(
				"The difference between the largest and smallest values in a dataset");
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1.setBounds(6, 290, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("The probability of an event occurring");
		rdbtnNewRadioButton_2_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1.setBounds(6, 316, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_3_1);
		buttonGroup3.add(rdbtnNewRadioButton_1_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_2_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("4. What is a Type I error?");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(6, 355, 654, 14);
		panel_1.add(lblNewLabel_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1 = new JRadioButton(
				"Accepting a null hypothesis when it is actually false");
		rdbtnNewRadioButton_2_1_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1_1.setBounds(6, 428, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton(
				"Rejecting a null hypothesis when it is actually true");
		rdbtnNewRadioButton_1_1_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1_1.setBounds(6, 402, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton(
				"Failing to reject a null hypothesis when it is actually false");
		rdbtnNewRadioButton_3_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1_1.setBounds(6, 376, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_2_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_1_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_3_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("5. What is a normal distribution?");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(6, 466, 597, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton(
				"A distribution that is symmetrical and bell-shaped");
		rdbtnNewRadioButton_2_1_1_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(6, 539, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton(
				"A distribution that is always negatively skewed");
		rdbtnNewRadioButton_1_1_1_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(6, 513, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("A distribution that is always positively skewed");
		rdbtnNewRadioButton_3_1_1_1.setFont(new Font("Serif", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1_1_1.setBounds(6, 487, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1_1);

		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(rdbtnNewRadioButton_2_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_1_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_3_1_1_1);

		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int score = 0;
				if (rdbtnNewRadioButton_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_3.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_3_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_1_1_1_1.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(Statistics.this, "Your score is: " + score);
			}
		});
		btnNewButton.setBounds(29, 569, 197, 63);
		panel_1.add(btnNewButton);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile profile = new Profile();
				profile.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(374, 569, 197, 63);
		panel_1.add(btnBack);

		JLabel lblNewLabel = new JLabel("Statistics and Probability");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		lblNewLabel.setBounds(217, 11, 363, 25);
		contentPane.add(lblNewLabel);
	}

}
