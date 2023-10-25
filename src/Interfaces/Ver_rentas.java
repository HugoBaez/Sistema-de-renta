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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

@SuppressWarnings("serial")
public class Ver_rentas extends JFrame {

	private JPanel contentPane;
	protected medioDeTransporte[] transpor;
	private JTextField textField;
	private JTextField textField_1;
	private JList list;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Ver_rentas frame = new Ver_rentas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public Ver_rentas(medioDeTransporte[] transpor) {
		setTitle("Buscar Renta Realizada");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ver_rentas.class.getResource("/icons/logo2.png")));
		this.transpor=transpor;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 560);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Renta");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 38));
		lblNewLabel.setBounds(232, 11, 176, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Proporcione dia de la renta:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setIcon(new ImageIcon(Ver_rentas.class.getResource("/icons/eventonday10_79977.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 21));
		lblNewLabel_1.setBounds(30, 68, 323, 61);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Proporcione mes de la renta:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon(Ver_rentas.class.getResource("/icons/calendar_month_icon_160345.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(30, 157, 323, 60);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(376, 90, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Mes numerico");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setBounds(376, 179, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 32));
		btnNewButton.setBounds(487, 115, 122, 61);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(168, 240, 441, 275);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
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
		
		JButton btnNewButton_2 = new JButton("< Volver");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(10, 492, 113, 23);
		contentPane.add(btnNewButton_2);
		
		JButton Vercontra = new JButton("Ver contrato");
		Vercontra.setBounds(342, 11, 89, 23);
		Vercontra.setBorder(null);
		Vercontra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Vercontra.setForeground(Color.WHITE);
		Vercontra.setBackground(new Color(0, 102, 255));
		Vercontra.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
		panel.add(Vercontra);
		
		JLabel lblFormaDePago = new JLabel("Forma de pago:");
		lblFormaDePago.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFormaDePago.setFont(new Font("Arial", Font.BOLD, 20));
		lblFormaDePago.setBounds(39, 239, 200, 27);
		panel.add(lblFormaDePago);
		
		JLabel forma = new JLabel("New label");
		forma.setHorizontalAlignment(SwingConstants.LEFT);
		forma.setFont(new Font("Arial", Font.PLAIN, 15));
		forma.setBounds(249, 239, 287, 27);
		panel.add(forma);
		Vercontra.setVisible(false);
		
		File carpeta = new File("src/Rentas");
		String[] lista = carpeta.list();
		
		
		list = new JList(lista);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				String archi;
				archi=list.getSelectedValue().toString();
				try {
					FileInputStream fichero = new FileInputStream("src/Rentas/"+archi);
					ObjectInputStream leer = new ObjectInputStream(fichero);
					Renta renta=(Renta)leer.readObject();
					panel.setVisible(true);
					if((renta.getFormpag()).equals("Tarjeta bancaria")) {
						Vercontra.setVisible(true);
						Vercontra.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								dispose();
								new ver_contrato(renta.getContrato(), transpor).setVisible(true);

							}
						});
					}else {
						Vercontra.setVisible(false);
					}
					nombre.setText(renta.getNombre_Cliente());
					medio_trans.setText(renta.getTipo_Medio());
					fecha_entre.setText(renta.getFecha_fin());
					fecha_renta.setText(renta.getFecha_ini());
					costo.setText(""+renta.getPago());
					forma.setText(renta.getFormpag());
					leer.close();
					fichero.close();
				}catch(FileNotFoundException ex){
					ex.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		list.setBounds(44, 245, 103, 236);
		contentPane.add(list);
		list.setVisibleRowCount(5);
		
		JScrollBar scrollBar = new JScrollBar();
		list.add(scrollBar);
		scrollBar.setBounds(86, 0, 17, 236);
		
		//JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileInputStream fichero;
				if(!(textField.getText()).equals("")&& !(textField_1.getText()).equals("")) {
					if(Integer.parseInt(textField.getText())>0 && Integer.parseInt(textField.getText())<=30) {
						if(Integer.parseInt(textField_1.getText())>0 && Integer.parseInt(textField_1.getText())<=12) {
							if(textField.getText().length()==2 && textField_1.getText().length()==2) {
								try {
			
								fichero = new FileInputStream("src/Rentas/"+textField.getText()+"-"+textField_1.getText()+".obj");
								ObjectInputStream leer = new ObjectInputStream(fichero);
								Renta renta=(Renta)leer.readObject();
								panel.setVisible(true);
								if((renta.getFormpag()).equals("Tarjeta bancaria")) {
									Vercontra.setVisible(true);
									Vercontra.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											new ver_contrato(renta.getContrato(), transpor).setVisible(true);
											dispose();
											
											
										}
									});
								}else {
									Vercontra.setVisible(false);
								}
								nombre.setText(renta.getNombre_Cliente());
								medio_trans.setText(renta.getTipo_Medio());
								fecha_entre.setText(renta.getFecha_fin());
								fecha_renta.setText(renta.getFecha_ini());
								costo.setText(""+renta.getPago());
								forma.setText(renta.getFormpag());
								leer.close();
								fichero.close();
							}catch(FileNotFoundException ex){
								JOptionPane.showMessageDialog(null,"No hay renta de ese dia","", JOptionPane.WARNING_MESSAGE);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (ClassNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							}else {
								JOptionPane.showMessageDialog(null,"Digite los datos en dos digitos","", JOptionPane.WARNING_MESSAGE);
							}
							
						}else {
							JOptionPane.showMessageDialog(null,"Mes invalido","", JOptionPane.WARNING_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null,"Ingresaste un dia invalido","", JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null,"Debe llenar todos los campos","", JOptionPane.WARNING_MESSAGE);
				}
			}
		});

	}
}
