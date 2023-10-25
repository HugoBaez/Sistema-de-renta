package Clases;

//Creacion de una excepcion personaliza. Combustible
public class CombusException extends Exception{
	
	public static final long serialVersionUID = 700L;
	
	public CombusException(String msg) {
		super(msg);
	}
}
