package Interfaces;

//import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Toolkit;


@SuppressWarnings("serial")
public class Pagar extends JFrame {
	protected int numerodetransporte;
	private String Fecha_inicio;
	private String Fecha_fin;
	protected medioDeTransporte[] transpor;
	//private int costo;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagar frame = new Pagar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	**
	 * Create the frame.
	 */
	public Pagar(medioDeTransporte[] transpor,int numerodetransporte,String fecha_inicio,String fecha_fin) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pagar.class.getResource("/icons/logo2.png")));
		this.transpor=transpor;
		this.numerodetransporte=numerodetransporte;
		this.Fecha_inicio=fecha_inicio;
		this.Fecha_fin=fecha_fin;
		//this.costo=total;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Datos para renta");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(126, 24, 390, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setIcon(new ImageIcon(Pagar.class.getResource("/icons/usuario.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 24));
		lblNewLabel_1.setBounds(89, 95, 164, 75);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(291, 122, 244, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Forma de pago:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon(Pagar.class.getResource("/icons/metodo-de-pago.png")));
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(28, 181, 248, 57);
		contentPane.add(lblNewLabel_2);

		JPanel panel = new JPanel();
		panel.setBounds(15, 305, 611, 150);
		//contentPane.add(panel);
		panel.setLayout(null);
		//panel.setLocation(15,402);
		
		JLabel lblNewLabel_5 = new JLabel("Numero de tarjeta:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(40, 41, 238, 24);
		panel.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(325, 46, 179, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblClaveDeTarjeta = new JLabel("Clave de tarjeta:");
		lblClaveDeTarjeta.setFont(new Font("Arial", Font.PLAIN, 22));
		lblClaveDeTarjeta.setBounds(40, 98, 238, 24);
		panel.add(lblClaveDeTarjeta);
		
		JButton btnNewButton = new JButton("Pagar");
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 33));
		
		btnNewButton.setBounds(248, 428, 147, 51);
		contentPane.add(btnNewButton);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(325, 103, 179, 20);
		panel.add(textField_2);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Efectivo");
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnNewRadioButton.setContentAreaFilled(false);
		buttonGroup.add(rdbtnNewRadioButton);
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarjeta");
		rdbtnNewRadioButton_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.PLAIN, 16));
		rdbtnNewRadioButton_1.setContentAreaFilled(false);
		buttonGroup.add(rdbtnNewRadioButton_1);
		contentPane.add(panel);
		panel.setVisible(false);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnNewRadioButton.isSelected()==true) {
					contentPane.add(panel);
					rdbtnNewRadioButton_1.setSelected(false);
					panel.setVisible(false);
					btnNewButton.setLocation(248, 428);
					
						}
			}
		});
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(310, 200, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		//JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarjeta");
		rdbtnNewRadioButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(rdbtnNewRadioButton_1.isSelected()==true) {
					contentPane.add(panel);
					rdbtnNewRadioButton.setSelected(false);
					panel.setVisible(true);
					btnNewButton.setLocation(248,478);

				}
			}
		});
		rdbtnNewRadioButton_1.setBounds(455, 200, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Total a pagar:");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Arial", Font.ITALIC, 24));
		lblNewLabel_3.setBounds(107, 264, 164, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setBounds(305, 249, 329, 47);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setText("$"+transpor[numerodetransporte].getCosto_total());
		
		JButton btnNewButton_2 = new JButton("< Volver");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (transpor[numerodetransporte] instanceof Submarino) 
					new Renta_sub(transpor).setVisible(true);
				else
					new Renta_avion(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(10, 537, 113, 23);
		contentPane.add(btnNewButton_2);
		
		/*JButton btnNewButton = new JButton("Pagar");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(248, 428, 147, 51);
		contentPane.add(btnNewButton);*/
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//cliente clientei=new cliente(textField.getText(),rdbtnNewRadioButton_1.isSelected());
				//Clases.Renta renta=new Clases.Renta(clientei,Fecha_inicio, Fecha_fin, transpor[numerodetransporte],costo);
				//System.out.println("Fecha:"+renta.getFecha_ini());
				if(!(textField.getText()).equals("")) {
					if(rdbtnNewRadioButton_1.isSelected()==true || rdbtnNewRadioButton.isSelected()==true ) {
						if(rdbtnNewRadioButton_1.isSelected()==true) {
							if(textField_1.getText().length()==16) {
								if(textField_2.getText().length()==3) {
										tarjeta tarjetai=new tarjeta(textField_1.getText(),textField_2.getText());
										cliente clientei=new cliente(textField.getText(),tarjetai);
										
										new generar_contrato(clientei,transpor,numerodetransporte,Fecha_inicio,Fecha_fin).setVisible(true);
										dispose();

								}else {
									JOptionPane.showMessageDialog(null,"El cvv debe tener 3 digitos","", JOptionPane.WARNING_MESSAGE);
								}
							}else {
								JOptionPane.showMessageDialog(null,"La tarjeta debe tener 16 digitos","", JOptionPane.WARNING_MESSAGE);
							}
						}else {
							
							try {
								Random escanear= new Random();
								cliente clientei=new cliente(textField.getText());
								clientei.setFolio(Fecha_inicio+Fecha_fin+""+escanear.nextInt(100));
								Clases.Renta renta=new Clases.Renta(clientei,Fecha_inicio, Fecha_fin, transpor[numerodetransporte],transpor[numerodetransporte].getCosto_total(),"Efectivo");
								File fichero = new File("src/Rentas/"+renta.getFecha_ini()+".obj");
								FileOutputStream fichero1= new FileOutputStream(fichero);
								ObjectOutputStream escribir = new ObjectOutputStream(fichero1);
								escribir.writeObject(renta);
								escribir.close();
								fichero1.close();
								JOptionPane.showMessageDialog(null,"El folio de la renta es: "+clientei.getFolio(),"",JOptionPane.INFORMATION_MESSAGE);
								JOptionPane.showMessageDialog(null,"Renta registrada","",JOptionPane.INFORMATION_MESSAGE);
								new Home(transpor).setVisible(true);
								dispose();
							
							}catch(IOException ex){
								JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado","", JOptionPane.ERROR_MESSAGE);
							}
						}
							
						
					}else {
						JOptionPane.showMessageDialog(null,"Seleccione un metodo de pago","", JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null,"Ingrese el nombre del cliente","", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
	}
}

