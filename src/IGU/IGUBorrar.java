package IGU;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;


import CONTROL.ControlEnlace;
import DAO.DAOVendedor;
import DTO.DTOVendedor;

public class IGUBorrar extends JFrame implements ActionListener{

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
	private JButton btnBorrar;
	private JButton btnRegresar;
	private JButton btnCancelar;
	private DAOVendedor daoVendedor;
	private ControlEnlace controlEnlace;

	/**
	 * Create the frame.
	 */
	public IGUBorrar() {
		lblTitulo = new JLabel("Borrar Vendedor");
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
		
		
		tfNombre = new JTextField();
		tfNombre.setBounds(241, 147, 209, 20);
		 add(tfNombre);
		
		
		tfApaterno = new JTextField();
		tfApaterno.setBounds(241, 175, 209, 20);
		 add(tfApaterno);
		
		
		tfAmaterno = new JTextField();
		tfAmaterno.setBounds(241, 207, 209, 20);
		 add(tfAmaterno);
		
		
		tfRfc = new JTextField();
		tfRfc.setBounds(241, 235, 209, 20);
		 add(tfRfc);
		
		
		tfCurp = new JTextField();
		tfCurp.setBounds(241, 266, 209, 20);
		 add(tfCurp);
		
		
		tfTelefono = new JTextField();
		tfTelefono.setBounds(241, 298, 209, 20);
		 add(tfTelefono);
		
		
		tfZona = new JTextField();
		tfZona.setBounds(241, 333, 209, 20);
		 add(tfZona);
		
		
		tfCorreo = new JTextField();
		tfCorreo.setBounds(241, 369, 209, 20);
		 add(tfCorreo);
		
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(241, 414, 89, 23);
		 add(btnBuscar);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(460, 414, 89, 23);
		 add(btnRegresar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(352, 414, 89, 23);
		 add(btnCancelar);
		 
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(126, 414, 89, 23);
		add(btnBorrar);
		
		 btnCancelar.addActionListener(this);
		 btnRegresar.addActionListener(this);
		 btnBuscar.addActionListener(this);
		 btnBorrar.addActionListener(this);
		 btnBorrar.setEnabled(false);
		 btnCancelar.setEnabled(false);
		 habilitar(false,true);
		setSize(800, 502);
		setTitle("Borrar Vendedor");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		
	}

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
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnBuscar) {
			DTOVendedor vendedor = controlEnlace.getDaoVendedor().buscarPersona(tfId.getText());
			if (vendedor == null){
				JOptionPane.showMessageDialog(null,"no existe el vendedor");
			}else {
				mostrarVendedor(vendedor);
				btnBuscar.setEnabled(false);
				btnBorrar.setEnabled(true);
				btnCancelar.setEnabled(true);
			}
		}
				
		if(e.getSource()==btnRegresar) {
			limpiar();
			btnBuscar.setEnabled(true);
			btnBorrar.setEnabled(false);
			btnCancelar.setEnabled(false);
			controlEnlace.mostrarMenuV();
		}

		if (e.getSource()==btnCancelar){
			limpiar();
			btnCancelar.setEnabled(false);
			btnBuscar.setEnabled(true);
			btnBorrar.setEnabled(false);
		}

		if (e.getSource()==btnBorrar){
			if (!tfId.getText().equals("")){
				int respuesta = JOptionPane.showConfirmDialog(this,
						"�Esta seguro de eliminar la Persona?", "Confirmaci�n",
						JOptionPane.YES_NO_OPTION);
				if (respuesta == JOptionPane.YES_NO_OPTION){
					controlEnlace.getDaoVendedor().eliminarPersona(tfId.getText());
					btnBuscar.setEnabled(true);
					btnBorrar.setEnabled(false);
					btnCancelar.setEnabled(false);
					limpiar();
				}
			}else{
				JOptionPane.showMessageDialog(null, "Ingrese un numero de Documento", "Informaci�n",JOptionPane.WARNING_MESSAGE);
			}
			
		}
		
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
	public void habilitar(Boolean booleano, Boolean id) {
		tfId.setEditable(id);
		tfNombre.setEditable(booleano);
		tfApaterno.setEditable(booleano);
		tfAmaterno.setEditable(booleano);
		tfCurp.setEditable(booleano);
		tfRfc.setEditable(booleano);
		tfCorreo.setEditable(booleano);
		tfTelefono.setEditable(booleano);
		tfZona.setEditable(booleano);
	}
	
	
	public void mostrarVendedor(DTOVendedor vendedor){
		tfId.setText(vendedor.getId()+"");
		tfAmaterno.setText(vendedor.getApellidoMaterno());
		tfApaterno.setText(vendedor.getApellidoPaterno());
		tfZona.setText(vendedor.getZonaVenta());
		tfNombre.setText(vendedor.getNombre());
		tfCorreo.setText(vendedor.getCorreoElectronico());
		tfCurp.setText(vendedor.getCurp());
		tfRfc.setText(vendedor.getRfc());
		tfTelefono.setText(vendedor.getTelefono()+"");

	}
}
