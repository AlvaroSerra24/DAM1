package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Ventana2 frame2;
	private JTextField texto2;
	private JButton boton2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public JTextField getTexto2() {
		return texto2;
	}


	public void setTexto2(JTextField texto2) {
		this.texto2 = texto2;
	}


	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto2 = new JTextField();
		texto2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		texto2.setEditable(false);
		texto2.setBounds(95, 71, 220, 51);
		contentPane.add(texto2);
		texto2.setColumns(10);
		
		boton2 = new JButton("Volver a Ventana 1");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				Ventana1.frame1.setVisible(true);
			}
		});
		boton2.setBounds(125, 162, 164, 23);
		contentPane.add(boton2);
	}

}
