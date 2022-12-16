package View;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Insets;

// MUESTRA EL MENU PRINCIPAL  
public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton inicio;
	private JLabel tituloMenu;
	private JButton salir;
	private JButton autores;
	/**
	 * Launch the application.
	 */

	public Menu() {
		setUndecorated(true);

		// REPRODUCE LA MUSICA DE FONDO
		

		setTitle("CINE DISTRITAL");
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 323);
		contentPane = new JPanel();
		contentPane.setVerifyInputWhenFocusTarget(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// LABEL TITULO DEL MENU
		tituloMenu = new JLabel("");
		tituloMenu.setIcon(new ImageIcon(Menu.class.getResource("/imag/logos.png")));
		tituloMenu.setBounds(85, 35, 380, 87);
		contentPane.add(tituloMenu);

		// BOTON INICIAR
		inicio = new JButton("");
		inicio.setToolTipText("INICIAR");
		inicio.setOpaque(false);
		inicio.setBorder(new EmptyBorder(0, 0, 0, 0));
		inicio.setMargin(new Insets(0, 0, 0, 0));
		inicio.setBorderPainted(false);
		inicio.setBackground(new Color(75, 0, 130));
		inicio.setIcon(new ImageIcon(Menu.class.getResource("/imag/ingreso.png")));
		inicio.setBounds(236, 185, 75, 35);
		contentPane.add(inicio);
		inicio.addActionListener(new ActionListener() {

			// ABRE EL REGISTRO DE USUARIO
			public void actionPerformed(ActionEvent evt) {
				Login frame = new Login();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				setVisible(false);

			}
		});

		
		// BOTON PARA SALIR DEL JUEGO
		salir = new JButton("");
		salir.setToolTipText("SALIR");
		salir.setIcon(new ImageIcon(Menu.class.getResource("/imag/salirm.png")));
		salir.setOpaque(false);
		salir.setMargin(new Insets(0, 0, 0, 0));
		salir.setBorderPainted(false);
		salir.setBorder(new EmptyBorder(0, 0, 0, 0));
		salir.setBackground(new Color(75, 0, 130));
		salir.setBounds(236, 231, 75, 35);
		contentPane.add(salir);
		salir.addActionListener(new ActionListener() {
			// ACTION LISTENER PARA EL JOPTIONPANE
			public void actionPerformed(ActionEvent evt) {
				Icon imag = new ImageIcon(getClass().getResource("/imag/triste.png"));
				String botones[] = { "   SI :(  ", "   NO  " };
				int eleccion = JOptionPane.showOptionDialog(null, "ESTA SEGURO QUE DESEA SALIR?", "SALIDA", 0, 0, imag,
						botones, this);
				if (eleccion == 0) {
					System.exit(WIDTH);
				}
			}
		});
		// BOTON PARA IR AL JFRAME DE CREDITOS
		autores = new JButton("");
		autores.setToolTipText("AUTORES");
		autores.setIcon(new ImageIcon(Menu.class.getResource("/imag/autor.png")));
		autores.setOpaque(false);
		autores.setMargin(new Insets(0, 0, 0, 0));
		autores.setBorderPainted(false);
		autores.setBorder(new EmptyBorder(0, 0, 0, 0));
		autores.setBackground(new Color(75, 0, 130));
		autores.setBounds(236, 277, 75, 30);
		contentPane.add(autores);
		autores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				//Creditos mostrar = new Creditos();
				//mostrar.setVisible(true);
				//mostrar.setLocationRelativeTo(null);
				setVisible(false);
			}
		});

		// LABEL DEL FONDO CON EL GIF
		JLabel fondoMenu = new JLabel("");
		fondoMenu.setIcon(new ImageIcon(Menu.class.getResource("/imag/cinemas.gif")));
		fondoMenu.setBounds(0, 0, 553, 323);
		contentPane.add(fondoMenu);

	}
}