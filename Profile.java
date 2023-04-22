import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Profile extends JFrame {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		Preferences.userRoot().node(this.getClass().getName());
		initialize();
	}

	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 992, 788);
		setTitle("Profile");
		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		String username = Preferences.userRoot().node(CreateAccount.class.getName()).get("username", "");
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 956, 0 };
		gbl_contentPane.rowHeights = new int[] { 40, 659, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JButton btnNewButton_2 = new JButton("FORUM");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 0;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);

		lblWelcome = new JLabel("Hello " + username + ", Please answer all Available Courses!!");
		lblWelcome.setFont(new Font("Corbel", Font.BOLD, 25));
		GridBagConstraints gbc_lblWelcome = new GridBagConstraints();
		gbc_lblWelcome.fill = GridBagConstraints.BOTH;
		gbc_lblWelcome.insets = new Insets(0, 0, 5, 0);
		gbc_lblWelcome.gridx = 0;
		gbc_lblWelcome.gridy = 0;
		contentPane.add(lblWelcome, gbc_lblWelcome);

		JPanel panel = new JPanel(new GridLayout(2, 3, 10, 10));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);

		JLabel lblCourses = new JLabel("Courses:");
		lblCourses.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel.add(lblCourses);

		JPanel course1Panel = new JPanel();
		course1Panel.setBorder(BorderFactory.createTitledBorder("Computer Programming"));
		panel.add(course1Panel);
		course1Panel.setLayout(null);

		JTextArea txtCourseDesc1 = new JTextArea();
		txtCourseDesc1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtCourseDesc1.setLineWrap(true);
		txtCourseDesc1.setWrapStyleWord(true);
		txtCourseDesc1.setText("Computer programming is the process of creating instructions that computers can understand and execute. These instructions are written in a programming language, which consists of a set of rules and syntax that programmers use to create programs. Programming is used in various fields such as software development, web development, game development, and more.");
		txtCourseDesc1.setEditable(false);
		JScrollPane scrollPane1 = new JScrollPane(txtCourseDesc1);
		scrollPane1.setBounds(6, 16, 196, 274);
		scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		course1Panel.add(scrollPane1);

		JButton btnNewButton_1_1_1 = new JButton("Click Enter this Course");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComProg Course = new ComProg();
				Course.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setBounds(6, 290, 196, 23);
		course1Panel.add(btnNewButton_1_1_1);

		JPanel course2Panel = new JPanel();
		course2Panel.setBorder(BorderFactory.createTitledBorder("EAAP"));
		panel.add(course2Panel);
		course2Panel.setLayout(null);

		JTextArea txtCourseDesc2 = new JTextArea();
		txtCourseDesc2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtCourseDesc2.setLineWrap(true);
		txtCourseDesc2.setWrapStyleWord(true);
		txtCourseDesc2.setText("EAAP stands for the Educational and Academic Assistance Program. This program provides academic support and assistance to students who need extra help in their studies. EAAP aims to improve students' academic performance and help them achieve their academic goals.");
		txtCourseDesc2.setEditable(false);
		JScrollPane scrollPane2 = new JScrollPane(txtCourseDesc2);
		scrollPane2.setBounds(6, 16, 196, 273);
		scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		course2Panel.add(scrollPane2);

		JButton btnNewButton_1_1_1_1 = new JButton("Click Enter this Course");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EAAP Course = new EAAP();
				Course.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1_1.setBounds(6, 290, 196, 23);
		course2Panel.add(btnNewButton_1_1_1_1);

		JPanel course3Panel = new JPanel();
		course3Panel.setBorder(BorderFactory.createTitledBorder("EMTECH"));
		panel.add(course3Panel);
		course3Panel.setLayout(null);

		JTextArea txtCourseDesc3 = new JTextArea();
		txtCourseDesc3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtCourseDesc3.setLineWrap(true);
		txtCourseDesc3.setWrapStyleWord(true);
		txtCourseDesc3.setText("EMTECH stands for Emerging Technologies. It is a field of study that focuses on the latest and most advanced technologies that are currently being developed. EMTECH covers a broad range of topics, including artificial intelligence, machine learning, blockchain, quantum computing, and more.");
		txtCourseDesc3.setEditable(false);
		JScrollPane scrollPane3 = new JScrollPane(txtCourseDesc3);
		scrollPane3.setBounds(6, 16, 196, 273);
		scrollPane3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		course3Panel.add(scrollPane3);

		JButton btnNewButton_1_1_1_2 = new JButton("Click Enter this Course");
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EMTEC Course = new EMTEC();
				Course.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1_2.setBounds(6, 290, 196, 23);
		course3Panel.add(btnNewButton_1_1_1_2);

		JPanel course4Panel = new JPanel();
		course4Panel.setBorder(BorderFactory.createTitledBorder("Filipino"));
		panel.add(course4Panel);
		course4Panel.setLayout(null);

		JTextArea txtCourseDesc4 = new JTextArea();
		txtCourseDesc4.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtCourseDesc4.setLineWrap(true);
		txtCourseDesc4.setWrapStyleWord(true);
		txtCourseDesc4.setText("Filipino is the national language of the Philippines. It is a standardized form of the Tagalog language, which is spoken by the majority of Filipinos. Filipino is taught in schools as a subject to promote national unity and identity among Filipinos.");
		txtCourseDesc4.setEditable(false);
		JScrollPane scrollPane4 = new JScrollPane(txtCourseDesc4);
		scrollPane4.setBounds(6, 16, 196, 273);
		scrollPane4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		course4Panel.add(scrollPane4);

		JButton btnNewButton = new JButton("Click Enter this Course");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Filipino Course = new Filipino();
				Course.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(6, 290, 196, 23);
		course4Panel.add(btnNewButton);

		JPanel course5Panel = new JPanel();
		course5Panel.setBorder(BorderFactory.createTitledBorder("PE"));
		panel.add(course5Panel);
		course5Panel.setLayout(null);

		JTextArea txtCourseDesc5 = new JTextArea();
		txtCourseDesc5.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtCourseDesc5.setLineWrap(true);
		txtCourseDesc5.setWrapStyleWord(true);
		txtCourseDesc5.setText("PE stands for Physical Education. It is a subject that focuses on developing physical fitness, coordination, and sportsmanship. PE classes include various physical activities such as running, swimming, basketball, and other sports.");
		txtCourseDesc5.setEditable(false);
		JScrollPane scrollPane5 = new JScrollPane(txtCourseDesc5);
		scrollPane5.setBounds(6, 16, 196, 271);
		scrollPane5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		course5Panel.add(scrollPane5);

		JButton btnNewButton_1 = new JButton("Click Enter this Course");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PE Course = new PE();
				Course.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 290, 196, 23);
		course5Panel.add(btnNewButton_1);

		JPanel course6Panel = new JPanel();
		course6Panel.setBorder(BorderFactory.createTitledBorder("PracticalResearch"));
		panel.add(course6Panel);
		course6Panel.setLayout(null);

		JTextArea txtCourseDesc6 = new JTextArea();
		txtCourseDesc6.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtCourseDesc6.setLineWrap(true);
		txtCourseDesc6.setWrapStyleWord(true);
		txtCourseDesc6.setText("Practical research is a type of research that is conducted in real-world situations to solve practical problems. It involves the application of research methods to identify and solve problems in various fields such as business, education, healthcare, and more.");
		txtCourseDesc6.setEditable(false);
		JScrollPane scrollPane6 = new JScrollPane(txtCourseDesc6);
		scrollPane6.setBounds(6, 16, 196, 273);
		scrollPane6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		course6Panel.add(scrollPane6);

		JButton btnNewButton_1_1 = new JButton("Click Enter this Course");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PracticalResearch Course = new PracticalResearch();
				Course.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(6, 290, 196, 23);
		course6Panel.add(btnNewButton_1_1);

		JPanel course6Panel_1 = new JPanel();
		course6Panel_1.setLayout(null);
		course6Panel_1.setBorder(BorderFactory.createTitledBorder("Statistics and Probability"));
		panel.add(course6Panel_1);

		JScrollPane scrollPane6_1 = new JScrollPane((Component) null);
		scrollPane6_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane6_1.setBounds(6, 16, 196, 273);
		course6Panel_1.add(scrollPane6_1);

		JTextArea txtCourseDesc6_1 = new JTextArea();
		txtCourseDesc6_1.setWrapStyleWord(true);
		txtCourseDesc6_1.setText("Statistics and probability are branches of mathematics that deal with the analysis and interpretation of data. Statistics involves the collection, organization, and analysis of data, while probability deals with the likelihood of events occurring based on statistical analysis. These fields are used in a wide range of industries, from finance and economics to medicine and science.");
		txtCourseDesc6_1.setLineWrap(true);
		txtCourseDesc6_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		txtCourseDesc6_1.setEditable(false);
		scrollPane6_1.setViewportView(txtCourseDesc6_1);

		JButton btnNewButton_1_1_2 = new JButton("Click Enter this Course");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statistics Course = new Statistics();
				Course.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_2.setBounds(6, 290, 196, 23);
		course6Panel_1.add(btnNewButton_1_1_2);
	}
}