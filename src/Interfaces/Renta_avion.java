package Interfaces;

//import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Clases.*;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Toolkit;


@SuppressWarnings("serial")
public class Renta_avion extends JFrame {
	protected medioDeTransporte[] transpor;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Renta_avion frame = new Renta_avion();
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
	public Renta_avion(medioDeTransporte[] transpor) {
		setTitle("Avi\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Renta_avion.class.getResource("/icons/logo2.png")));
		this.transpor=transpor;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Seleccione el medio de transporte");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 38));
		lblNewLabel.setBounds(10, 32, 624, 52);
		contentPane.add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBounds(211, 136, 240, 24);
		contentPane.add(comboBox);
		
		for (int i = 0;i<transpor.length;i++) {
			if (transpor[i] instanceof Avion) {
				comboBox.addItem("Avion "+transpor[i].getTipo());
			}
		}


		
		JLabel lblNewLabel_1 = new JLabel("Fecha para rentar:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Renta_avion.class.getResource("/icons/1491254414-departuredatecalendartravel_82969.png")));
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 22));
		lblNewLabel_1.setBounds(37, 209, 245, 72);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(324, 233, 71, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("/");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(405, 236, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(461, 233, 71, 20);
		contentPane.add(textField_1);
		
		JLabel lblFechaDeEntrega = new JLabel("Fecha de entrega:");
		lblFechaDeEntrega.setForeground(Color.BLACK);
		lblFechaDeEntrega.setIcon(new ImageIcon(Renta_avion.class.getResource("/icons/1491254415-returnarrivaldatecalendar_82967.png")));
		lblFechaDeEntrega.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaDeEntrega.setFont(new Font("Arial", Font.ITALIC, 22));
		lblFechaDeEntrega.setBounds(37, 318, 245, 78);
		contentPane.add(lblFechaDeEntrega);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBounds(324, 347, 71, 20);
		contentPane.add(textField_2);
		
		JLabel label_1 = new JLabel("/");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(405, 350, 46, 14);
		contentPane.add(label_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(461, 347, 71, 20);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Rentar");
		btnNewButton.setBorder(null);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				int i=0;
				int j=0;
				//System.out.println("ES"+comboBox.getSelectedIndex());
				while(j<=comboBox.getSelectedIndex()) {
					if (transpor[i] instanceof Avion) {
						j++;
					}
					i++;
				}
				i--;
				//System.out.println("ES"+transpor[i].getTipo());
				if(!(textField.getText()).equals("")&& !(textField_1.getText()).equals("")&&!(textField_2.getText()).equals("")&&!(textField_3.getText()).equals("")) {
					if(Integer.parseInt(textField.getText())>0 && Integer.parseInt(textField.getText())<=30 && Integer.parseInt(textField_2.getText())>0 && Integer.parseInt(textField_2.getText())<=30) {
						if(Integer.parseInt(textField_1.getText())>0 && Integer.parseInt(textField_1.getText())<=12 && Integer.parseInt(textField_3.getText())>0 && Integer.parseInt(textField_3.getText())<=12) {
							if((Integer.parseInt(textField_2.getText())>=Integer.parseInt(textField.getText())&&Integer.parseInt(textField_3.getText())>=Integer.parseInt(textField_1.getText()))||(Integer.parseInt(textField_2.getText())<=Integer.parseInt(textField.getText())&&Integer.parseInt(textField_3.getText())>Integer.parseInt(textField_1.getText()))) {
								if(textField.getText().length()==2 && textField_1.getText().length()==2 && textField_2.getText().length()==2 && textField_3.getText().length()==2) {
									int dias=Integer.parseInt(textField_2.getText())-Integer.parseInt(textField.getText())+1;
									int meses=Integer.parseInt(textField_3.getText())-Integer.parseInt(textField_1.getText());
									int horas=meses*30*24+dias*24;
									int costo=transpor[i].getCosto()*horas;
									transpor[i].setCosto_total(costo);
									String fecha_inicio = textField.getText()+"-"+textField_1.getText();
									String fecha_fin = textField_2.getText()+"-"+textField_3.getText();
									//System.out.println("Costo= "+costo);
									new Pagar(transpor, i, fecha_inicio, fecha_fin).setVisible(true);
									dispose();
								}else {
									JOptionPane.showMessageDialog(null,"Proporcione los datos en dos digitos","", JOptionPane.WARNING_MESSAGE);
								}
								
							}else {
								JOptionPane.showMessageDialog(null,"Fecha de entrega debe ser depues de la fecha de renta","", JOptionPane.WARNING_MESSAGE);
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
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setBounds(252, 431, 143, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("< Volver");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new menu_trans(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBounds(10, 526, 113, 23);
		contentPane.add(btnNewButton_2);
		
	}
}