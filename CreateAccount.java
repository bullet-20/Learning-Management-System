import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CreateAccount {
	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	private JPasswordField txtRepeatPassword;
	private JCheckBox chkViewPassword;
	private JButton btnCreateAccount;
	private Preferences prefs;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateAccount window = new CreateAccount();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CreateAccount() {
		prefs = Preferences.userRoot().node(this.getClass().getName());
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 95, 142, 159, 273, 0 };
		gridBagLayout.rowHeights = new int[] { 44, 69, 54, 65, 38, 66, 29, 40, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.fill = GridBagConstraints.BOTH;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 1;
		frame.getContentPane().add(lblUsername, gbc_lblUsername);

		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.fill = GridBagConstraints.BOTH;
		gbc_txtUsername.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsername.gridwidth = 3;
		gbc_txtUsername.gridx = 1;
		gbc_txtUsername.gridy = 1;
		frame.getContentPane().add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.fill = GridBagConstraints.BOTH;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 0);
		gbc_lblPassword.gridwidth = 4;
		gbc_lblPassword.gridx = 0;
		gbc_lblPassword.gridy = 3;
		frame.getContentPane().add(lblPassword, gbc_lblPassword);

		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.fill = GridBagConstraints.BOTH;
		gbc_txtPassword.insets = new Insets(0, 0, 5, 0);
		gbc_txtPassword.gridwidth = 3;
		gbc_txtPassword.gridx = 1;
		gbc_txtPassword.gridy = 3;
		frame.getContentPane().add(txtPassword, gbc_txtPassword);

		JLabel lblRepeatPassword = new JLabel("Repeat Password:");
		lblRepeatPassword.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRepeatPassword = new GridBagConstraints();
		gbc_lblRepeatPassword.anchor = GridBagConstraints.WEST;
		gbc_lblRepeatPassword.gridwidth = 2;
		gbc_lblRepeatPassword.fill = GridBagConstraints.VERTICAL;
		gbc_lblRepeatPassword.insets = new Insets(0, 0, 5, 0);
		gbc_lblRepeatPassword.gridx = 0;
		gbc_lblRepeatPassword.gridy = 5;
		frame.getContentPane().add(lblRepeatPassword, gbc_lblRepeatPassword);

		txtRepeatPassword = new JPasswordField();
		txtRepeatPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_txtRepeatPassword = new GridBagConstraints();
		gbc_txtRepeatPassword.fill = GridBagConstraints.BOTH;
		gbc_txtRepeatPassword.insets = new Insets(0, 0, 5, 0);
		gbc_txtRepeatPassword.gridwidth = 2;
		gbc_txtRepeatPassword.gridx = 2;
		gbc_txtRepeatPassword.gridy = 5;
		frame.getContentPane().add(txtRepeatPassword, gbc_txtRepeatPassword);

		chkViewPassword = new JCheckBox("View password");
		chkViewPassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		GridBagConstraints gbc_chkViewPassword = new GridBagConstraints();
		gbc_chkViewPassword.anchor = GridBagConstraints.NORTH;
		gbc_chkViewPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_chkViewPassword.insets = new Insets(0, 0, 5, 5);
		gbc_chkViewPassword.gridx = 1;
		gbc_chkViewPassword.gridy = 6;
		frame.getContentPane().add(chkViewPassword, gbc_chkViewPassword);
		chkViewPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkViewPassword.isSelected()) {
					txtPassword.setEchoChar((char) 0);
					txtRepeatPassword.setEchoChar((char) 0);
				} else {
					txtPassword.setEchoChar('*');
					txtRepeatPassword.setEchoChar('*');
				}
			}
		});

		btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		GridBagConstraints gbc_btnCreateAccount = new GridBagConstraints();
		gbc_btnCreateAccount.anchor = GridBagConstraints.WEST;
		gbc_btnCreateAccount.fill = GridBagConstraints.VERTICAL;
		gbc_btnCreateAccount.gridx = 3;
		gbc_btnCreateAccount.gridy = 7;
		frame.getContentPane().add(btnCreateAccount, gbc_btnCreateAccount);
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = new String(txtPassword.getPassword());
				String repeatPassword = new String(txtRepeatPassword.getPassword());

				if (username.isEmpty() || password.isEmpty() || repeatPassword.isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Please enter a username and password.");
					return;
				}

				if (!password.equals(repeatPassword)) {
					JOptionPane.showMessageDialog(frame, "Passwords do not match.");
					return;
				}

				prefs.put("username", username);
				prefs.put("password", password);

				JOptionPane.showMessageDialog(frame, "Account created successfully.");

				frame.dispose();
				Profile profile = new Profile();
				profile.setVisible(true);
			}
		});
	}

	public void setVisible(boolean b) {

	}
}