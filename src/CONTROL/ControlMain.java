package CONTROL;

import IGU.IGUBuscar;
import IGU.IGUCrearVendedor;
import IGU.IGUMenuVendedor;

public class ControlMain{
	
	public IGUCrearVendedor crearV;
	public IGUMenuVendedor menuV;
	public IGUBuscar buscarV;
	private ControlEnlace controlEnlace;
	
	public static void main(String[] args) {
		new ControlMain();
	}
	
	public ControlMain() {
		menuV = new IGUMenuVendedor();
		crearV = new IGUCrearVendedor();
		buscarV = new IGUBuscar();
		controlEnlace = new ControlEnlace();
		
		menuV.setControlEnlace(controlEnlace);
		crearV.setControlEnlace(controlEnlace);
		buscarV.setControlEnlace(controlEnlace);
		controlEnlace.setCrearV(crearV);
		controlEnlace.setMenuV(menuV);
		controlEnlace.setBuscarV(buscarV);
		
		menuV.setVisible(true);
	}
	
}
