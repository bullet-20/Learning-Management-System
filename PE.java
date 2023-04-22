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

public class PE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PE frame = new PE();
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
	public PE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("P.E.");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.BOLD, 15));
		lblNewLabel.setBounds(269, 11, 254, 31);
		contentPane.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 58, 647, 643);
		contentPane.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("1. Which of the following is NOT a component of physical fitness?");
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_1.setBounds(6, 18, 641, 14);
		panel_1.add(lblNewLabel_1);

		JRadioButton rdbtnCardiovascularEndurance = new JRadioButton("Cardiovascular endurance");
		rdbtnCardiovascularEndurance.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnCardiovascularEndurance.setBounds(6, 39, 641, 23);
		panel_1.add(rdbtnCardiovascularEndurance);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Flexibility");
		rdbtnNewRadioButton_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(6, 63, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Intelligence");
		rdbtnNewRadioButton_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(6, 89, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnCardiovascularEndurance);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_1_1 = new JLabel(
				"2. What is the recommended daily amount of moderate physical activity for adults?");
		lblNewLabel_1_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(6, 131, 641, 14);
		panel_1.add(lblNewLabel_1_1);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("10 Minutes");
		rdbtnNewRadioButton_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(6, 152, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("30 Minutes");
		rdbtnNewRadioButton_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1.setBounds(6, 178, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("60 minutes");
		rdbtnNewRadioButton_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1.setBounds(6, 204, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_3);
		buttonGroup2.add(rdbtnNewRadioButton_1_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("3. What is the most accurate way to measure body composition?");
		lblNewLabel_1_1_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(6, 243, 641, 14);
		panel_1.add(lblNewLabel_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("BMI");
		rdbtnNewRadioButton_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1.setBounds(6, 264, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1);

		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Skinfold calipers");
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1.setBounds(6, 290, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("Bioelectrical impedance analysis");
		rdbtnNewRadioButton_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1.setBounds(6, 316, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_3_1);
		buttonGroup3.add(rdbtnNewRadioButton_1_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_2_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("4. Which of the following is an example of a plyometric exercise?");
		lblNewLabel_1_1_1_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(6, 355, 654, 14);
		panel_1.add(lblNewLabel_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1 = new JRadioButton("Box jumps");
		rdbtnNewRadioButton_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1_1.setBounds(6, 428, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("Squat");
		rdbtnNewRadioButton_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1_1.setBounds(6, 402, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("Bench press");
		rdbtnNewRadioButton_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1_1.setBounds(6, 376, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_2_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_1_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_3_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(
				"5. What is the recommended percentage of maximum heart rate to aim for during aerobic exercise?");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(6, 466, 641, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton("110-120%");
		rdbtnNewRadioButton_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(6, 539, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("70-80%");
		rdbtnNewRadioButton_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(6, 513, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("50-60%");
		rdbtnNewRadioButton_3_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
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
				if (rdbtnNewRadioButton_2.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_1_1_1_1.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(PE.this, "Your score is: " + score);
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
	}

}