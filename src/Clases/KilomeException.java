package Clases;

//Creacion de una excepcion personaliza. Kilometraje
public class KilomeException extends Exception{
	
	public static final long serialVersionUID = 800L;
	
	public KilomeException(String msg) {
		super(msg);
	}
}
