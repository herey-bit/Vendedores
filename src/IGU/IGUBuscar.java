package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONTROL.ControlEnlace;
import DAO.DAOVendedor;
import DTO.DTOVendedor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import CONTROL.ControlEnlace;
import DAO.DAOVendedor;
import DTO.DTOVendedor;

public class IGUBuscar extends JFrame implements ActionListener {

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
	private JButton btnBuscar;
	private JButton btnRegresar;
	private JButton btnCancelar;
	private DAOVendedor daoVendedor;
	private ControlEnlace controlEnlace;


	/**
	 * Create the frame.
	 */
	public IGUBuscar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*setBounds(100, 100, 843, 537);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);*/
		
		lblTitulo = new JLabel("Crear Vendedor");
		lblTitulo.setBounds(374, 25, 100, 14);
		add(lblTitulo);
		
		lblId = new JLabel("ID");
		lblId.setBounds(196, 86, 46, 14);
		add(lblId);
		
		lblNombre = new JLabel ("Nombre");
		lblNombre.setBounds(142, 150, 100, 14);
		add(lblNombre);
		
		lblApaterno = new JLabel("Apellido Paterno");
		lblApaterno.setBounds(142, 178, 100, 14);
		 add(lblApaterno);
		
		lblAmaterno = new JLabel("Apellido Materno");
		lblAmaterno.setBounds(142, 210, 100, 14);
		 add(lblAmaterno);
		
		lblRfc = new JLabel("RFC");
		lblRfc.setBounds(142, 235, 46, 14);
		 add(lblRfc);
		
		lblCurp = new JLabel("CURP");
		lblCurp.setBounds(142, 269, 46, 14);
		 add(lblCurp);
		
		lblTelefono = new JLabel("Tel\u00E9fono");
		lblTelefono.setBounds(142, 301, 69, 14);
		 add(lblTelefono);
		
		lblZona = new JLabel("Zona");
		lblZona.setBounds(142, 337, 46, 14);
		 add(lblZona);
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(142, 372, 46, 14);
		 add(lblCorreo);
		
		tfId = new JTextField();
		tfId.setBounds(241, 83, 89, 20);
		 add(tfId);
		tfId.setColumns(10);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(241, 147, 209, 20);
		 add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApaterno = new JTextField();
		tfApaterno.setBounds(241, 175, 209, 20);
		 add(tfApaterno);
		tfApaterno.setColumns(10);
		
		tfAmaterno = new JTextField();
		tfAmaterno.setBounds(241, 207, 209, 20);
		 add(tfAmaterno);
		tfAmaterno.setColumns(10);
		
		tfRfc = new JTextField();
		tfRfc.setBounds(241, 235, 209, 20);
		 add(tfRfc);
		tfRfc.setColumns(10);
		
		tfCurp = new JTextField();
		tfCurp.setBounds(241, 266, 209, 20);
		 add(tfCurp);
		tfCurp.setColumns(10);
		
		tfTelefono = new JTextField();
		tfTelefono.setBounds(241, 298, 209, 20);
		 add(tfTelefono);
		tfTelefono.setColumns(10);
		
		tfZona = new JTextField();
		tfZona.setBounds(241, 333, 209, 20);
		 add(tfZona);
		tfZona.setColumns(10);
		
		tfCorreo = new JTextField();
		tfCorreo.setBounds(241, 369, 209, 20);
		 add(tfCorreo);
		tfCorreo.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(241, 414, 89, 23);
		 add(btnBuscar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(460, 414, 89, 23);
		 add(btnRegresar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(352, 414, 89, 23);
		 add(btnCancelar);
		
		 btnCancelar.addActionListener(this);
		 btnRegresar.addActionListener((ActionListener) this);
		 btnBuscar.addActionListener((ActionListener) this);
		 
		
		setSize(800, 502);
		setTitle("Crear Vendedor");
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
	}
	
	public ControlEnlace getControlEnlace() {
		return controlEnlace;
	}

	public void setControlEnlace(ControlEnlace controlEnlace) {
		this.controlEnlace = controlEnlace;
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBuscar) {
			DTOVendedor vendedor = new DAOVendedor().buscarPersona(buscar());
			if (vendedor == null){
				JOptionPane.showMessageDialog(null,"no existe el vendedor");
			}else {
				mostrarVendedor(vendedor);
			}
		}
				
		if(e.getSource()==btnRegresar) {
			controlEnlace.mostrarMenuV();}
		
	}
	
	
	public Integer buscar() {

		if (lblId.getText().equals("") || Integer.parseInt(lblId.getText()) < 0){
			return null;
		} else {
			return Integer.parseInt(lblId.getText());
		}
	}
	
	public void mostrarVendedor(DTOVendedor vendedor){
		tfId.setText(vendedor.getId().toString());
		tfAmaterno.setText(vendedor.getApellidoMaterno());
		tfApaterno.setText(vendedor.getApellidoPaterno());
		tfZona.setText(vendedor.getZonaVenta());
		tfNombre.setText(vendedor.getNombre());
		tfCorreo.setText(vendedor.getCorreoElectronico());
		tfCurp.setText(vendedor.getCurp());
		tfRfc.setText(vendedor.getRfc());
		tfTelefono.setText(vendedor.getTelefono().toString());

	}
	

}
