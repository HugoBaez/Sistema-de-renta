package Clases;
import Interfaces.*;

public class test_grafico {

	public static void main(String[] args) {
		
		medioDeTransporte transpor[]= new medioDeTransporte[5];//Arreglo de medio de transporte
		transpor[0]= new Submarino("Aleman","gris",0, 1000,"FM 38-D8-1", 1000, 2, "Acero", "Grande", 3000, 900, 250);
		transpor[1]= new Avion("Boing","blanco", 0, 400, "Turbofan Pratt", 10000, 4, "Turista",300);
		transpor[2]= new Submarino("Ruso","rojo",0, 1000,"FM 39-B8-1", 2000, 4, "Titanio", "Mediano", 2500, 1200,300);
		transpor[3]= new Avion("Presidencial","azul", 0, 0, "Whitney JT8D", 15500, 6, "Premium",500);
		transpor[4]= new Submarino("Recreativo","dorado",0, 400,"AM 69-U5-7", 1500, 3, "Cobre", "Chico", 1300, 600,100);
		new Home(transpor).setVisible(true);

	}

}
