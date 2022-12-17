package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class User extends JFrame {

	private JPanel contentPane;
	public JLabel lblNewLabel;
	public JLabel Cedula;
	public JLabel Puntos;
	public JLabel lblPuntos;
	public JComboBox comboBox;
	public JLabel lblNewLabel_1;
	public JTextField textField;
	public JButton guardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
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
	public User() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Usuario Numero:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(50, 30, 155, 47);
		contentPane.add(lblNewLabel);
		
		Cedula = new JLabel("Cedula");
		Cedula.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Cedula.setBounds(200, 30, 155, 47);
		contentPane.add(Cedula);
		
		Puntos = new JLabel("Puntos");
		Puntos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		Puntos.setBounds(200, 100, 155, 47);
		contentPane.add(Puntos);
		
		lblPuntos = new JLabel("Puntos:");
		lblPuntos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPuntos.setBounds(76, 100, 97, 47);
		contentPane.add(lblPuntos);
		
		comboBox = new JComboBox();
		comboBox.setBounds(200, 194, 251, 47);
		contentPane.add(comboBox);
		
		lblNewLabel_1 = new JLabel("Pelicula que desea Comentar");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(200, 157, 238, 27);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(38, 267, 586, 140);
		contentPane.add(textField);
		textField.setColumns(10);
		
		guardar = new JButton("Comentar");
		guardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		guardar.setBounds(291, 417, 111, 37);
		contentPane.add(guardar);
	}
}
