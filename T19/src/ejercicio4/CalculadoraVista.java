package ejercicio4;

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

public class CalculadoraVista extends JFrame {

	private JPanel contentPane;
	private JTextField txfOperando1;
	private JTextField txfOperando2;
	private JTextField txfResultado;
	
	private JButton btnSuma, btnResta, btnDiv, btnMulti, btnSalir, btnAbout; 

	/**
	 * Create the frame.
	 */
	public CalculadoraVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setBounds(218, 6, 92, 16);
		contentPane.add(lblNewLabel);
		
		txfOperando1 = new JTextField();
		txfOperando1.setBounds(151, 80, 130, 26);
		contentPane.add(txfOperando1);
		txfOperando1.setColumns(10);
		
		txfOperando2 = new JTextField();
		txfOperando2.setBounds(151, 118, 130, 26);
		contentPane.add(txfOperando2);
		txfOperando2.setColumns(10);
		
		txfResultado = new JTextField();
		txfResultado.setBounds(322, 80, 163, 54);
		contentPane.add(txfResultado);
		txfResultado.setColumns(10);
		
		btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Obtener los operandos
		        double operando1 = Double.parseDouble(txfOperando1.getText());
		        double operando2 = Double.parseDouble(txfOperando2.getText());
		        
		        // Realizar la operación
		        double resultado = operando1 + operando2;
		        
		        // Mostrar el resultado en el campo de texto correspondiente
		        txfResultado.setText(String.valueOf(resultado));
			}
		});
		btnSuma.setBounds(125, 191, 52, 34);
		contentPane.add(btnSuma);
		
		btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 // Obtener los valores de los operandos como números
		        double op1 = Double.parseDouble(txfOperando1.getText());
		        double op2 = Double.parseDouble(txfOperando2.getText());

		        // Realizar la operación de resta y mostrar el resultado
		        double resultado = op1 - op2;
		        txfResultado.setText(String.valueOf(resultado));
			}
			
		});
		btnResta.setBounds(189, 191, 52, 34);
		contentPane.add(btnResta);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double op1 = Double.parseDouble(txfOperando1.getText());
			        double op2 = Double.parseDouble(txfOperando2.getText());
			        if (op2 != 0) {
			            double resultado = op1 / op2;
			            txfResultado.setText(String.valueOf(resultado));
			        } else {
			            txfResultado.setText("Error: División por cero");
			        }
			    
				
			}
		});
		btnDiv.setBounds(258, 191, 52, 34);
		contentPane.add(btnDiv);
		
		btnMulti = new JButton("x");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Obtener los valores de los operandos como números
		        double op1 = Double.parseDouble(txfOperando1.getText());
		        double op2 = Double.parseDouble(txfOperando2.getText());

		        // Realizar la operación de multiplicación y mostrar el resultado
		        double resultado = op1 * op2;
		        txfResultado.setText(String.valueOf(resultado));
			}
		});
		btnMulti.setBounds(322, 191, 52, 34);
		contentPane.add(btnMulti);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		btnSalir.setBounds(125, 258, 117, 29);
		contentPane.add(btnSalir);
		
		
		btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "MINI CALCULADORA \n App elaborada por Camila");
			}
		});
		btnAbout.setBounds(240, 258, 117, 29);
		contentPane.add(btnAbout);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("=");
		lblNewLabel_1.setBounds(293, 99, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(363, 48, 92, 16);
		contentPane.add(lblResultado);
		
		JLabel lblNewLabel_2 = new JLabel("Que quieres calcular? ");
		lblNewLabel_2.setBounds(65, 48, 142, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Elige operacion");
		lblNewLabel_3.setBounds(198, 163, 127, 16);
		contentPane.add(lblNewLabel_3);
		
		setVisible(true); 
	}
}
