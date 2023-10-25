package Interfaces;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
//import javax.swing.border.SoftBevelBorder;
//import javax.swing.border.BevelBorder;
//import java.awt.ComponentOrientation;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class Home extends JFrame {
	protected medioDeTransporte[] transpor;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home(medioDeTransporte[] transpor) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/icons/logo2.png")));
		this.transpor=transpor;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 540);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Vector's Rent");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 68));
		lblNewLabel.setBounds(130, 11, 504, 113);
		lblNewLabel.setForeground(Color.BLACK);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Nueva Renta");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new menu_trans(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(170, 217, 291, 39);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(0, 102, 255));
		
		JButton btnNewButton_1 = new JButton("Ver Rentas");
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Ver_rentas(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(170, 350, 291, 39);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_1.setBackground(new Color(0, 102, 255));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/icons/logo1.png")));
		lblNewLabel_1.setBounds(10, 11, 110, 113);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFDesea rentar un veh\u00EDculo?");
		lblNewLabel_2.setFont(new Font("Arial", Font.ITALIC, 17));
		lblNewLabel_2.setBounds(171, 179, 221, 39);
		lblNewLabel_2.setForeground(Color.BLACK);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ya rent\u00F3 un vehiculo con anterioridad");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.ITALIC, 17));
		lblNewLabel_2_1.setBounds(170, 308, 291, 39);
		lblNewLabel_2_1.setForeground(Color.BLACK);
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_1 = new JButton("Salir");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
				if (resp == 0) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.RED);
		btnNewButton_1_1.setBounds(10, 461, 95, 39);
		contentPane.add(btnNewButton_1_1);
	}
}
