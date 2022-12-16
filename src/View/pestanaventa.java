package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;

public class pestanaventa extends JFrame {

	private JPanel contentPane;
	public JPanel panel;
	public JTextField cedulaT;
	public JLabel Pad;
	public JLabel Puntos;
	public JComboBox multiplex;
	public JComboBox pelicula;
	public JComboBox horario;
	public JLabel lblNewLabel;
	public JLabel SnacksAd;
	public JLabel TotalAd;
	public JLabel TotalT;
	public JLabel SDinero;
	public JLabel Total;
	public JLabel lblNewLabel_1;
	public JButton discount;
	public JButton PA;
	public JPanel panel_1;
	public JLabel Distribucionad;
	public JPanel board;
	public JLabel lblSeleccionarSnacks;
	public JLabel image2;
	public JLabel image3;
	public JButton plus1;
	public JButton plus2;
	public JButton plus3;
	public JButton min1;
	public JButton min2;
	public JButton min3;
	public JLabel ct1;
	public JLabel ct2;
	public JLabel ct3;
	public JLabel image1;
	public JButton testbutton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pestanaventa frame = new pestanaventa();
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
	public pestanaventa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(10, 10, 382, 445);
		contentPane.add(panel);
		panel.setLayout(null);

		cedulaT = new JTextField();
		cedulaT.setBounds(10, 10, 174, 45);
		panel.add(cedulaT);
		cedulaT.setColumns(10);

		Pad = new JLabel("Puntos");
		Pad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Pad.setBounds(255, 65, 80, 30);
		panel.add(Pad);

		Puntos = new JLabel("Puntos");
		Puntos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Puntos.setBounds(255, 105, 57, 18);
		panel.add(Puntos);

		multiplex = new JComboBox();
		multiplex.setBounds(10, 74, 174, 45);
		panel.add(multiplex);

		pelicula = new JComboBox();
		pelicula.setBounds(10, 148, 174, 45);
		panel.add(pelicula);

		horario = new JComboBox();
		horario.setBounds(10, 219, 174, 45);
		panel.add(horario);

		lblNewLabel = new JLabel("Total Tickets");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 307, 105, 30);
		panel.add(lblNewLabel);

		SnacksAd = new JLabel("Total Snacks");
		SnacksAd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SnacksAd.setBounds(10, 347, 105, 24);
		panel.add(SnacksAd);

		TotalAd = new JLabel("Total");
		TotalAd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TotalAd.setBounds(50, 400, 119, 30);
		panel.add(TotalAd);

		TotalT = new JLabel("Dinero");
		TotalT.setFont(new Font("Tahoma", Font.PLAIN, 17));
		TotalT.setBounds(140, 307, 105, 30);
		panel.add(TotalT);

		SDinero = new JLabel("0");
		SDinero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		SDinero.setBounds(140, 347, 105, 24);
		panel.add(SDinero);

		Total = new JLabel("0");
		Total.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Total.setBounds(150, 405, 105, 24);
		panel.add(Total);

		lblNewLabel_1 = new JLabel("Usar Puntos?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(255, 319, 109, 13);
		panel.add(lblNewLabel_1);

		discount = new JButton("Descontar");
		discount.setBounds(255, 359, 108, 37);
		panel.add(discount);

		PA = new JButton("Actualizar Puntos");
		PA.setBounds(224, 10, 128, 45);
		panel.add(PA);

		testbutton = new JButton("comprar ticket");
		testbutton.setBounds(224, 197, 130, 45);
		panel.add(testbutton);

		panel_1 = new JPanel();
		panel_1.setBounds(402, 10, 472, 445);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		Distribucionad = new JLabel("Distribucion de Sillas");
		Distribucionad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Distribucionad.setBounds(143, 28, 166, 30);
		panel_1.add(Distribucionad);

		board = new JPanel();
		board.setBackground(Color.GRAY);
		board.setBounds(10, 68, 452, 200);
		panel_1.add(board);
		board.setLayout(new GridLayout(1, 0, 0, 0));

		lblSeleccionarSnacks = new JLabel("Seleccionar Snacks");
		lblSeleccionarSnacks.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSeleccionarSnacks.setBounds(143, 278, 153, 30);
		panel_1.add(lblSeleccionarSnacks);

		image2 = new JLabel("");
		image2.setBounds(166, 359, 65, 50);
		panel_1.add(image2);
		Image palomitas = new ImageIcon(this.getClass().getResource("/imag/palomitas2.png")).getImage();
		image2.setIcon(new ImageIcon(palomitas));

		image3 = new JLabel("");
		image3.setBounds(316, 355, 39, 55);
		panel_1.add(image3);
		Image sudan = new ImageIcon(this.getClass().getResource("/imag/sudan1.png")).getImage();
		image3.setIcon(new ImageIcon(sudan));
		plus1 = new JButton("+");
		plus1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		plus1.setBounds(117, 355, 45, 24);
		panel_1.add(plus1);

		plus2 = new JButton("+");
		plus2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		plus2.setBounds(257, 354, 45, 24);
		panel_1.add(plus2);

		plus3 = new JButton("+");
		plus3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		plus3.setBounds(356, 355, 45, 24);
		panel_1.add(plus3);

		min1 = new JButton("-");
		min1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		min1.setBounds(117, 385, 45, 24);
		panel_1.add(min1);

		min2 = new JButton("-");
		min2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		min2.setBounds(257, 388, 45, 24);
		panel_1.add(min2);

		min3 = new JButton("-");
		min3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		min3.setBounds(356, 386, 45, 24);
		panel_1.add(min3);

		ct1 = new JLabel("Cantidad");
		ct1.setBounds(26, 336, 65, 13);
		panel_1.add(ct1);

		ct2 = new JLabel("Cantidad");
		ct2.setBounds(169, 336, 60, 13);
		panel_1.add(ct2);

		ct3 = new JLabel("Cantidad");
		ct3.setBounds(356, 336, 60, 13);
		panel_1.add(ct3);

		image1 = new JLabel("");
		image1.setBounds(26, 355, 65, 54);
		panel_1.add(image1);
		Image hot = new ImageIcon(this.getClass().getResource("/imag/jotoperro1.png")).getImage();
		image1.setIcon(new ImageIcon(hot));

	}
}
