package meniu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnComandaNoua = new JButton("Doresc s\u0103 comand");
		btnComandaNoua.setBounds(136, 149, 526, 263);
		btnComandaNoua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowAll menu = new ShowAll();
				menu.setVisible(true);
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		btnComandaNoua.setBackground(Color.WHITE);
		btnComandaNoua.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnComandaNoua.setForeground(Color.BLACK);
		frame.getContentPane().add(btnComandaNoua);
	}

}
// MAMA CE MISTO SMR GIBILAN
