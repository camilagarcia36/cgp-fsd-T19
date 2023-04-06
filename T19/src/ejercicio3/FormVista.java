package ejercicio3;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class FormVista extends JFrame {

	private JPanel contentPane;
	private JRadioButton windowsRB;
	private JRadioButton iosRB;
	private JRadioButton linuxRB;

	private JCheckBox chckDiseño;
	private JCheckBox chckProgramacion;
	private JCheckBox chckAdm;
	private JSlider slider;

	/**
	 * Create the frame.
	 */
	public FormVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEspecialidad = new JLabel("Elige tu especialidad");
		lblEspecialidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblEspecialidad.setBounds(104, 236, 196, 16);
		contentPane.add(lblEspecialidad);

		// Crear un grupo de botones de radio
		ButtonGroup grupoRadio = new ButtonGroup();

		windowsRB = new JRadioButton("Windows");
		windowsRB.setBounds(31, 105, 141, 23);
		grupoRadio.add(windowsRB);
		contentPane.add(windowsRB);

		iosRB = new JRadioButton("Mac");
		iosRB.setBounds(159, 105, 141, 23);
		grupoRadio.add(iosRB);
		contentPane.add(iosRB);

		linuxRB = new JRadioButton("Linux");
		linuxRB.setBounds(294, 105, 141, 23);
		// añado el radiobutton al grupo.
		grupoRadio.add(linuxRB);

		contentPane.add(linuxRB);

		JLabel lblSO_1 = new JLabel("Elige un Sistema Operativo");
		lblSO_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSO_1.setBounds(78, 45, 196, 16);
		contentPane.add(lblSO_1);

		chckDiseño = new JCheckBox("Diseño grafico");
		chckDiseño.setBounds(24, 301, 128, 23);
		contentPane.add(chckDiseño);

		chckProgramacion = new JCheckBox("Programacion");
		chckProgramacion.setBounds(157, 301, 128, 23);
		contentPane.add(chckProgramacion);

		chckAdm = new JCheckBox("Administracion");
		chckAdm.setBounds(284, 301, 128, 23);
		contentPane.add(chckAdm);

		// Creo el slider
		slider = new JSlider();
		slider.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setBackground(new Color(0, 0, 0));
		slider.setMinimum(1);
		slider.setValue(5);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(10);
		slider.setBounds(104, 411, 221, 42);
		contentPane.add(slider);

		JLabel lblHoras = new JLabel("Horas dedicadadas en el ordenador");
		lblHoras.setBounds(94, 383, 245, 16);
		contentPane.add(lblHoras);

		JButton btnEnviar = new JButton("Enviar datos");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// comprobar que todo este rellenado y despues recoger datos y mostrarlos en
				// pantalla.
				// if todos los campos rellenados entonces mostrar
				comprobarDatos();

			}
		});
		btnEnviar.setBounds(159, 457, 117, 29);
		contentPane.add(btnEnviar);
		setVisible(true);

	}

	public void comprobarDatos() {

		// Compruebo cual esta seleccionado y le doy valor al string que he creado para
		// luego mostrarlo en pantalla.
		String valorRB = "";

		if (windowsRB.isSelected()) {
			valorRB = windowsRB.getText();
			System.out.print(valorRB);
		} else if (linuxRB.isSelected()) {
			valorRB = linuxRB.getText();
		} else if (iosRB.isSelected()) {
			valorRB = iosRB.getText();
		}

		// Creo un arraylist para guardar los valores de los check box.
		ArrayList<String> valoresCB = new ArrayList<String>();

		if (chckDiseño.isSelected()) {

			valoresCB.add(chckDiseño.getText());
		}
		if (chckProgramacion.isSelected()) {

			valoresCB.add(chckProgramacion.getText());
		}

		if (chckAdm.isSelected()) {
			valoresCB.add(chckAdm.getText());
		}

		// Compruebo que este seleccionado y si lo esta muestro los datos. Si no, doy un
		// mensaje por Joption pane de que se tiene que rellenar los datos.
		if (valorRB != null && !valorRB.isEmpty() && valoresCB != null && !valoresCB.isEmpty()) {

			JOptionPane.showMessageDialog(null,
					"Sistema operativo seleccionado: " + valorRB + "\n" + "Especialidades seleccionadas: " + "\n" + "- "
							+ String.join("\n- ", valoresCB) + "\n" + "Las horas dedicadas en el ordenador son: "
							+ slider.getValue());

		} else {
			JOptionPane.showMessageDialog(null,
					"Por favor, seleccione un sistema operativo y una o más especialidades.");
		}
	}
}
