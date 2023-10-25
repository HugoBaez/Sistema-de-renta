package Interfaces;

//import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class datos_bancarios extends JFrame {

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
					datos_bancarios frame = new datos_bancarios();
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
	public datos_bancarios() {
		setTitle("Datos De Tarjeta De Credito O Debito");
		setIconImage(Toolkit.getDefaultToolkit().getImage(datos_bancarios.class.getResource("/icons/logo2.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Proporcione datos bancarios");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 36));
		lblNewLabel.setBounds(0, 11, 644, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del banco:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNewLabel_1.setBounds(117, 233, 182, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(338, 240, 190, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(338, 301, 190, 20);
		contentPane.add(textField_1);
		
		JLabel lblNumeroDeCuenta = new JLabel("Numero de cuenta:");
		lblNumeroDeCuenta.setForeground(Color.BLACK);
		lblNumeroDeCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDeCuenta.setFont(new Font("Arial", Font.ITALIC, 20));
		lblNumeroDeCuenta.setBounds(117, 294, 182, 28);
		contentPane.add(lblNumeroDeCuenta);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(338, 360, 115, 20);
		contentPane.add(textField_2);
		
		JLabel lblSwitf = new JLabel("Swift/Bic:");
		lblSwitf.setForeground(Color.BLACK);
		lblSwitf.setHorizontalAlignment(SwingConstants.CENTER);
		lblSwitf.setFont(new Font("Arial", Font.ITALIC, 20));
		lblSwitf.setBounds(117, 353, 182, 28);
		contentPane.add(lblSwitf);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(338, 422, 190, 20);
		contentPane.add(textField_3);
		
		JLabel lblBeneficiario = new JLabel("Beneficiario:");
		lblBeneficiario.setForeground(Color.BLACK);
		lblBeneficiario.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeneficiario.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBeneficiario.setBounds(117, 415, 182, 28);
		contentPane.add(lblBeneficiario);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(datos_bancarios.class.getResource("/icons/mastercard.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(156, 79, 142, 128);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(datos_bancarios.class.getResource("/icons/visa.png")));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(363, 79, 135, 128);
		contentPane.add(lblNewLabel_2_1);
	}
}
