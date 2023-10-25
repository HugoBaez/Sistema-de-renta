package Clases;

import java.io.Serializable;

@SuppressWarnings("serial")
public class cliente implements Serializable{
	private String Nombre;
	private String nacionalidad;
	private String domicilio;
	private String folio;
	private tarjeta tarjeta;
	
	public cliente(String nombre, tarjeta tarjeta) {
		Nombre = nombre;
		this.tarjeta=tarjeta;
	}
	public cliente(String nombre) {
		Nombre = nombre;
		
	}
	
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}



	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getN_tarjeta(){
		return tarjeta.getNumero();
	}



}
