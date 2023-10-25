package Clases;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Renta implements Serializable {
	private cliente cliente;
	private String Fecha_ini;
	private String Fecha_fin;
	private medioDeTransporte medio;
	private String Forma_de_pago;
	private int Pago;
	protected contrato contrato;
	
	public Renta(contrato contrato, medioDeTransporte medio,cliente cliente, String fecha_ini, String fecha_fin,int pago, String Forma_pago) {
		this.contrato=contrato;
		this.cliente=cliente;
		Fecha_ini = fecha_ini;
		Fecha_fin = fecha_fin;
		this.medio = medio;
		this.Pago=pago;
		this.Forma_de_pago=Forma_pago;
		
	}

	public Renta(cliente cliente, String fecha_ini, String fecha_fin, medioDeTransporte medio,int pago, String Forma_pago) {
	
		this.cliente=cliente;
		Fecha_ini = fecha_ini;
		Fecha_fin = fecha_fin;
		this.medio = medio;
		this.Pago=pago;
		this.Forma_de_pago=Forma_pago;
		
	}
	public contrato getContrato() {
		return contrato;
	}
	public String getFecha_ini() {
		return Fecha_ini;
	}

	public void setFecha_ini(String fecha_ini) {
		Fecha_ini = fecha_ini;
	}

	public String getFecha_fin() {
		return Fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		Fecha_fin = fecha_fin;
	}
	
	public String getNombre_Cliente() {
		return cliente.getNombre();
	}
	public String getForma_de_pago() {
		return Forma_de_pago;
	}

	public void setForma_de_pago(String forma_de_pago) {
		Forma_de_pago = forma_de_pago;
	}

	public String getTipo_Medio() {
		if(medio instanceof Submarino)
			return "Submarino "+medio.getTipo();
		else
			return "Avion "+medio.getTipo();
	}

	public int getPago() {
		return Pago;
	}

	public void setPago(int pago) {
		Pago = pago;
	}
	
	public String getN_Tarjeta(){
		return cliente.getN_tarjeta();
	}

	public String getNacionalidad() {
		return cliente.getNacionalidad();
	}
	public String getDomicilio() {
		return cliente.getDomicilio();
	}
	public String getFormpag() {
	
		return Forma_de_pago;
	}

}
