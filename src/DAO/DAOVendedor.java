package DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

import DTO.DTOVendedor;
import Modelo.ModeloConexion;



public class DAOVendedor {
	public void registrarPersona(DTOVendedor vendedor)
	{
		ModeloConexion conex= new ModeloConexion();
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			
			JOptionPane.showMessageDialog(null, sentencia(vendedor),"Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			
			
			estatuto.executeUpdate(sentencia(vendedor));
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}
	
	public DTOVendedor buscarPersona(Integer codigo)
	{
		ModeloConexion conex= new ModeloConexion();
		DTOVendedor vendedor= new DTOVendedor();
		boolean existe=false;
		try {
			//Statement estatuto = conex.getConnection().createStatement();
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Vendedor where id = ? ");
			consulta.setInt(1, codigo);
			ResultSet rs = consulta.executeQuery();
			while(rs.next()){
				existe=true;
				vendedor.setId(Integer.parseInt(rs.getString("id")));
				vendedor.setApellidoPaterno(rs.getString("p"));
				vendedor.setApellidoMaterno(rs.getString("a"));
				vendedor.setNombre(rs.getString("n"));
				vendedor.setTelefono(Integer.parseInt(rs.getString("telefono")));
				vendedor.setRfc(rs.getString("r"));
				vendedor.setCurp(rs.getString("e"));
				vendedor.setCorreoElectronico(rs.getString("f"));
				vendedor.setZonaVenta(rs.getString("c"));
			 }
			rs.close();
			conex.desconectar();
					
					
			} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Error, no se conecto");
					System.out.println(e);
			}
		
			if (existe) {
				return vendedor;
			}
			else return null;				
	}
	
	
	public String sentencia (DTOVendedor vendedor) {
		//INSERT INTO vendedor VALUES ('9997', 'pp', '555', '555', '55785456', '896', '6546', '56456', '5615');
		String sentenciaSQL = "INSERT INTO vendedor VALUES(5555,";
		sentenciaSQL += "'"+vendedor.getApellidoPaterno()+"','"+vendedor.getApellidoMaterno()+"','"+
		vendedor.getNombre()+"','"+vendedor.getTelefono()+"','"+vendedor.getRfc()+"','"+
				vendedor.getCurp()+"','"+vendedor.getZonaVenta()+"','"+vendedor.getCorreoElectronico()+"');";
		return sentenciaSQL;
	}
	
	public ArrayList<DTOVendedor> listar() {

		ModeloConexion conex = new ModeloConexion();
		ArrayList <DTOVendedor> miLista = new ArrayList <DTOVendedor>() ;
		DTOVendedor vendedor;
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM Vendedor ");

			while (rs.next()) {
				vendedor = new DTOVendedor();
				vendedor.setId(Integer.parseInt(rs.getString("id")));
				vendedor.setApellidoPaterno(rs.getString("p"));
				vendedor.setApellidoMaterno(rs.getString("a"));
				vendedor.setNombre(rs.getString("n"));
				vendedor.setTelefono(Integer.parseInt(rs.getString("telefono")));
				vendedor.setRfc(rs.getString("r"));
				vendedor.setCurp(rs.getString("e"));
				vendedor.setCorreoElectronico(rs.getString("f"));
				vendedor.setZonaVenta(rs.getString("c"));
				miLista.add(vendedor);
			}
			rs.close();
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "Error al consultar", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
		return miLista;
	}
	
	
	
}
