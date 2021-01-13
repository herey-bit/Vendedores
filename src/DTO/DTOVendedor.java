package DTO;

public class DTOVendedor extends DTOEmpleado {
	
	private String zonaVenta;
	
	
	
	public DTOVendedor(String apellidoPaterno, String apellidoMaterno, String nombre, Integer telefono, String curp,
			String rfc, String correoElectronico, String zonaVenta) {
		super(apellidoPaterno, apellidoMaterno, nombre, telefono, curp, rfc, correoElectronico);
		this.zonaVenta = zonaVenta;
	}
	
	

	public DTOVendedor() {
		// TODO Auto-generated constructor stub
		super();
	}



	public String getZonaVenta() {
		return zonaVenta;
	}

	public void setZonaVenta(String zonaVenta) {
		this.zonaVenta = zonaVenta;
	}
	
}
