package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormVista extends JFrame {

	private JPanel contentPane;
	private JTextField txfPelicula;

	
	/**
	 * Create the frame.
	 */
	
	public FormVista() {
		
		//Se crean con el design
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de la pelicula");
		lblNewLabel.setBounds(39, 49, 203, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setBounds(326, 49, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cBoxPeliculas = new JComboBox();
		cBoxPeliculas.setBounds(300, 94, 106, 27);
		contentPane.add(cBoxPeliculas);
		
		
		txfPelicula = new JTextField();   
		txfPelicula.setBounds(39, 77, 203, 26);
		contentPane.add(txfPelicula);
		txfPelicula.setColumns(10);
		
		JButton btnAñadir = new JButton("añadir");
		//Action listener pulsar boton. 
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("boton pulsado " + txfPelicula.getText());
				//Almaceno los datos recibidos del txtfield en un string. 
				String text = txfPelicula.getText(); 
				
				//almaceno los datos del string creado anteriormente en el combo box
				cBoxPeliculas.addItem(text);
				
				//Limpio el txt field para añadir mas peliculas. 
				txfPelicula.setText("");
			}
		});
		btnAñadir.setBounds(85, 143, 117, 29);
		contentPane.add(btnAñadir);
		
		setVisible(true); 
	}
	
}
