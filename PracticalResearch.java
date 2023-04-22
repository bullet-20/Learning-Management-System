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

public class PracticalResearch extends JFrame {

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
					PracticalResearch frame = new PracticalResearch();
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
	public PracticalResearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 47, 664, 643);
		contentPane.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("1. What is the main purpose of practical research?");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(6, 18, 572, 14);
		panel_1.add(lblNewLabel_1);

		JRadioButton rdbtnToDevelopNew = new JRadioButton("To develop new theories and concepts");
		rdbtnToDevelopNew.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnToDevelopNew.setBounds(6, 39, 654, 23);
		panel_1.add(rdbtnToDevelopNew);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("To solve practical problems and improve practices");
		rdbtnNewRadioButton_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_1.setBounds(6, 63, 654, 23);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("To explore philosophical questions");
		rdbtnNewRadioButton_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_2.setBounds(6, 89, 654, 23);
		panel_1.add(rdbtnNewRadioButton_2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnToDevelopNew);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_1_1 = new JLabel("2. Which of the following is not a common type of practical research?");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(6, 131, 533, 14);
		panel_1.add(lblNewLabel_1_1);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Case study research");
		rdbtnNewRadioButton_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_3.setBounds(6, 152, 654, 23);
		panel_1.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Basic research");
		rdbtnNewRadioButton_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1.setBounds(6, 178, 654, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Experimental research");
		rdbtnNewRadioButton_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1.setBounds(6, 204, 654, 23);
		panel_1.add(rdbtnNewRadioButton_2_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_3);
		buttonGroup2.add(rdbtnNewRadioButton_1_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel(
				"3. What is the difference between quantitative and qualitative research?");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(6, 243, 597, 14);
		panel_1.add(lblNewLabel_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton(
				"Quantitative research deals with numbers, while qualitative research deals with words and meanings.");
		rdbtnNewRadioButton_3_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1.setBounds(6, 264, 654, 23);
		panel_1.add(rdbtnNewRadioButton_3_1);

		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton(
				"Qualitative research is more reliable than quantitative research.");
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1.setBounds(6, 290, 654, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton(
				"There is no difference between quantitative and qualitative research.");
		rdbtnNewRadioButton_2_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1.setBounds(6, 316, 654, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_3_1);
		buttonGroup3.add(rdbtnNewRadioButton_1_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_2_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("4. What is a hypothesis?");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setBounds(6, 355, 654, 14);
		panel_1.add(lblNewLabel_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1 = new JRadioButton(
				"A prediction or educated guess about the relationship between variables.");
		rdbtnNewRadioButton_2_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1_1.setBounds(6, 428, 654, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("A type of research design.");
		rdbtnNewRadioButton_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1_1.setBounds(6, 402, 654, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton(
				"An established fact in a particular field of study.");
		rdbtnNewRadioButton_3_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1_1.setBounds(6, 376, 654, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_2_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_1_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_3_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(
				"5. What is the purpose of a literature review in practical research?");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1_1_1_1.setBounds(6, 466, 597, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton(
				"To identify gaps in existing knowledge and research.");
		rdbtnNewRadioButton_2_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(6, 539, 654, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("To summarize the results of previous studies.");
		rdbtnNewRadioButton_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(6, 513, 654, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("To collect primary data for the study.");
		rdbtnNewRadioButton_3_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		rdbtnNewRadioButton_3_1_1_1.setBounds(6, 487, 654, 23);
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
				if (rdbtnNewRadioButton_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_3_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_1_1_1_1.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(PracticalResearch.this, "Your score is: " + score);
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

		JLabel lblNewLabel = new JLabel("Practical Research");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		lblNewLabel.setBounds(249, 11, 283, 25);
		contentPane.add(lblNewLabel);
	}

}