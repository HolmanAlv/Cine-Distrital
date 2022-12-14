package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel CineDistrital;
	public JLabel advert;
	public JTextField CodigoE;
	public JButton Login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 519, 361);
		contentPane.add(panel);
		panel.setLayout(null);

		CineDistrital = new JLabel("Cine Distrital");
		CineDistrital.setHorizontalAlignment(SwingConstants.CENTER);
		CineDistrital.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CineDistrital.setBounds(134, 29, 222, 60);
		panel.add(CineDistrital);

		advert = new JLabel("Introduzca su cedula o codigo de empleado");
		advert.setHorizontalAlignment(SwingConstants.CENTER);
		advert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		advert.setBounds(53, 99, 398, 60);
		panel.add(advert);

		CodigoE = new JTextField();
		CodigoE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CodigoE.setBounds(113, 170, 293, 43);
		panel.add(CodigoE);
		CodigoE.setColumns(10);

		Login = new JButton("Login");
		Login.setBounds(182, 239, 140, 54);
		panel.add(Login);
	}
}
