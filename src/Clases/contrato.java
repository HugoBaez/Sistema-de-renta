package Clases;

import java.io.Serializable;

@SuppressWarnings("serial")
public class contrato implements Serializable {
	private cliente	cliente;
	private medioDeTransporte medio;
	private String Fecha_ini;
	private String Fecha_fin;
	
	public contrato(cliente cliente,medioDeTransporte medio,String fecha_ini, String fecha_fin) {
		this.cliente=cliente;
		this.medio=medio;
		this.Fecha_fin=fecha_fin;
		this.Fecha_ini=fecha_ini;
	}
	public String getContrato() {
		return "El ciudadano "+ cliente.getNombre()+" con nacionalidad "+cliente.getNacionalidad()+", y domicilio en la "+cliente.getDomicilio()+". \nConvino el siguiente contrato de arredamiento por el medio de transporte.\nCLAUSULAS"+
				"\nPRIMERA. Consentimiento. \n  Por medio del presente contrato, Vector´s Rent se obliga a conceder el uso y goce temporal del medio de transporte, por lo que el arrendatario deberá pagar un precio" + 
				" cierto y determinado."+"\nSEGUNDA. Condiciones del vehículo arrendado. \n El arrendatario recibe de conformidad de el "+medio.getTipo()+" arrendado, el cual se encuentra en ópticas condiciones mecánicas y de carrocería"
				+"\nTERCERA.Plazo del arrendamiento.\n  La vigencia de este contrato será del "+Fecha_ini+" al "+Fecha_fin+" la cual no podrá ser prorrogada sino con el pleno consentimiento de " + 
				"ambas partes expresado en un nuevo contrato de arrendamiento"
				+"\nCuarta. Precio del arrendamiento.\n  El arrendatario, por el uso y goce temporal del vehículo arrendado, deberá pagar la cantidad de $"+medio.getCosto_total()+
				"\nQuinta. Modalidades de pago.\n El arrendatario pago la renta del vehículo con una tarjeta bancaria de numero "+cliente.getN_tarjeta();
	}
}
