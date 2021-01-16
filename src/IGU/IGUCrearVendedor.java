package IGU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import CONTROL.ControlEnlace;
import DAO.DAOVendedor;
import DTO.DTOVendedor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class IGUCrearVendedor extends JFrame implements ActionListener{

	private JLabel lblNombre;
	private JLabel lblApaterno;
	private JLabel lblAmaterno;
	private JLabel lblCurp;
	private JLabel lblRfc;
	private JLabel lblTelefono;
	private JLabel lblCorreo;
	private JLabel lblZona;
	private JLabel lblTitulo;
	
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
	private DAOVendedor daoVendedor;
	private ControlEnlace controlEnlace;

	public DAOVendedor getDaoVendedor() {
		return daoVendedor;
	}

	public void setDaoVendedor(DAOVendedor daoVendedor) {
		this.daoVendedor = daoVendedor;
	}

	public ControlEnlace getControlEnlace() {
		return controlEnlace;
	}

	public void setControlEnlace(ControlEnlace controlEnlace) {
		this.controlEnlace = controlEnlace;
	}

	/**
	 * Create the frame.
	 */
	public IGUCrearVendedor() {
				
		lblTitulo = new JLabel("Crear Vendedor");
		lblTitulo.setBounds(374, 25, 100, 14);
		add(lblTitulo);
		
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
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(241, 414, 89, 23);
		 add(btnAceptar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(460, 414, 89, 23);
		 add(btnRegresar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(352, 414, 89, 23);
		 add(btnCancelar);
		
		 btnCancelar.addActionListener(this);
		 btnRegresar.addActionListener(this);
		 btnAceptar.addActionListener(this);
		 habilitar(true, false);
		
		setSize(800, 502);
		setTitle("Crear Vendedor");
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
	}
	
	public void habilitar(Boolean crear, Boolean botones){
		btnAceptar.setEnabled(crear);
		btnCancelar.setEnabled(botones);
		btnRegresar.setEnabled(crear);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnAceptar) {
			controlEnlace.getDaoVendedor().registrarPersona(crear());

		}
				
		if(e.getSource()==btnRegresar) {
			limpiar();
			habilitar(true,false);
			controlEnlace.mostrarMenuV();
		}
		
		if(e.getSource()==btnCancelar) {
			limpiar();
		}

	}
	
	
	public DTOVendedor crear() {
		DTOVendedor vendedor;
		vendedor = new DTOVendedor(tfNombre.getText(),tfApaterno.getText(),tfAmaterno.getText(),
				Integer.parseInt(tfTelefono.getText()),tfCurp.getText(),tfRfc.getText(),tfCorreo.getText(),tfZona.getText());
		return vendedor;
	}
	
	public void limpiar() {
		tfAmaterno.setText("");
		tfApaterno.setText("");
		tfZona.setText("");
		tfNombre.setText("");
		tfCorreo.setText("");
		tfCurp.setText("");
		tfRfc.setText("");
		tfTelefono.setText("");
	}
	
	
	
	
}
