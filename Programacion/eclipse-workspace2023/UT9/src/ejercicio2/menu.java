package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;

public class menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField cuenta;
	private JTextField tarjeta;
	static menu frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new menu();
					frame1.setVisible(true);
					IngresarC.frame1=new IngresarC();
					IngresarC.frame1.setVisible(false);
					IngresarT.frame1=new IngresarT();
					IngresarT.frame1.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	




	public JTextField getCuenta() {
		return cuenta;
	}





	public void setCuenta(JTextField cuenta) {
		this.cuenta = cuenta;
	}





	public JTextField getTarjeta() {
		return tarjeta;
	}





	public void setTarjeta(JTextField tarjeta) {
		this.tarjeta = tarjeta;
	}





	/**
	 * Create the frame.
	 */
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ingresarc = new JButton("Ingresar en Cuenta");
		ingresarc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.frame1.setVisible(false);
				IngresarC.frame1.setVisible(true);
			}
		});
		ingresarc.setBounds(40, 11, 143, 23);
		contentPane.add(ingresarc);
		
		JButton sacarc = new JButton("Sacar Dinero de la Cuenta");
		sacarc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		sacarc.setBounds(264, 11, 194, 23);
		contentPane.add(sacarc);
		
		JButton trans = new JButton("Transferir de Cuenta a Tarjeta");
		trans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		trans.setBounds(518, 11, 218, 23);
		contentPane.add(trans);
		
		JButton ingresart = new JButton("Ingresar en Tarjeta");
		ingresart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.frame1.setVisible(false);
				IngresarT.frame1.setVisible(true);
			}
		});
		ingresart.setBounds(40, 88, 143, 23);
		contentPane.add(ingresart);
		
		JButton sacart = new JButton("Sacar Dinero de la Tarjeta");
		sacart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sacart.setBounds(264, 88, 194, 23);
		contentPane.add(sacart);
		
		JLabel lblNewLabel = new JLabel("Saldo Cuenta:");
		lblNewLabel.setBounds(83, 166, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Saldo Tarjeta:");
		lblNewLabel_1.setBounds(83, 194, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		cuenta = new JTextField();
		cuenta.setText("0");
		cuenta.setEditable(false);
		cuenta.setBounds(193, 163, 280, 20);
		contentPane.add(cuenta);
		cuenta.setColumns(10);
		
		tarjeta = new JTextField();
		tarjeta.setText("0");
		tarjeta.setEditable(false);
		tarjeta.setBounds(193, 191, 280, 20);
		contentPane.add(tarjeta);
		tarjeta.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.frame1.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(588, 190, 89, 23);
		contentPane.add(btnNewButton_4);
	}

}
