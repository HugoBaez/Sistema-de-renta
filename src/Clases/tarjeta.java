package Clases;

import java.io.Serializable;

public class tarjeta implements Serializable{
	String numero;
	String cvv;
	
	public tarjeta (String num, String cvv) {
		this.numero=num;
		this.cvv=cvv;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
