package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel CineDistrital;
	public JLabel advert;
	public JTextField CodigoE;
	public JButton Login;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("REGISTRO CINE DISTRITAL");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 418);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(58, 53, 432, 286);
		contentPane.add(panel);
		panel.setLayout(null);

		CineDistrital = new JLabel("Cine Distrital");
		CineDistrital.setHorizontalAlignment(SwingConstants.CENTER);
		CineDistrital.setIcon(new ImageIcon(Menu.class.getResource("/imag/logos.png")));
		CineDistrital.setBounds(28, 21, 380, 87);
		panel.add(CineDistrital);

		advert = new JLabel("Introduzca su cedula o codigo de empleado");
		advert.setHorizontalAlignment(SwingConstants.CENTER);
		advert.setFont(new Font("Tahoma", Font.PLAIN, 20));
		advert.setBounds(10, 119, 398, 60);
		panel.add(advert);

		CodigoE = new JTextField();
		CodigoE.setBackground(new Color(153, 204, 204));
		CodigoE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CodigoE.setBounds(64, 178, 293, 43);
		panel.add(CodigoE);
		CodigoE.setColumns(10);

		Login= new JButton();
		
		Login.setToolTipText("INICIAR");
		Login.setOpaque(false);
		Login.setBorder(new EmptyBorder(0, 0, 0, 0));
		Login.setMargin(new Insets(0, 0, 0, 0));
		Login.setBorderPainted(false);
		Login.setBackground(new Color(75, 0, 130));
		Login.setIcon(new ImageIcon(Menu.class.getResource("/imag/ingreso.png")));
		Login.setBounds(175, 232, 75, 35);

		panel.add(Login);
		
		JLabel lblfondo = new JLabel("New label");
		lblfondo.setIcon(new ImageIcon(Menu.class.getResource("/imag/pxlogin.gif")));
		lblfondo.setBounds(0, 0, 553, 379);
		contentPane.add(lblfondo);
this.Login.setEnabled(true);
		
	
	}
}
