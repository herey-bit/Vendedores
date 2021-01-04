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
	private JTextField tfId;
	private JTextField tfNombre;
	private JTextField tfApaterno;
	private JTextField tfAmaterno;
	private JTextField tfCurp;
	private JTextField tfRfc;
	private JTextField tfCorreo;
	private JTextField tfTelefono;
	private JTextField tfZona;
	private JButton btnAceptar;
	private JButton btnRegresar;
	private JButton btnCancelar;

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
		lblTitulo.setBounds(374, 25, 100, 14);
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
		lblTelefono.setBounds(142, 301, 69, 14);
		contentPane.add(lblTelefono);
		
		lblZona = new JLabel("Zona");
		lblZona.setBounds(142, 337, 46, 14);
		contentPane.add(lblZona);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(142, 372, 46, 14);
		contentPane.add(lblCorreo);
		
		tfId = new JTextField();
		tfId.setBounds(241, 83, 89, 20);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(241, 147, 209, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApaterno = new JTextField();
		tfApaterno.setBounds(241, 175, 209, 20);
		contentPane.add(tfApaterno);
		tfApaterno.setColumns(10);
		
		tfAmaterno = new JTextField();
		tfAmaterno.setBounds(241, 207, 209, 20);
		contentPane.add(tfAmaterno);
		tfAmaterno.setColumns(10);
		
		tfRfc = new JTextField();
		tfRfc.setBounds(241, 235, 209, 20);
		contentPane.add(tfRfc);
		tfRfc.setColumns(10);
		
		tfCurp = new JTextField();
		tfCurp.setBounds(241, 266, 209, 20);
		contentPane.add(tfCurp);
		tfCurp.setColumns(10);
		
		tfTelefono = new JTextField();
		tfTelefono.setBounds(241, 298, 209, 20);
		contentPane.add(tfTelefono);
		tfTelefono.setColumns(10);
		
		tfZona = new JTextField();
		tfZona.setBounds(241, 333, 209, 20);
		contentPane.add(tfZona);
		tfZona.setColumns(10);
		
		tfCorreo = new JTextField();
		tfCorreo.setBounds(241, 369, 209, 20);
		contentPane.add(tfCorreo);
		tfCorreo.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(241, 414, 89, 23);
		contentPane.add(btnAceptar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(460, 414, 89, 23);
		contentPane.add(btnRegresar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(352, 414, 89, 23);
		contentPane.add(btnCancelar);
		
	}
}
