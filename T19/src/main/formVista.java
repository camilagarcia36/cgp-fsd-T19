package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class formVista extends JFrame {

	private JPanel contentPane;

	private JTextField txf1;

	/**
	 * Create the frame.
	 */
	public formVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 158);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Introduce tu nombre");
		lblNewLabel.setBounds(46, 27, 176, 16);
		contentPane.add(lblNewLabel);

		txf1 = new JTextField();
		txf1.setBounds(46, 55, 246, 26);
		contentPane.add(txf1);
		txf1.setColumns(10);

		JButton btn1 = new JButton("Saludar:)");
		btn1.addActionListener(a1);
		
		btn1.setBounds(46, 95, 117, 29);
		contentPane.add(btn1);
		
		setVisible(true); 
	}
	
	ActionListener a1 = new ActionListener() {
	public void actionPerformed(ActionEvent a1) {
	//add code function
		JOptionPane.showMessageDialog(null, "Hola, " + txf1.getText());

	}
	};


}
