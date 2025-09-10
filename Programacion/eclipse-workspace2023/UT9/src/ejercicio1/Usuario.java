package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuario;
	private JTextField clave;
	private JTextField incorrecto;
	static Usuario frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new Usuario();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Usuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textou = new JLabel("Usuario:");
		textou.setBounds(66, 64, 75, 14);
		contentPane.add(textou);
		
		JLabel textoc = new JLabel("Clave:");
		textoc.setBounds(66, 110, 95, 14);
		contentPane.add(textoc);
		
		usuario = new JTextField();
		usuario.setBounds(151, 61, 175, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		clave = new JTextField();
		clave.setBounds(151, 107, 175, 20);
		contentPane.add(clave);
		clave.setColumns(10);
		
		JButton entrar = new JButton("Entrar");
		entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usuario.getText().equals("pepe") && clave.getText().equals("1234")) {
					Usuario.frame1.getIncorrecto().setText("Bienvenido");
				}else {
					Usuario.frame1.getIncorrecto().setText("Incorrecto");
				}
			}
		});
		entrar.setBounds(72, 153, 89, 23);
		contentPane.add(entrar);
		
		JButton salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
			}
		});
		salir.setBounds(237, 153, 89, 23);
		contentPane.add(salir);
		
		incorrecto = new JTextField();
		incorrecto.setEditable(false);
		incorrecto.setBounds(95, 205, 213, 20);
		contentPane.add(incorrecto);
		incorrecto.setColumns(10);
		
		
	}

	public JTextField getIncorrecto() {
		return incorrecto;
	}

	public void setIncorrecto(JTextField incorrecto) {
		this.incorrecto = incorrecto;
	}

}
