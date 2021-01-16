package CONTROL;

import DAO.DAOVendedor;
import IGU.IGUActualizar;
import IGU.IGUBorrar;
import IGU.IGUBuscar;
import IGU.IGUCrearVendedor;
import IGU.IGUMenuVendedor;

public class ControlEnlace {
	
	private IGUCrearVendedor crearV;
	private IGUMenuVendedor menuV;
	private IGUBuscar buscarV;
	private IGUBorrar borrarV;
	private IGUActualizar actualizarV;
	private DAOVendedor daoVendedor;
	
	
	
	public IGUActualizar getActualizarV() {
		return actualizarV;
	}
	public void setActualizarV(IGUActualizar actualizarV) {
		this.actualizarV = actualizarV;
	}
	public IGUBorrar getBorrarV() {
		return borrarV;
	}
	public void setBorrarV(IGUBorrar borrarV) {
		this.borrarV = borrarV;
	}
	public DAOVendedor getDaoVendedor() {
		return daoVendedor;
	}
	public void setDaoVendedor(DAOVendedor daoVendedor) {
		this.daoVendedor = daoVendedor;
	}
	public IGUCrearVendedor getCrearV() {
		return crearV;
	}
	public void setCrearV(IGUCrearVendedor crearV) {
		this.crearV = crearV;
	}
	public IGUMenuVendedor getMenuV() {
		return menuV;
	}
	public void setMenuV(IGUMenuVendedor menuV) {
		this.menuV = menuV;
	}
	
	
	
	/////
	
	public IGUBuscar getBuscarV() {
		return buscarV;
	}
	public void setBuscarV(IGUBuscar buscarV) {
		this.buscarV = buscarV;
	}
	public void mostrarCrearV() {
		crearV.setVisible(true);
	}
	public void mostrarMenuV() {
		menuV.setVisible(true);
	}
	public void mostrarBuscarV() {
		buscarV.setVisible(true);
	}
	public void mostrarActualizarV() {
		actualizarV.setVisible(true);
	}
	public void mostrarBorrarV() {
		borrarV.setVisible(true);
	}
	
	
}
