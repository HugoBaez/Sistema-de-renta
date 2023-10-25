package Clases;
//Hola
//Vector
@SuppressWarnings("serial")
public class Avion extends transporteAereo {
    //Declaracion de atributos
	private int alas;
    private String clase;
    //Constructor
    public Avion(String tipo, String color,int kilometraje, double combustible, String motor, int limTanque, int noMotor, String clase,int costo) {
    	super(tipo,color,kilometraje,combustible,motor,limTanque,noMotor, costo);
		this.alas=2;
		this.clase=clase;
    }
     //Metodo para cambiar el combustibe, recibe el combustible gastado
    public void setCombustible(int com) {
        combustible=combustible-com;
        System.out.println("Com"+this.combustible);
        System.out.println("Lim"+limTanque*0.25);
    }
    
    public void avanzar() {
    	encender(true);
        System.out.println("Avion encendido");
        System.out.println("El avion "+despegar());
    }
    //Sobrecarga de avanzar, recibe la velocidad para avanzar
    public void avanzar(int velocidad) {
    	mover(true);
    	System.out.println("El avion vuela a " +velocidad+"km/h");
    }
    
    public void detener() {
    	encender(false);
    	mover(false);
    	System.out.println("Avion apagado");
    }
    //Metodo que muestra los atributos
    public void imprime(){
    	System.out.println("Avion "+getTipo()+"\n");
        imprimir();
        System.out.println("La clase es: "+getClase());
        System.out.println("");
    }
    
    public int getNoAlas(){
        return alas;
    }
    
    public  String getClase(){
        return clase;
    }
    //Interface
    public String hablarHumano(){
        return "Si hubiera podido elegir entre ser un avion u otra cosa elegiria ser una licuadora\n";
    }
    
    public String descender() {
        return "El avion ha descendido";
    }
}
