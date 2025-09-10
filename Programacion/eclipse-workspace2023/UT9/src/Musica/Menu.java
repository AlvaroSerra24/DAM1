package Musica;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;


public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Menu frame2;
	private JTextField codigo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new Menu();
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Grupos y Canciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(260, 11, 511, 44);
		contentPane.add(lblNewLabel);
		
		JTextArea panel = new JTextArea();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(255, 0, 0));
		panel.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 16));
		panel.setEditable(false);
		panel.setBounds(260, 66, 511, 184);
		contentPane.add(panel);
		
		JButton gruposb = new JButton("Mostrar Grupos");
		gruposb.setBackground(new Color(255, 0, 0));
		gruposb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		gruposb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setText("");
				for(Grupo g : Menu.frame2.cargarGrupos("grupo.csv")) {
					panel.append(g.toString());
				}
			}
		});
		gruposb.setBounds(10, 59, 143, 23);
		contentPane.add(gruposb);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del grupo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(10, 93, 143, 24);
		contentPane.add(lblNewLabel_1);
		
		codigo = new JTextField();
		codigo.setForeground(new Color(0, 0, 0));
		codigo.setBackground(new Color(255, 255, 240));
		codigo.setBounds(10, 128, 143, 20);
		contentPane.add(codigo);
		codigo.setColumns(10);
		
		JButton vercancion = new JButton("Ver Canciones");
		vercancion.setForeground(new Color(0, 0, 0));
		vercancion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		vercancion.setBackground(new Color(255, 0, 0));
		vercancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setText("");
				for(Cancion c: Menu.frame2.cargarCanciones("cancion.csv", codigo)) {
					panel.append(c.toString());
				}
			}
		});
		vercancion.setBounds(10, 159, 143, 23);
		contentPane.add(vercancion);
		
		JButton btnNewButton = new JButton("Borrar");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setText("");
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(10, 193, 143, 23);
		contentPane.add(btnNewButton);
		
	}
	public ArrayList<Grupo> cargarGrupos(String filename) {
	    ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	    try {
	        Scanner entrada = new Scanner(new File(filename));
	        while (entrada.hasNextLine()) {
	            String cadena = entrada.nextLine();
	            String[] linea = cadena.split(",");
	            Grupo grupo = new Grupo(linea[0], linea[1], Integer.parseInt(linea[2]), linea[3]);
	            grupos.add(grupo);
	        }
	        entrada.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    return grupos;
	}
	
	public ArrayList<Cancion> cargarCanciones(String filename, JTextField codigo) {
	    ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	    try {
	        Scanner entrada = new Scanner(new File(filename));
	        while (entrada.hasNextLine()) {
	            String cadena = entrada.nextLine();
	            String[] linea = cadena.split(",");
	            if(linea[0].equals(codigo.getText())) {
	            	Cancion cancion = new Cancion(linea[0], linea[1], linea[2], linea[3]);
		            canciones.add(cancion);
	            }else {
	            	if(codigo.getText().equals("")) {
	            		Cancion cancion = new Cancion(linea[0], linea[1], linea[2], linea[3]);
			            canciones.add(cancion);
	            	}
	            }
	        }
	        entrada.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    return canciones;
	}
}
