package Clases;

@SuppressWarnings("serial")
public abstract class transporteAereo extends medioDeTransporte {
    //Atributos
    private double altitud;
    //Constructor
    public transporteAereo(String tipo, String color,int kilometraje, double combustible, String motor, int limTanque, int noMotor,int costo) {
    	super(tipo,color,kilometraje,combustible,motor,limTanque,noMotor, costo);
    	this.altitud=0;
    }
    
    public String despegar() {
        return "ha despegado";
    }

    public String descender() {
        return "ha descendido";
    }
    public void setAltitud(int kilome) {
    	this.altitud=kilome*0.5;
    }
    public String getAltitud() {
        return "La altitud actual es de: "+altitud+" km";
    }

    //Estos no se ocupan
    public abstract String hablarHumano();
    public abstract void avanzar();
    public abstract void detener();
}
