package calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ConvertColor {

	private JFrame frame;
	private JTextField rTxt;
	private JTextField gTxt;
	private JTextField bTxt;
	private JTextField resultHexTxt;
	private JTextField hexTxt;
	private JTextField resultRgbTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvertColor window = new ConvertColor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConvertColor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 273, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Convert color");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 165, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(10, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		rTxt = new JTextField();
		rTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rTxt.setBounds(32, 50, 51, 31);
		frame.getContentPane().add(rTxt);
		rTxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("G");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(93, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		gTxt = new JTextField();
		gTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		gTxt.setBounds(114, 50, 51, 31);
		frame.getContentPane().add(gTxt);
		gTxt.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("B");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(175, 55, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		bTxt = new JTextField();
		bTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bTxt.setBounds(197, 50, 51, 31);
		frame.getContentPane().add(bTxt);
		bTxt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Hex");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 97, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		resultHexTxt = new JTextField();
		resultHexTxt.setEditable(false);
		resultHexTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resultHexTxt.setBounds(65, 92, 122, 31);
		frame.getContentPane().add(resultHexTxt);
		resultHexTxt.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Hex#");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 155, 73, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		hexTxt = new JTextField();
		hexTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		hexTxt.setBounds(65, 150, 122, 31);
		frame.getContentPane().add(hexTxt);
		hexTxt.setColumns(10);
		
		JButton rgbBtn = new JButton("RGB");
		rgbBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rgbBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rgbBtn.setBounds(102, 234, 70, 30);
		frame.getContentPane().add(rgbBtn);
		
		JLabel lblNewLabel_6 = new JLabel("RGB");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(10, 197, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		resultRgbTxt = new JTextField();
		resultRgbTxt.setEditable(false);
		resultRgbTxt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resultRgbTxt.setBounds(65, 192, 122, 31);
		frame.getContentPane().add(resultRgbTxt);
		resultRgbTxt.setColumns(10);
		
		JButton hexBtn = new JButton("HEX");
		hexBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		hexBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hexBtn.setBounds(178, 234, 70, 30);
		frame.getContentPane().add(hexBtn);
		
		JButton cancBtn = new JButton("CANC");
		cancBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cancBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cancBtn.setBounds(10, 234, 70, 30);
		frame.getContentPane().add(cancBtn);
	}
}