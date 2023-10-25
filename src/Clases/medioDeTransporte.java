package Clases;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class medioDeTransporte implements Hablar, Serializable {
    //Declaracion de atributos
	private String tipo; 
    protected boolean movimiento;
    private boolean estado;
    protected String color;
    private int velocidad;
    protected int kilometraje;
    protected double combustible;
    protected String motor;
    protected int limTanque;
    protected int noMotor;
    protected boolean enRenta;
    protected int costo;
    protected int costo_total;
    //Constructor
	public medioDeTransporte(String tipo, String color,int kilometraje, double combustible, String motor, int limTanque, int noMotor,int costo) {
        this.tipo=tipo;
		this.color = color;
        this.kilometraje = kilometraje;
        this.combustible = combustible;
        this.motor = motor;
        this.limTanque = limTanque;
        this.noMotor = noMotor;
        this.costo=costo;
        this.movimiento=false;
        this.estado=false;
        this.enRenta=false;
    }
	
	
	public int getCosto_total() {
		return costo_total;
	}


	public void setCosto_total(int costo_total) {
		this.costo_total = costo_total;
	}


	public void imprimir() {//Metodo que muestra los atributos
    	System.out.println("Color: "+getColor());
    	System.out.println("El kilometraje total es: "+getKilome());
    	System.out.println("La cantidad de combustible actual es: "+getCantCombustible());
    	System.out.println("El limite del tanque es de: "+getLimTanq());
    	System.out.println("El tipo de motor es: "+getMotor());
    	System.out.println("La cantidad de motores es: "+getNoMotor());
    }
	//Metodo para cambiar el combustibe, recibe el combustible gastado
	public void setCombustible(double combustible2) {
        combustible=combustible-combustible2;
        System.out.println("Combustible actual: "+this.combustible);
        System.out.println("Advertir cuando el combustible sea: "+this.limTanque*0.25);
    }
	//Metodo para obtener el combustible, uso la excepcion de Combustible
	public void getCombustible() throws Exception{
    	if(combustible<=limTanque*0.25){//Varifica que el nivel de combustible no sea menor al 1/4 del tanque
            throw(new CombusException("\nADVERTENCIA: Poca gasolina :c\n"));//Este es el mensaje que manda
        }
    }
    //Se cambia el kilometraje si hay combustible suficiente, se emplea la excepcion de Kilometraje
    //Recibe los kilometros para recorrer
	public void setKilometraje(int kilom) throws Exception {
        if(kilom*0.5>combustible)//Verifica si hay combustible
            throw(new KilomeException("Combustible insuficiente"));//Este es el mensaje que se manda
        else
            kilometraje = kilometraje + kilom;
    }
	
	public void mover(boolean movimiento) {
    	this.movimiento=movimiento;
    }
	
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getCosto() {
        return costo;
    }
    public int getVelocidad() {
        return velocidad;
    }

    public double getCantCombustible() {
        return combustible;
    }
    
    public void rellenarTanque() {
        this.combustible = this.limTanque;
    }

    public boolean getEstado() {
        return estado;
    }

    public void encender(boolean estado) {
        this.estado = estado;
    }
	
    public String getTipo() {
    	return tipo;
    }
    
    public String getColor(){
        return color;
    }

    public int getKilome() {
        return kilometraje;
    }

    public String getMotor() {
        return motor;
    }

    public int getLimTanq() {
        return limTanque;
    }

    public int getNoMotor() {
        return noMotor;
    }
    //Metodos abstractos
    public abstract void avanzar();

    public abstract void detener();
}
