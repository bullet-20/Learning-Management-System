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

public class ComProg extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComProg frame = new ComProg();
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
	public ComProg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 550, 750, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 80, 700, 570);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 327, 137);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("1. Which of the following is NOT a programming language?");
		lblNewLabel.setBounds(10, 11, 307, 26);
		panel_1.add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Python");
		rdbtnNewRadioButton.setBounds(6, 39, 311, 23);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("HTML");
		rdbtnNewRadioButton_1.setBounds(6, 63, 311, 23);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("JavaScript");
		rdbtnNewRadioButton_2.setBounds(6, 89, 311, 23);
		panel_1.add(rdbtnNewRadioButton_2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(10, 173, 327, 137);
		panel.add(panel_1_1);

		JLabel lblWhatIs = new JLabel("3. What is a loop in programming?");
		lblWhatIs.setBounds(10, 11, 307, 26);
		panel_1_1.add(lblWhatIs);

		JRadioButton rdbtnASectionOf = new JRadioButton("A section of code that executes once");
		rdbtnASectionOf.setBounds(6, 39, 311, 23);
		panel_1_1.add(rdbtnASectionOf);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("A section of code that executes repeatedly");
		rdbtnNewRadioButton_1_1.setBounds(6, 63, 311, 23);
		panel_1_1.add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("A statement that causes the program to stop");
		rdbtnNewRadioButton_2_1.setBounds(6, 89, 311, 23);
		panel_1_1.add(rdbtnNewRadioButton_2_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnASectionOf);
		buttonGroup2.add(rdbtnNewRadioButton_1_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_1);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(363, 11, 327, 137);
		panel.add(panel_1_1_1);

		JLabel lblWhatIs_3 = new JLabel("2. What is a variable in programming?");
		lblWhatIs_3.setBounds(10, 11, 307, 26);
		panel_1_1_1.add(lblWhatIs_3);

		JRadioButton rdbtnAWayTo = new JRadioButton("A way to store data in the program");
		rdbtnAWayTo.setBounds(6, 39, 311, 23);
		panel_1_1_1.add(rdbtnAWayTo);

		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("A statement that causes the program to stop");
		rdbtnNewRadioButton_1_1_1.setBounds(6, 63, 311, 23);
		panel_1_1_1.add(rdbtnNewRadioButton_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("A section of code that executes repeatedly");
		rdbtnNewRadioButton_2_1_1.setBounds(6, 89, 311, 23);
		panel_1_1_1.add(rdbtnNewRadioButton_2_1_1);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnAWayTo);
		buttonGroup3.add(rdbtnNewRadioButton_1_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_2_1_1);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(172, 321, 441, 137);
		panel.add(panel_1_2);

		JLabel lblWhatIs_1 = new JLabel("5. What is an array in programming?");
		lblWhatIs_1.setBounds(10, 11, 307, 26);
		panel_1_2.add(lblWhatIs_1);

		JRadioButton rdbtnAWayTo_1 = new JRadioButton("A way to store multiple values under a single variable name");
		rdbtnAWayTo_1.setBounds(6, 39, 415, 23);
		panel_1_2.add(rdbtnAWayTo_1);

		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("A way to display output on the screen");
		rdbtnNewRadioButton_1_2.setBounds(6, 63, 311, 23);
		panel_1_2.add(rdbtnNewRadioButton_1_2);

		JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton("A way to stop the execution of the program");
		rdbtnNewRadioButton_2_2.setBounds(6, 89, 311, 23);
		panel_1_2.add(rdbtnNewRadioButton_2_2);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnAWayTo_1);
		buttonGroup4.add(rdbtnNewRadioButton_1_2);
		buttonGroup4.add(rdbtnNewRadioButton_2_2);

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(363, 173, 327, 137);
		panel.add(panel_1_1_2);

		JLabel lblWhatIsDebugging = new JLabel("4. What is debugging in programming?");
		lblWhatIsDebugging.setBounds(10, 11, 307, 26);
		panel_1_1_2.add(lblWhatIsDebugging);

		JRadioButton rdbtnTheProcessOf = new JRadioButton("The process of writing code");
		rdbtnTheProcessOf.setBounds(6, 39, 311, 23);
		panel_1_1_2.add(rdbtnTheProcessOf);

		JRadioButton rdbtnNewRadioButton_1_1_2 = new JRadioButton("The process of testing code");
		rdbtnNewRadioButton_1_1_2.setBounds(6, 63, 311, 23);
		panel_1_1_2.add(rdbtnNewRadioButton_1_1_2);

		JRadioButton rdbtnNewRadioButton_2_1_2 = new JRadioButton("The process of fixing errors in code");
		rdbtnNewRadioButton_2_1_2.setBounds(6, 89, 311, 23);
		panel_1_1_2.add(rdbtnNewRadioButton_2_1_2);

		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(rdbtnTheProcessOf);
		buttonGroup5.add(rdbtnNewRadioButton_1_1_2);
		buttonGroup5.add(rdbtnNewRadioButton_2_1_2);

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
				if (rdbtnAWayTo.isSelected()) {
					score++;
				}
				if (rdbtnAWayTo_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_2_1_2.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(ComProg.this, "Your score is: " + score);
			}
		});
		btnNewButton.setBounds(10, 490, 327, 69);
		panel.add(btnNewButton);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profile profile = new Profile();
				profile.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(363, 490, 327, 69);
		panel.add(btnBack);

		JLabel lblNewLabel_1 = new JLabel("Computer Programming");
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		lblNewLabel_1.setBounds(310, 11, 301, 51);
		contentPane.add(lblNewLabel_1);

	}
}