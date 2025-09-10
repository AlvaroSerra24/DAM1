package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresarT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ingt;
	static IngresarT frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new IngresarT();
					frame1.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public JTextField getIngt() {
		return ingt;
	}


	public void setIngt(JTextField ingt) {
		this.ingt = ingt;
	}


	/**
	 * Create the frame.
	 */
	public IngresarT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dime cuanto dinero quieres ingresar en la tarjeta");
		lblNewLabel.setBounds(77, 60, 248, 14);
		contentPane.add(lblNewLabel);
		
		ingt = new JTextField();
		ingt.setBounds(77, 90, 248, 20);
		contentPane.add(ingt);
		ingt.setColumns(10);
		
		JButton boton = new JButton("Ingresar Saldo");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;
				int tarjeta= Integer.parseInt(menu.frame1.getTarjeta().getText());
				int ing= Integer.parseInt(IngresarT.frame1.getIngt().getText());
				total=tarjeta+ing;
				menu.frame1.getTarjeta().setText(Integer.toString(total));
				IngresarC.frame1.setVisible(false);
				menu.frame1.setVisible(true);
			}
		});
		boton.setBounds(242, 159, 126, 23);
		contentPane.add(boton);
	}

}
