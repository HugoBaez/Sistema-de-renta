package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.*;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ver_contrato extends JFrame {
	protected contrato contrato;
	protected Renta renta;
	protected medioDeTransporte[] transpor;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ver_contrato frame = new ver_contrato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ver_contrato(contrato contrato,medioDeTransporte[] transpor) {
		setTitle("Contrato");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ver_rentas.class.getResource("/icons/logo2.png")));
		this.contrato=contrato;
		this.transpor=transpor;
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textPane.setBounds(32, 92, 599, 406);
		
		/*textPane.setText("El ciudadano "+ renta.getNombre_Cliente()+" con nacionalidad "+renta.getNacionalidad()+", y domicilio en la "+renta.getDomicilio()+". \nConvino el siguiente contrato de arredamiento por el medio de transporte."
				+ "\n\nPRIMERA. Consentimiento. \n  Por medio del presente contrato, el arrendador se obliga a conceder el uso y goce temporal del medio de transporte, por lo que el arrendatario deberá pagar un precio" + 
				" cierto y determinado."+"\nSEGUNDA. Condiciones del vehículo arrendado. \n El arrendatario recibe de conformidad de el "+renta.getTipo_Medio()+" arrendado, el cual se encuentra en ópticas condiciones mecánicas y de carrocería"
				+"\nTERCERA.Plazo del arrendamiento.\n  La vigencia de este contrato será del "+renta.getFecha_ini()+" al "+renta.getFecha_fin()+" la cual no podrá ser prorrogada sino con el pleno consentimiento de " + 
				"ambas partes expresado en un nuevo contrato de arrendamiento"
				+"\nCuarta. Precio del arrendamiento.\n  El arrendatario, por el uso y goce temporal del vehículo arrendado, deberá pagar la cantidad de $"+renta.getPago()+
				"\nQuinta. Modalidades de pago.\n El arrendatario pagara la renta del vehículo con la tarjeta bancaria con el numero "+renta.getN_Tarjeta()+".");*/
		textPane.setText(contrato.getContrato());
		contentPane.add(textPane);
		
		JLabel label = new JLabel("Contrato");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 36));
		label.setBounds(191, 21, 281, 38);
		contentPane.add(label);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ver_rentas(transpor).setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 33));
		button.setBorder(null);
		button.setBackground(new Color(0, 102, 255));
		button.setBounds(253, 502, 157, 39);
		contentPane.add(button);
		
	
	}

}
