package ejercicioLibre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(173, 255, 47));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(30, 30, 101, 17);
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenero.setForeground(new Color(128, 128, 0));
		frame.getContentPane().add(lblGenero);
		
		JLabel lblPelicula = new JLabel("Pelicula");
		lblPelicula.setBounds(218, 31, 123, 15);
		lblPelicula.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPelicula.setForeground(new Color(128, 128, 0));
		frame.getContentPane().add(lblPelicula);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(30, 52, 123, 20);
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {" ","Drama","Comedia", "Ciencia Ficcion"}));
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(218, 52, 139, 20);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnVerPelicula = new JButton("Ver pelicula");
		btnVerPelicula.setBounds(130, 100, 133, 25);
		btnVerPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String peliEscogida = comboBox_1.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, "Vamos a ver la pelicula: "+peliEscogida);
			}
		});
		btnVerPelicula.setForeground(new Color(238, 232, 170));
		btnVerPelicula.setFont(new Font("Tahoma", Font.ITALIC, 14));
		btnVerPelicula.setBackground(SystemColor.inactiveCaptionText);
		frame.getContentPane().add(btnVerPelicula);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(302, 194, 69, 23);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnSalir);
		
		
		DefaultComboBoxModel grupo1;
		DefaultComboBoxModel grupo2;
		DefaultComboBoxModel grupo3;
		
		
		grupo1=new DefaultComboBoxModel();
		grupo1.addElement("");
		grupo1.addElement("El Padrino");
		grupo1.addElement("Gladiador");
		grupo1.addElement("Titanic");
		
		grupo2=new DefaultComboBoxModel();
		grupo2.addElement("");
		grupo2.addElement("Scary movie");
		grupo2.addElement("La Mascara");
		grupo2.addElement("La era del Hielo");
		
		
		grupo3=new DefaultComboBoxModel();
		grupo3.addElement("");
		grupo3.addElement("Star Wars");
		grupo3.addElement("Yo Robot");
		grupo3.addElement("Viaje  las estrellas");
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(comboBox.getSelectedItem().toString().equals("Drama")){
					comboBox_1.setModel(grupo1);
				}
				if(comboBox.getSelectedItem().toString().equals("Comedia")){
					comboBox_1.setModel(grupo2);
				}
				if(comboBox.getSelectedItem().toString().equals("Ciencia Ficcion")){
					comboBox_1.setModel(grupo3);
				}
				
			}
		});
			
		}
	
	public String[] getGenero(String gen) {
		String[] pelis=new String[3];
		if(gen.equals("Comedia")) {
			pelis[0]="El Padrino";
			pelis[1]="Gladiador";
			pelis[2]="Titanic";
		}
		return pelis;
		
	}
	
	

}
