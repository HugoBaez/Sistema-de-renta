package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Comprobante extends JFrame {
	protected contrato contrato;
	protected medioDeTransporte[] transpor;
	protected cliente cliente;
	private String Fecha_inicio;
	private String Fecha_fin;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comprobante frame = new Comprobante();
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
	public Comprobante(contrato contrato,medioDeTransporte[] transpor, cliente cliente,int numerodetransporte,String fecha_inicio,String fecha_fin) {
		setTitle("Comprobante");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ver_rentas.class.getResource("/icons/logo2.png")));
		this.contrato=contrato;
		this.transpor=transpor;
		this.cliente=cliente;
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
		panel.setBounds(27, 97, 579, 327);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Cliente:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_10.setBounds(137, 24, 105, 35);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de renta:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_5.setBounds(39, 70, 200, 27);
		panel.add(lblNewLabel_5);
		
		JLabel nombre = new JLabel("New label");
		nombre.setFont(new Font("Arial", Font.PLAIN, 15));
		nombre.setHorizontalAlignment(SwingConstants.LEFT);
		nombre.setBounds(252, 30, 287, 27);
		panel.add(nombre);
		
		JLabel fecha_renta = new JLabel("New label");
		fecha_renta.setHorizontalAlignment(SwingConstants.LEFT);
		fecha_renta.setFont(new Font("Arial", Font.PLAIN, 15));
		fecha_renta.setBounds(249, 70, 287, 27);
		panel.add(fecha_renta);
		
		JLabel label_1 = new JLabel("Fecha de entrega:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Arial", Font.BOLD, 20));
		label_1.setBounds(39, 113, 200, 27);
		panel.add(label_1);
		
		JLabel fecha_entre = new JLabel("New label");
		fecha_entre.setHorizontalAlignment(SwingConstants.LEFT);
		fecha_entre.setFont(new Font("Arial", Font.PLAIN, 15));
		fecha_entre.setBounds(249, 113, 287, 27);
		panel.add(fecha_entre);
		
		JLabel lblTransporte = new JLabel("Transporte:");
		lblTransporte.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTransporte.setFont(new Font("Arial", Font.BOLD, 20));
		lblTransporte.setBounds(39, 159, 200, 27);
		panel.add(lblTransporte);
		
		JLabel medio_trans = new JLabel("New label");
		medio_trans.setHorizontalAlignment(SwingConstants.LEFT);
		medio_trans.setFont(new Font("Arial", Font.PLAIN, 15));
		medio_trans.setBounds(249, 159, 287, 27);
		panel.add(medio_trans);
		
		JLabel lblCosto = new JLabel("Costo:");
		lblCosto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCosto.setFont(new Font("Arial", Font.BOLD, 20));
		lblCosto.setBounds(39, 201, 200, 27);
		panel.add(lblCosto);
		
		JLabel costo = new JLabel("New label");
		costo.setHorizontalAlignment(SwingConstants.LEFT);
		costo.setFont(new Font("Arial", Font.PLAIN, 15));
		costo.setBounds(249, 201, 287, 27);
		panel.add(costo);
		
		JLabel lblComprobante = new JLabel("Comprobante");
		lblComprobante.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprobante.setFont(new Font("Arial", Font.BOLD, 36));
		lblComprobante.setBounds(191, 22, 281, 38);
		contentPane.add(lblComprobante);
		
	
		
		JLabel lblForma = new JLabel("Forma de pago :");
		lblForma.setHorizontalAlignment(SwingConstants.RIGHT);
		lblForma.setFont(new Font("Arial", Font.BOLD, 20));
		lblForma.setBounds(39, 239, 200, 27);
		panel.add(lblForma);
		
		JLabel Forma = new JLabel("0");
		Forma.setHorizontalAlignment(SwingConstants.LEFT);
		Forma.setFont(new Font("Arial", Font.PLAIN, 15));
		Forma.setBounds(249, 239, 287, 27);
		panel.add(Forma);
		
		JLabel lblNumeroDeTarjeta = new JLabel("Numero de tarjeta:");
		lblNumeroDeTarjeta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroDeTarjeta.setFont(new Font("Arial", Font.BOLD, 20));
		lblNumeroDeTarjeta.setBounds(39, 277, 200, 27);
		panel.add(lblNumeroDeTarjeta);
		
		JLabel Numero = new JLabel("0");
		Numero.setHorizontalAlignment(SwingConstants.LEFT);
		Numero.setFont(new Font("Arial", Font.PLAIN, 15));
		Numero.setBounds(249, 277, 287, 27);
		panel.add(Numero);
		Clases.Renta renta=new Clases.Renta(contrato,transpor[numerodetransporte],cliente,Fecha_inicio,Fecha_fin,transpor[numerodetransporte].getCosto_total(),"Tarjeta bancaria");
		nombre.setText(cliente.getNombre());
		medio_trans.setText(renta.getTipo_Medio());
		fecha_entre.setText(renta.getFecha_fin());
		fecha_renta.setText(renta.getFecha_ini());
		costo.setText(""+renta.getPago());
		Forma.setText(renta.getForma_de_pago());
		Numero.setText(renta.getN_Tarjeta());
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File fichero = new File("src/Rentas/"+renta.getFecha_ini()+".obj");
					FileOutputStream fichero1= new FileOutputStream(fichero);
					ObjectOutputStream escribir = new ObjectOutputStream(fichero1);
					escribir.writeObject(renta);
					escribir.close();
					fichero1.close();
					JOptionPane.showMessageDialog(null,"Renta registrada","",JOptionPane.INFORMATION_MESSAGE);
					new Home(transpor).setVisible(true);
					dispose();
				}catch(IOException ex){
					JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 33));
		button.setBorder(null);
		button.setBackground(new Color(0, 102, 255));
		button.setBounds(253, 483, 157, 39);
		contentPane.add(button);
	}

}
