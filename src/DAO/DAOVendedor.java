package DAO;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import CONTROL.ControlEnlace;



import DTO.DTOVendedor;
import Modelo.ModeloConexion;





public class DAOVendedor {
	
	private ControlEnlace controlEnlace;
	
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
	
	public DTOVendedor buscarPersona(String id)
	{
		ModeloConexion conex= new ModeloConexion();
		DTOVendedor vendedor= new DTOVendedor();
		boolean existe=false;
		try {
			//Statement estatuto = conex.getConnection().createStatement();
			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM vendedor where id = "+id+";");
			//consulta.setInt(1, codigo);
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
					
					
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Debe ingresar un dato numerico","Error",JOptionPane.ERROR_MESSAGE);
				
			}catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Error, no se conecto");
					System.out.println(e);
			}
		
			if (existe) {
				JOptionPane.showMessageDialog(null, vendedor.getId()+"");
				return vendedor;
			} else {
				return null;				
			}
	}
	
	
	public String sentencia (DTOVendedor vendedor) {
		//INSERT INTO vendedor VALUES ('9997', 'pp', '555', '555', '55785456', '896', '6546', '56456', '5615');
		String sentenciaSQL = "INSERT INTO vendedor VALUES(3333,";
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
	
	
	public void modificarPersona(DTOVendedor vendedor) {
		
		ModeloConexion conex= new ModeloConexion();
		try{
			String consulta="UPDATE vendedor SET id= ? , p = ? , a=? , n=? , telefono= ?, r = ? , e=? , f=?, c = ?  WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);
			estatuto.setInt(1,vendedor.getId());
			estatuto.setString(2,vendedor.getApellidoPaterno());
			estatuto.setString(3,vendedor.getApellidoMaterno());
			estatuto.setString(4,vendedor.getNombre());
			estatuto.setInt(5,vendedor.getTelefono());
			estatuto.setString(6,vendedor.getRfc());
			estatuto.setString(7,vendedor.getCurp());
			estatuto.setString(8,vendedor.getZonaVenta());
			estatuto.setString(9,vendedor.getCorreoElectronico());
			estatuto.setInt(10,vendedor.getId());
            estatuto.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 e){

            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}
	
	public void eliminarPersona(String codigo)
	{
		ModeloConexion conex= new ModeloConexion();
		try {
			Statement estatuto = conex.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM vendedor WHERE id="+codigo+";");
            JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}

	public ControlEnlace getControlEnlace() {
		return controlEnlace;
	}

	public void setControlEnlace(ControlEnlace controlEnlace) {
		this.controlEnlace = controlEnlace;
	}
	
	
}
