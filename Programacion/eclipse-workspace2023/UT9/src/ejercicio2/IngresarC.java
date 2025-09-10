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
import javax.swing.JFormattedTextField;

public class IngresarC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ingc;
	static IngresarC frame1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new IngresarC();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	public JTextField getIngc() {
		return ingc;
	}



	public void setIngc(JTextField ingc) {
		this.ingc = ingc;
	}



	/**
	 * Create the frame.
	 */
	public IngresarC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dime cuanto dinero quieres ingresar en la cuenta");
		lblNewLabel.setBounds(81, 50, 270, 14);
		contentPane.add(lblNewLabel);
		
		ingc = new JTextField();
		ingc.setBounds(81, 75, 270, 20);
		contentPane.add(ingc);
		ingc.setColumns(10);
		
		JButton ings = new JButton("Ingresar Saldo");
		ings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int total=0;
				int cuenta= Integer.parseInt(menu.frame1.getCuenta().getText());
				int ing= Integer.parseInt(IngresarC.frame1.getIngc().getText());
				total=cuenta+ing;
				menu.frame1.getCuenta().setText(Integer.toString(total));
				IngresarC.frame1.setVisible(false);
				menu.frame1.setVisible(true);
			}
		});
		ings.setBounds(273, 161, 123, 23);
		contentPane.add(ings);
	}

}
