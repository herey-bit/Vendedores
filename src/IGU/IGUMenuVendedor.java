package IGU;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IGUMenuVendedor frame = new IGUMenuVendedor();
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
	public IGUMenuVendedor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);*/
		
		lblTitulo = new JLabel("Administrar Vendedores\r\n");
		lblTitulo.setBounds(10, 30, 774, 21);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Courier New", Font.PLAIN, 18));
		getContentPane().add(lblTitulo);
		
		btnCrear = new JButton("Crear");
		btnCrear.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\boton-agregar.png"));
		//btnCrear.setForeground(new Color(255, 255, 255));
		btnCrear.setBackground(new Color(255, 255, 255));
		btnCrear.setBounds(112, 119, 89, 23);
		getContentPane().add(btnCrear);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\web-search-engine.png"));
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setForeground(new Color(0, 0, 0));
		btnBuscar.setBounds(229, 119, 98, 23);
		getContentPane().add(btnBuscar);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBackground(new Color(255, 255, 255));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\loop.png"));
		btnActualizar.setForeground(new Color(0, 0, 0));
		btnActualizar.setBounds(351, 119, 127, 23);
		getContentPane().add(btnActualizar);
		
		btnEliminar = new JButton("Borrar");
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\delete.png"));
		btnEliminar.setForeground(new Color(0, 0, 0));
		btnEliminar.setBounds(611, 119, 98, 23);
		getContentPane().add(btnEliminar);
		
		btnListar = new JButton("Listar");
		btnListar.setBackground(new Color(255, 255, 255));
		btnListar.setIcon(new ImageIcon("C:\\Users\\herey\\OneDrive\\Documents\\ap_producto\\productos\\SkoolyThanos\\src\\lista.png"));
		btnListar.setForeground(new Color(0, 0, 0));
		btnListar.setBounds(504, 119, 89, 23);
		getContentPane().add(btnListar);
		
		scrollListar = new JScrollPane();
		scrollListar.setBounds(56, 183, 687, 197);
		
		String [][] n = new String [10][9];
		
		
		
		
		for (int i = 0 ; i < 10 ; ++i) {
			n[i][0] = String.valueOf(i)+"";
			n[i][1] = "DANOE"+"";
			n[i][2] = "GARSIS"+"";
			n[i][3] = "SANCE"+"";
			n[i][4] = "AKJDNS11"+"";
			n[i][5] = "CJFKJSD1"+"";
			n[i][6] = "AICE"+"";
			n[i][7] = "4578"+"";
			n[i][8] = "DAJDSJ@SNSDJ"+"";
			
		}
		
		table = new JTable(n,columnas);
		table.setEnabled(false);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollListar.setViewportView(table);
		getContentPane().add(scrollListar);
		//add(table);
		
		setSize(800, 502);
		setTitle("CoDejaVu : Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
	}
}
