package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class IGUCrearVendedor extends JFrame {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblApaterno;
	private JLabel lblAmaterno;
	private JLabel lblCurp;
	private JLabel lblRfc;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JLabel lblId;
	private JLabel lblZona;
	private JLabel lblTitulo;
	private JTextField textId;
	private JTextField text;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IGUCrearVendedor frame = new IGUCrearVendedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IGUCrearVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitulo = new JLabel("Crear Vendedor");
		lblTitulo.setBounds(374, 25, 76, 14);
		contentPane.add(lblTitulo);
		
		lblId = new JLabel("ID");
		lblId.setBounds(196, 86, 46, 14);
		contentPane.add(lblId);
		
		lblNombre = new JLabel ("Nombre");
		lblNombre.setBounds(142, 150, 100, 14);
		contentPane.add(lblNombre);
		
		lblApaterno = new JLabel("Apellido Paterno");
		lblApaterno.setBounds(142, 178, 100, 14);
		contentPane.add(lblApaterno);
		
		lblAmaterno = new JLabel("Apellido Materno");
		lblAmaterno.setBounds(142, 210, 100, 14);
		contentPane.add(lblAmaterno);
		
		lblRfc = new JLabel("RFC");
		lblRfc.setBounds(142, 235, 46, 14);
		contentPane.add(lblRfc);
		
		lblCurp = new JLabel("CURP");
		lblCurp.setBounds(142, 269, 46, 14);
		contentPane.add(lblCurp);
		
		lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setBounds(142, 301, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblZona = new JLabel("Zona");
		lblZona.setBounds(142, 337, 46, 14);
		contentPane.add(lblZona);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(142, 372, 46, 14);
		contentPane.add(lblCorreo);
		
		textField = new JTextField();
		textField.setBounds(241, 83, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(241, 147, 209, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(241, 175, 209, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(241, 207, 209, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(241, 235, 209, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(241, 266, 209, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(241, 298, 209, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(241, 333, 209, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(241, 369, 209, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(241, 414, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.setBounds(460, 414, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setBounds(352, 414, 89, 23);
		contentPane.add(btnNewButton_2);
		
		
		
		
		
		
		
		
	}
}
