package Clases;

@SuppressWarnings("serial")
public abstract class transporteMaritimo extends medioDeTransporte {
  //Atributos
  protected double profundidad;
  //Constructor
  public transporteMaritimo(String tipo, String color,int kilometraje, double combustible, String motor, int limTanque, int noMotor,int costo) {
	super(tipo,color,kilometraje,combustible,motor,limTanque,noMotor, costo);
    this.profundidad = 0;
  }
  public String anclar() {
	  return "ha anclado";
  }
  public void setProfundidad(int kilome) {
	  this.profundidad=kilome*0.5;
  }
  public String getProfundidad() {
	  return "La profundidad actual es de "+profundidad+" km";
  }
  //Interface (No se ocupan)
  public abstract String hablarHumano();
  //Metodo abstracto
  public abstract void avanzar(); 
  public abstract void detener();
}
