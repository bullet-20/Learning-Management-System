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

public class Filipino extends JFrame {

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
					Filipino frame = new Filipino();
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
	public Filipino() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("FILIPINO");
		lblNewLabel.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		lblNewLabel.setBounds(279, 11, 454, 45);
		contentPane.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 51, 664, 643);
		contentPane.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel(
				"1. Anong uri ng teksto ang naglalaman ng mga pangangailangan at pangangailangan ng isang tao?");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_1.setBounds(0, 14, 657, 14);
		panel_1.add(lblNewLabel_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Tekstong impormatibo");
		rdbtnNewRadioButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(0, 35, 641, 23);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tekstong deskriptibo");
		rdbtnNewRadioButton_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(0, 59, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Tekstong naratibo");
		rdbtnNewRadioButton_2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(0, 85, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_1_1 = new JLabel("2. Ano ang layunin ng paggamit ng mga grap sa isang teksto?");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(0, 127, 657, 14);
		panel_1.add(lblNewLabel_1_1);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Upang gawing mas malinaw ang mga ideya sa teksto");
		rdbtnNewRadioButton_3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_3.setBounds(0, 148, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Upang magbigay ng estetikong halaga sa teksto");
		rdbtnNewRadioButton_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1.setBounds(0, 174, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);

		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Upang bigyan ng dagdag na espasyo sa teksto");
		rdbtnNewRadioButton_2_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_2_1.setBounds(0, 200, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1);

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(rdbtnNewRadioButton_3);
		buttonGroup2.add(rdbtnNewRadioButton_1_1);
		buttonGroup2.add(rdbtnNewRadioButton_2_1);

		JLabel lblNewLabel_1_1_1 = new JLabel(
				"3. Ano ang tawag sa paglalagom ng mga mahahalagang punto sa isang teksto?");
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_1_1_1.setBounds(0, 239, 657, 14);
		panel_1.add(lblNewLabel_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Pagbubuod");
		rdbtnNewRadioButton_3_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_3_1.setBounds(0, 260, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1);

		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Paglalarawan");
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1_1.setBounds(0, 286, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1 = new JRadioButton("Pag-uulit-ulit");
		rdbtnNewRadioButton_2_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_2_1_1.setBounds(0, 312, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1);

		ButtonGroup buttonGroup3 = new ButtonGroup();
		buttonGroup3.add(rdbtnNewRadioButton_3_1);
		buttonGroup3.add(rdbtnNewRadioButton_1_1_1);
		buttonGroup3.add(rdbtnNewRadioButton_2_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel(
				"4. Anong bahagi ng pananaliksik ang naglalaman ng mga layunin, katanungan at saklaw ng pag-aaral?");
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_1_1_1_1.setBounds(0, 351, 664, 14);
		panel_1.add(lblNewLabel_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1 = new JRadioButton("Konklusyon");
		rdbtnNewRadioButton_2_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_2_1_1_1.setBounds(0, 424, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("Introduksyon");
		rdbtnNewRadioButton_1_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1_1_1.setBounds(0, 398, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("Abstrak");
		rdbtnNewRadioButton_3_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_3_1_1.setBounds(0, 372, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1);

		ButtonGroup buttonGroup4 = new ButtonGroup();
		buttonGroup4.add(rdbtnNewRadioButton_2_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_1_1_1_1);
		buttonGroup4.add(rdbtnNewRadioButton_3_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(
				"5. Ano ang tawag sa pagbibigay ng pagkilala sa mga sanggunian na ginamit sa pananaliksik?");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 13));
		lblNewLabel_1_1_1_1_1.setBounds(0, 462, 657, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_2_1_1_1_1 = new JRadioButton("Paksa");
		rdbtnNewRadioButton_2_1_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_2_1_1_1_1.setBounds(0, 535, 641, 23);
		panel_1.add(rdbtnNewRadioButton_2_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_1_1_1_1_1 = new JRadioButton("Anotasyon");
		rdbtnNewRadioButton_1_1_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1_1_1_1.setBounds(0, 509, 641, 23);
		panel_1.add(rdbtnNewRadioButton_1_1_1_1_1);

		JRadioButton rdbtnNewRadioButton_3_1_1_1 = new JRadioButton("Bibliograpiya");
		rdbtnNewRadioButton_3_1_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		rdbtnNewRadioButton_3_1_1_1.setBounds(0, 483, 641, 23);
		panel_1.add(rdbtnNewRadioButton_3_1_1_1);

		ButtonGroup buttonGroup5 = new ButtonGroup();
		buttonGroup5.add(rdbtnNewRadioButton_2_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_1_1_1_1_1);
		buttonGroup5.add(rdbtnNewRadioButton_3_1_1_1);

		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int score = 0;
				if (rdbtnNewRadioButton.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_3.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_1_1_1_1.isSelected()) {
					score++;
				}
				if (rdbtnNewRadioButton_3_1_1_1.isSelected()) {
					score++;
				}
				JOptionPane.showMessageDialog(Filipino.this, "Your score is: " + score);
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