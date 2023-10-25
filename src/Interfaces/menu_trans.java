package Interfaces;

//import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.*;

//import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Cursor;

@SuppressWarnings("serial")
public class menu_trans extends JFrame {
	protected medioDeTransporte[] transpor;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 *
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_trans frame = new menu_trans();
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
	public menu_trans(medioDeTransporte[] transpor) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(menu_trans.class.getResource("/icons/logo2.png")));
		this.transpor=transpor;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 580);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Renta medio de transporte");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel.setBounds(64, 11, 524, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFQue tipo de medio de transporte?");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 26));
		lblNewLabel_1.setBounds(51, 118, 556, 65);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Submarino");
		btnNewButton.setIcon(new ImageIcon(menu_trans.class.getResource("/icons/submarino.png")));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Renta_sub(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(0, 102, 255));
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(188, 233, 251, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Avion");
		btnNewButton_1.setIcon(new ImageIcon(menu_trans.class.getResource("/icons/airplane.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Renta_avion(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 102, 255));
		btnNewButton_1.setForeground(SystemColor.textHighlightText);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_1.setBounds(188, 348, 251, 65);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("< Volver");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home(transpor).setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_2.setBounds(10, 517, 113, 23);
		contentPane.add(btnNewButton_2);
	}
}
