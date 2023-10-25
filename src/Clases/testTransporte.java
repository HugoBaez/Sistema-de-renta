package Clases;

import java.util.Scanner;
import java.util.Random;
public class testTransporte{
	//Para verificar si ingresa numeros
	private static boolean esNumero(String cadena) {
		try {
			Integer.parseInt(cadena);
			if (Integer.parseInt(cadena)<=0) {
				System.out.println("Error, el dato no puede ser negativo o cero\n");
				return false;
			}
			else
				return true;
		} catch (NumberFormatException e){
			System.out.println("Error, debe ingresar un numero\n");
			return false;
		}
	}
	public static void main(String args[]) throws Exception {
		//Declaracion del objeto que lee datos
		Scanner entrada = new Scanner (System.in);//Entrada
		//Arreglo de medios de transporte preestablecidos
		medioDeTransporte transpor[]= new medioDeTransporte[5];//Arreglo de medio de transporte
		transpor[0]= new Submarino("Aleman","gris",0, 1000,"FM 38-D8-1", 1000, 2, "Acero", "Grande", 3000, 900, 250);
		transpor[1]= new Avion("Boing","blanco", 0, 400, "Turbofan Pratt", 10000, 4, "Turista",300);
		transpor[2]= new Submarino("Ruso","rojo",0, 1000,"FM 39-B8-1", 2000, 4, "Titanio", "Mediano", 2500, 1200,300);
		transpor[3]= new Avion("Presidencial","azul", 0, 0, "Whitney JT8D", 15500, 6, "Premium",500);
		transpor[4]= new Submarino("Recreativo","dorado",0, 400,"AM 69-U5-7", 1500, 3, "Cobre", "Chico", 1300, 600,100);
		//Variables
		String cadena;
		int op=0,i,opc=0;
		int velocidad=0, kilometros=0;
		double combustible=0;
		char resp;
		boolean valida;
		Random escanear= new Random();
		//El do nos permite repetir el menu hasta seleccionar salir
		do{
			//El do nos permite repetir en caso que no se de un dato numerico
			do {
				System.out.print("Programa que permite manejar 5 medios de transporte entre los cuales hay submarionos y aviones \nUsted desea: \n1)Usar transporte \n2)Revisar informacion de algun transporte \n3)Salir \n�Que desea hacer?: ");
				cadena=entrada.nextLine();
				System.out.println("");
				valida=esNumero(cadena);
				if (valida==true)
					op=Integer.parseInt(cadena);
			}while(valida==false);
			switch (op) {
				case 1: System.out.println("Usar un transporte");
						do {//El do para enceder otro medio de transporte
							System.out.println("Los transportes disponibles son: ");//Muestra los transportes
							for (i=0;i<5;i++) {
								System.out.print((i+1)+") ");
								if (transpor[i] instanceof Submarino) {//Si es un objeto de la clase submarino
									System.out.print("Submarino ");
								}
								else
									System.out.print("Avion ");//Si no es submarion, es un avion
								System.out.println(transpor[i].getTipo());
							}
							do {
								do {
									System.out.print("Usted va usar el numero: ");//Lectura del medio de transporte a utilizar
									cadena=entrada.nextLine();
									System.out.println("");
									valida=esNumero(cadena);
									if (valida==true)
										opc=Integer.parseInt(cadena);
								}while(valida==false);
							}while (opc>5);
							if (transpor[opc-1] instanceof Submarino) {//Arreanca Submarino
								System.out.println("Submarino "+transpor[opc-1].getTipo()+":");
								((Submarino) transpor[opc - 1]).sumergir();
								transpor[opc-1].avanzar();
								do {//Do de seguir avanzando
									try{//Correspode a la excepcion de combustible
										try{//Correspondo a la excepcion de kilometraje
											do {	//Porceso de utilizacion del submarino
												transpor[opc-1].getCombustible();//Se obtinene el combustible
												System.out.print("�Cuantos kilometros quiere recorrer?: ");
												cadena=entrada.nextLine();
												System.out.println("");
												valida=esNumero(cadena);//Valida si la lectura es un numero											
												if (valida == true)
													kilometros=Integer.parseInt(cadena);
											}while(valida==false);
											transpor[opc-1].setKilometraje(kilometros);//Se suman los kilometros
											((Submarino) transpor[opc-1]).setProfundidad(kilometros);
											combustible=kilometros*0.50;//Se hace la equivalencia de kilometros por combustible
											do {
												System.out.print("Ingrese la velocidad: ");//Lectura de velocidad
												cadena=entrada.nextLine();
												System.out.println("");
												valida=esNumero(cadena);//Valida si la lectura es un numero
												if (valida==true)
													velocidad=Integer.parseInt(cadena);
											}while(valida==false);
											((Submarino) transpor[opc-1]).avanzar(velocidad);//Avanza el submarino
											System.out.println(((Submarino) transpor[opc-1]).getProfundidad());
											((Submarino) transpor[opc-1]).Radar(escanear.nextInt(100));//Manda un numero aleatorio para el radadr
											transpor[opc-1].setCombustible(combustible);//Se resta el combustible utilizado
										}catch(KilomeException e){//Corresponde a la excepcion de kilometraje
											System.out.println(e.getMessage());
										}
									}catch(CombusException e){//Corresponde a la excepcion de combustible
										System.out.println(e.getMessage());
										do {//Proceso para llenar el tanque
											System.out.print("�Quiere llenar el tanque? s/n: ");
											resp=entrada.next().charAt(0);
											entrada.nextLine();
											System.out.println("");
											if (resp!='s' && resp!='n') {
												System.out.println("Error, opcion no valida");
											}
										}while (resp!='s' && resp!='n');
										if(resp=='s'){
											transpor[opc-1].rellenarTanque();
											System.out.println("Tanque llenado");
										}
									}
									do{//Para seguir avanzando
										System.out.println("�Quiere seguir avanzando? s/n: ");
										resp=entrada.next().charAt(0);
										entrada.nextLine();
										System.out.println("");
										if (resp!='s' && resp!='n') {
											System.out.println("Error, opcion no valida");
										}
									}while (resp!='s' && resp!='n');
								}while (resp!='n');
								//Proceso de detencion del submarino
								((Submarino) transpor[opc-1]).ascender();
								System.out.println(((Submarino) transpor[opc-1]).anclar());
								transpor[opc-1].detener();
							}
							else {//Arreanca avion
								System.out.println("Avion "+transpor[opc-1].getTipo()+":");
								transpor[opc-1].avanzar();
								do {//es el do para seguir avanzando
									try{//Corresponde a la excepcion de combustible
										try{//Corresponde a la excepcion de kilometraje
											do {	
												transpor[opc-1].getCombustible();//se obtiene el combustible
												System.out.print("�Cuantos kilometros quiere recorrer?: ");
												cadena=entrada.nextLine();
												System.out.println("");
												valida=esNumero(cadena);//valida si se leyo un numero									
												if (valida == true)
													kilometros=Integer.parseInt(cadena);
											}while(valida==false);
											transpor[opc-1].setKilometraje(kilometros);//Se suman los kilometros
											((Avion)transpor[opc-1]).setAltitud(kilometros);
											combustible=kilometros*0.50;//Se hace la equivalencia de kilometros por combustible
											do {
												System.out.print("Ingrese la velocidad: ");//Lectura de velocidad
												cadena=entrada.nextLine();
												System.out.println("");
												valida=esNumero(cadena);//Valida si es un numero
												if (valida==true)
													velocidad=Integer.parseInt(cadena);
											}while(valida==false);
											((Avion) transpor[opc-1]).avanzar(velocidad);//avanza
											System.out.println(((Avion)transpor[opc-1]).getAltitud());
											transpor[opc-1].setCombustible(combustible);//Se resta el combustible gastado
										}catch(KilomeException e){//Corresponde a la excepcion de kilometraje
											System.out.println(e.getMessage());
										}
									}catch(CombusException e){//Corresponde a la excepcion de combustible
										System.out.println(e.getMessage());
										do {//Proceso para llenar tanque
											System.out.print("�Quiere llenar el tanque? s/n: ");
											resp=entrada.next().charAt(0);
											entrada.nextLine();
											System.out.println("");
											if (resp!='s' && resp!='n') {
												System.out.println("Error, opcion no valida");
											}
										}while (resp!='s' && resp!='n');
										if(resp=='s'){
											transpor[opc-1].rellenarTanque();
											System.out.println("Tanque llenado");
										}
									}
									do{//Para seguir avanzando
										System.out.println("�Quiere seguir avanzando? s/n: ");
										resp=entrada.next().charAt(0);
										entrada.nextLine();
										System.out.println("");
										if (resp!='s' && resp!='n') {
											System.out.println("Error, opcion no valida");
										}
									}while (resp!='s' && resp!='n');
								}while (resp!='n');
								//proceso para detener el avion
								System.out.println(((Avion) transpor[opc-1]).descender());
								transpor[opc-1].detener();
							}
							do {//Encender otro avion
								System.out.print("�Quiere encender otro medio de transporte? s/n: ");
								resp=entrada.next().charAt(0);
								entrada.nextLine();
								System.out.println("");
								if (resp!='s' && resp!='n') {
									System.out.println("Error, opcion no valida");
								}
							}while (resp!='s' && resp!='n');
						}while(resp!='n');
						break;
				case 2: System.out.println("Revisar informacion de algun transporte");
						do {//El do para revisar otro transporte
							System.out.println("Los transportes disponibles son: ");//Muestra los medios de transportes
							for (i=0;i<5;i++) {
								System.out.print((i+1)+") ");
								if (transpor[i] instanceof Submarino) {
									System.out.print("Submarino ");
								}
								else
									System.out.print("Avion ");
								System.out.println(transpor[i].getTipo());
							}
							do {
								do {//Se lee el medio de transporte a revisar
									System.out.print("Usted va revisar el numero: ");
									cadena=entrada.nextLine();
									System.out.println("");
									valida=esNumero(cadena);// Valida si se leyo un numero
									if (valida==true)
										opc=Integer.parseInt(cadena);
								}while(valida==false);
							}while (opc>5);
							if (transpor[opc-1] instanceof Submarino) {//Si selecciono un submario
								((Submarino) transpor[opc-1]).imprime();//Llama al metodo que muestra atributos
							}
							else {//si no, es un avion
								((Avion) transpor[opc-1]).imprime();//Llama al metodo que muestra atributos
							}
							//Uso de la interface
							System.out.println("Un mensaje para usted por parte del transporte:");
							System.out.println(transpor[opc-1].hablarHumano());
							do {//Para revisar otro medio de transporte
								System.out.print("�Quiere revisar otro medio de transporte? s/n: ");
								resp=entrada.next().charAt(0);
								entrada.nextLine();
								System.out.println("");
								if (resp!='s' && resp!='n') {
									System.out.println("Error, opcion no valida");
								}
							}while (resp!='s' && resp!='n');
						}while(resp!='n');
						break;
				case 3: System.out.println("Muchas gracias por usar el programa =]");//Mensaje de cierre
						break;
				default: System.out.println("Error,opcion no valida");
			}
		}while (op!=3);
		entrada.close();
	}
}