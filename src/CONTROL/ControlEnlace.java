package CONTROL;

import IGU.IGUBuscar;
import IGU.IGUCrearVendedor;
import IGU.IGUMenuVendedor;

public class ControlEnlace {
	
	private IGUCrearVendedor crearV;
	private IGUMenuVendedor menuV;
	private IGUBuscar buscarV;
	
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
	
	
}
