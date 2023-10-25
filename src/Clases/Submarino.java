package Clases;

@SuppressWarnings("serial")
public class Submarino extends transporteMaritimo {

    protected String material;
    protected String tamano;
    protected int peso;
    protected int limPresion;
    protected String radar;
    //Constructor
    public Submarino(String tipo,String color,int kilometraje, double combustible,String motor,int limTanque,int noMotor,String material,String tamano,int peso,int limPresion,int costo) {
        //Declaracion de atributos
    	super(tipo,color,kilometraje,combustible,motor,limTanque,noMotor, costo);
	    this.material = material;
	    this.tamano = tamano;
	    this.peso = peso;
	    this.limPresion = limPresion;
	    this.radar="no se ha usado el radar ni una vez";
    }
    
    //Metodo que muestra los atributos
    public void imprime(){
    	System.out.println("Submarino "+getTipo()+"\n");
    	imprimir();
    	System.out.println("El material es: "+getMaterial());
    	System.out.println("El tamano es: "+getTamano());
    	System.out.println("El peso es: "+getPeso());
    	System.out.println("");
    }
    
    //Metodo para cambiar el combustibe, recibe el combustible gastado
    public void setCombustible(int com){
        combustible = combustible - com;
        System.out.println("Combustible " + combustible);
        System.out.println("Limite del tanque " + (limTanque * 0.25));
    }
    
    public String anclar() {
    	return "El submarino a anclado";
    }
    
    public void sumergir() {
        System.out.println("El submarino se ha sumergido");
    }

    public void ascender() {
        System.out.println("El submarino ha ascendido");
        setProfundidad(0);
    }
    
    public void avanzar() {
    	encender(true);
        System.out.println("Submarino encendido");
    }
    //Sobrecarga de avanzar, recibe la velocidad para avanzar
    public void avanzar(int velocidad) {
    	mover(true);
    	System.out.println("Estoy avanzando a " +velocidad+"km/h");
    }
    
    public void detener() {
    	encender(false);
    	mover(false);
    	System.out.println("Submarino apagado");
    }
    //Metodo de readar
    //Recibe un numero random
    public void Radar(int detectar){
        int contaDiv=0,i;
        //Verifica si es un numero primo
    	for(i=1;i<=detectar;i++) {
    		if(detectar%i==0) {
    			contaDiv++;
    		}
    	}
    	if (contaDiv==2) {//si lo es encontro algo
    		this.radar="encontro algo\n";
    	}
    	else {//si no es no encontro nada
    		this.radar="no encontro nada\n";
    	}
    }
    //Interface
    public String hablarHumano(){
        return "Hola humano, espero disfrutes del oceano. Revise el radar y "+getRadar()+"\n";
    }
    
    public String getMaterial(){
        return material;
    }

    public int getPeso(){
        return peso;
    }

    public String getTamano(){
        return tamano;
    }
    public int getLimPresion(){
        return limPresion;
    }
    public String getRadar() {
        return radar;
    }
}
