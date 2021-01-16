package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CONTROL.ControlEnlace;
import DAO.DAOVendedor;
import DTO.DTOVendedor;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class IGUMenuVendedor extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblTitulo;
	private JButton btnCrear;
	private JButton btnBuscar;
	private JButton btnActualizar;
	private JButton btnEliminar;
	private JButton btnListar;
	
	private JScrollPane scrollListar;
	private final String [] columnas = 
		{"ID","NOMBRE","A PATERNO","A MATERNO","CURP","RFC","ZONA","TELEFONO","CORREO"};
	
	
	private ControlEnlace controlEnlace;
	
	
	public ControlEnlace getControlEnlace() {
		return controlEnlace;
	}

	public void setControlEnlace(ControlEnlace controlEnlace) {
		this.controlEnlace = controlEnlace;
	}

	/**
	 * Create the frame.
	 */
	public IGUMenuVendedor() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);*/
		
		lblTitulo = new JLabel("Administrar Vendedores\r\n");
		lblTitulo.setBounds(10, 41, 774, 21);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Courier New", Font.PLAIN, 18));
		//getContentPane().add(lblTitulo);
		
		btnCrear = new JButton("Crear");
		btnCrear.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\boton-agregar.png"));
		//btnCrear.setForeground(new Color(255, 255, 255));
		btnCrear.setBackground(new Color(255, 255, 255));
		btnCrear.setBounds(112, 119, 89, 23);
		//getContentPane().add(btnCrear);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\web-search-engine.png"));
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setForeground(new Color(0, 0, 0));
		btnBuscar.setBounds(229, 119, 98, 23);
		//getContentPane().add(btnBuscar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBackground(new Color(255, 255, 255));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\loop.png"));
		btnActualizar.setForeground(new Color(0, 0, 0));
		btnActualizar.setBounds(351, 119, 127, 23);
		//getContentPane().add(btnActualizar);
		
		btnEliminar = new JButton("Borrar");
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\delete.png"));
		btnEliminar.setForeground(new Color(0, 0, 0));
		btnEliminar.setBounds(611, 119, 98, 23);
		//getContentPane().add(btnEliminar);
		
		btnListar = new JButton("Listar");
		btnListar.setBackground(new Color(255, 255, 255));
		btnListar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\lista.png"));
		btnListar.setForeground(new Color(0, 0, 0));
		btnListar.setBounds(504, 119, 89, 23);
		//getContentPane().add(btnListar);
		
		scrollListar = new JScrollPane();
		scrollListar.setBounds(56, 183, 687, 197);
		mostrarDatosUsandoLogica(); 

		
		
		
		
		
		
		
		//getContentPane().add(scrollListar);
		//add(table);
		btnCrear.addActionListener(this);
		btnListar.addActionListener(this);
		btnActualizar.addActionListener(this);
		btnBuscar.addActionListener((ActionListener) this);
		btnEliminar.addActionListener(this);
		getContentPane().add(btnCrear);
		getContentPane().add(lblTitulo);
		getContentPane().add(btnListar);
		getContentPane().add(btnBuscar);
		getContentPane().add(btnActualizar);
		getContentPane().add(btnEliminar);
		
		getContentPane().add(scrollListar);
		
		
		/*table = new JTable(n,columnas);
		table.setEnabled(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollListar.setViewportView(table);*/
		//add(table);
		
		
		
		setSize(800, 502);
		setTitle("Administrar Vendedores");
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e) {
		mostrarDatosUsandoLogica();
		if(e.getSource() == btnCrear) {controlEnlace.mostrarCrearV();}
		if(e.getSource() == btnBuscar) {controlEnlace.mostrarBuscarV();}
		if(e.getSource() == btnEliminar) {controlEnlace.mostrarBorrarV();}
		if(e.getSource() == btnActualizar) {controlEnlace.mostrarActualizarV();}
	}
	
	private String[][] obtieneMariz() {
		DAOVendedor vendedor = new DAOVendedor();
		/*
		 * llamamos al metodo que retorna la info de la BD y la almacena en la
		 * lista
		 */
		ArrayList<DTOVendedor> miLista = vendedor.listar();
		/*
		 * como sabemos que son 5 campos, definimos ese valor por defecto para
		 * las columnaslas filas dependen de los registros retornados
		 */
		String informacion[][] = new String[miLista.size()][9];

		for (int x = 0; x < informacion.length; x++) {
			informacion[x][0] = miLista.get(x).getId() + "";
			informacion[x][1] = miLista.get(x).getNombre() + "";
			informacion[x][2] = miLista.get(x).getApellidoPaterno() +"";
			informacion[x][3] = miLista.get(x).getApellidoMaterno() + "";
			informacion[x][4] = miLista.get(x).getCurp() + "";
			informacion[x][5] = miLista.get(x).getRfc() + "";
			informacion[x][6] = miLista.get(x).getZonaVenta() + "";
			informacion[x][7] = miLista.get(x).getTelefono() + "";
			informacion[x][8] = miLista.get(x).getCorreoElectronico() + "";
			

		}
		return informacion;
	}
	
	public void mostrarDatosUsandoLogica() {

		String informacion[][] = obtieneMariz();// obtenemos la informacion de
												// la BD

		table = new JTable(informacion, columnas);
		table.setEnabled(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollListar.setViewportView(table);
	}
	
	
}
