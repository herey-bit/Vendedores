package CONTROL;

import DAO.DAOVendedor;
import IGU.IGUActualizar;
import IGU.IGUBorrar;
import IGU.IGUBuscar;
import IGU.IGUCrearVendedor;
import IGU.IGUMenuVendedor;

public class ControlMain{
	
	public IGUCrearVendedor crearV;
	public IGUMenuVendedor menuV;
	public IGUBuscar buscarV;
	private IGUActualizar actualizarV;
	private DAOVendedor daoVendedor;
	private ControlEnlace controlEnlace;
	private IGUBorrar borrarV;
	
	public static void main(String[] args) {
		new ControlMain();
	}
	
	public ControlMain() {
		
		menuV = new IGUMenuVendedor();
		crearV = new IGUCrearVendedor();
		buscarV = new IGUBuscar();
		controlEnlace = new ControlEnlace();
		daoVendedor = new DAOVendedor();
		borrarV = new IGUBorrar(); 
		actualizarV = new IGUActualizar();
		
		menuV.setControlEnlace(controlEnlace);
		crearV.setControlEnlace(controlEnlace);
		buscarV.setControlEnlace(controlEnlace);
		buscarV.setDaoVendedor(daoVendedor);
		daoVendedor.setControlEnlace(controlEnlace);
		borrarV.setControlEnlace(controlEnlace);
		actualizarV.setControlEnlace(controlEnlace);
		
		controlEnlace.setCrearV(crearV);
		controlEnlace.setMenuV(menuV);
		controlEnlace.setBuscarV(buscarV);
		controlEnlace.setDaoVendedor(daoVendedor);
		controlEnlace.setBorrarV(borrarV);
		controlEnlace.setActualizarV(actualizarV);
		
		menuV.setVisible(true);
	}
	
}
