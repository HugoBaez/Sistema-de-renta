package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import Clases.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class generar_contrato extends JFrame {
	
	protected cliente cliente;
	protected medioDeTransporte[] transpor;
	private String Fecha_inicio;
	private String Fecha_fin;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contrato frame = new contrato();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the frame.
	 */
	public generar_contrato(cliente cliente,medioDeTransporte[] transpor,int numerodetransporte,String fecha_inicio,String fecha_fin) {
		setTitle("Contrato");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ver_rentas.class.getResource("/icons/logo2.png")));
		this.cliente=cliente;
		this.transpor=transpor;
		this.Fecha_inicio=fecha_inicio;
		this.Fecha_fin=fecha_fin;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(19, 67, 625, 423);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("El ciudadano(a) ");
		lblNewLabel.setBounds(10, 11, 101, 19);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setText(cliente.getNombre());
		lblNewLabel_1.setBounds(104, 13, 123, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("con nacionalidad");
		lblNewLabel_2.setBounds(206, 13, 108, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(311, 10, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("con domicilio en la calle");
		lblNewLabel_3.setBounds(420, 13, 150, 14);
		panel.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 38, 101, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("numero");
		lblNewLabel_4.setBounds(122, 44, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 41, 30, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("en el municipio");
		lblNewLabel_5.setBounds(218, 44, 123, 14);
		panel.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(307, 41, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("del estado de");
		lblNewLabel_6.setBounds(408, 44, 133, 14);
		panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(489, 41, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Monospaced", Font.PLAIN, 13));
		textPane.setBounds(10, 93, 576, 347);
		textPane.setText("CLAUSULAS"+
				"\nPRIMERA. Consentimiento. \n  Por medio del presente contrato, Vector´s Rent se obliga a conceder el uso y goce temporal del medio de transporte, por lo que el arrendatario deberá pagar un precio" + 
				" cierto y determinado."+"\nSEGUNDA. Condiciones del vehículo arrendado. \n El arrendatario recibe de conformidad de el "+transpor[numerodetransporte].getTipo()+" arrendado, el cual se encuentra en ópticas condiciones mecánicas y de carrocería"
				+"\nTERCERA.Plazo del arrendamiento.\n  La vigencia de este contrato será del "+Fecha_inicio+" al "+Fecha_fin+" la cual no podrá ser prorrogada sino con el pleno consentimiento de " + 
				"ambas partes expresado en un nuevo contrato de arrendamiento"
				+"\nCuarta. Precio del arrendamiento.\n  El arrendatario, por el uso y goce temporal del vehículo arrendado, deberá pagar la cantidad de $"+transpor[numerodetransporte].getCosto_total()+
				"\nQuinta. Modalidades de pago.\n El arrendatario pagara la renta del vehículo con una tarjeta bancaria.");
		panel.add(textPane);
		
		JLabel lblNewLabel_8 = new JLabel("Conviene el siguiente contrato de arredamiento por el medio de transporte.");
		lblNewLabel_8.setBounds(10, 72, 484, 14);
		panel.add(lblNewLabel_8);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(textField.getText()).equals("")&& !(textField_1.getText()).equals("")&&!(textField_2.getText()).equals("")&&!(textField_3.getText()).equals("")&&!(textField_3.getText()).equals("")){
					cliente.setDomicilio("Calle "+textField_1.getText()+" numero "+textField_2.getText()+", colonia "+textField_3.getText()+",del estado de  "+textField_4.getText());
					cliente.setNacionalidad(textField.getText());
					//renta.setDireccion_cliente("Calle "+textField_1.getText()+" numero "+textField_2.getText()+", colonia "+textField_3.getText()+",del estado de  "+textField_4.getText());
					//renta.setNacionalida_cliente(textField.getText());
					contrato contratoi=new contrato(cliente,transpor[numerodetransporte],Fecha_inicio,Fecha_fin);
					new Comprobante(contratoi,transpor,cliente,numerodetransporte,Fecha_inicio,Fecha_fin).setVisible(true);
						dispose();
					
				}else {
					JOptionPane.showMessageDialog(null,"Debe llenar todos los campos","", JOptionPane.WARNING_MESSAGE);
				}
			}
			
		});
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 33));
		btnAceptar.setBorder(null);
		btnAceptar.setBackground(new Color(0, 102, 255));
		btnAceptar.setBounds(378, 501, 157, 39);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Home(transpor).setVisible(true);
				dispose();
			}
		});
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 33));
		btnCancelar.setBorder(null);
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(108, 501, 157, 39);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_7 = new JLabel("Contrato");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel_7.setBounds(191, 11, 281, 38);
		contentPane.add(lblNewLabel_7);
	}
}
