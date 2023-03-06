package meniu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.util.ArrayList;



public class ShowAll extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAll frame = new ShowAll();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ShowAll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 960);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label_Mancare = new JLabel("M\u00E2ncare");
		label_Mancare.setFont(new Font("Arial Black", Font.PLAIN, 40));
		label_Mancare.setHorizontalAlignment(SwingConstants.CENTER);
		label_Mancare.setBounds(0, 0, 763, 44);
		contentPane.add(label_Mancare);

		JLabel label_Pizza = new JLabel("Pizza");
		label_Pizza.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Pizza.setHorizontalAlignment(SwingConstants.CENTER);
		label_Pizza.setBounds(51, 79, 346, 44);
		contentPane.add(label_Pizza);

		JLabel label_Ciorba = new JLabel("Ciorb\u0103");
		label_Ciorba.setHorizontalAlignment(SwingConstants.CENTER);
		label_Ciorba.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Ciorba.setBounds(51, 134, 346, 44);
		contentPane.add(label_Ciorba);

		JLabel label_Shaorma = new JLabel("Shaorma");
		label_Shaorma.setHorizontalAlignment(SwingConstants.CENTER);
		label_Shaorma.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Shaorma.setBounds(51, 189, 346, 44);
		contentPane.add(label_Shaorma);

		JLabel label_Paste = new JLabel("Paste");
		label_Paste.setHorizontalAlignment(SwingConstants.CENTER);
		label_Paste.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Paste.setBounds(51, 244, 346, 44);
		contentPane.add(label_Paste);

		JLabel label_Legume = new JLabel("Legume la cuptor");
		label_Legume.setHorizontalAlignment(SwingConstants.CENTER);
		label_Legume.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Legume.setBounds(51, 299, 346, 44);
		contentPane.add(label_Legume);

		JLabel label_Friptura = new JLabel("Friptur\u0103 de porc");
		label_Friptura.setHorizontalAlignment(SwingConstants.CENTER);
		label_Friptura.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Friptura.setBounds(51, 354, 346, 44);
		contentPane.add(label_Friptura);

		JLabel label_Bauturi = new JLabel("B\u0103uturi");
		label_Bauturi.setHorizontalAlignment(SwingConstants.CENTER);
		label_Bauturi.setFont(new Font("Arial Black", Font.PLAIN, 40));
		label_Bauturi.setBounds(0, 415, 763, 44);
		contentPane.add(label_Bauturi);

		JLabel label_Bere = new JLabel("Bere");
		label_Bere.setHorizontalAlignment(SwingConstants.CENTER);
		label_Bere.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Bere.setBounds(51, 470, 346, 44);
		contentPane.add(label_Bere);

		JLabel label_Fanta = new JLabel("Fanta");
		label_Fanta.setHorizontalAlignment(SwingConstants.CENTER);
		label_Fanta.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Fanta.setBounds(51, 525, 346, 44);
		contentPane.add(label_Fanta);

		JLabel label_Cola = new JLabel("Cola");
		label_Cola.setHorizontalAlignment(SwingConstants.CENTER);
		label_Cola.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Cola.setBounds(51, 579, 346, 44);
		contentPane.add(label_Cola);

		JLabel label_Sprite = new JLabel("Sprite");
		label_Sprite.setHorizontalAlignment(SwingConstants.CENTER);
		label_Sprite.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Sprite.setBounds(51, 634, 346, 44);
		contentPane.add(label_Sprite);

		JLabel label_Nestea = new JLabel("Nestea");
		label_Nestea.setHorizontalAlignment(SwingConstants.CENTER);
		label_Nestea.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Nestea.setBounds(51, 689, 346, 44);
		contentPane.add(label_Nestea);

		JLabel label_Cafea = new JLabel("Cafea");
		label_Cafea.setHorizontalAlignment(SwingConstants.CENTER);
		label_Cafea.setFont(new Font("Arial Black", Font.PLAIN, 18));
		label_Cafea.setBounds(51, 744, 346, 44);
		contentPane.add(label_Cafea);


		JToggleButton adauga_Pizza = new JToggleButton("Adaug\u0103");
		adauga_Pizza.setBounds(467, 79, 149, 44);
		contentPane.add(adauga_Pizza);

		JToggleButton adauga_Ciorba = new JToggleButton("Adaug\u0103");
		adauga_Ciorba.setBounds(467, 137, 149, 44);
		contentPane.add(adauga_Ciorba);

		JToggleButton adauga_Shaorma = new JToggleButton("Adaug\u0103");
		adauga_Shaorma.setBounds(467, 189, 149, 44);
		contentPane.add(adauga_Shaorma);

		JToggleButton adauga_Paste = new JToggleButton("Adaug\u0103");
		adauga_Paste.setBounds(467, 244, 149, 44);
		contentPane.add(adauga_Paste);

		JToggleButton adauga_Legume = new JToggleButton("Adaug\u0103");
		adauga_Legume.setBounds(467, 299, 149, 44);
		contentPane.add(adauga_Legume);

		JToggleButton adauga_Friptura = new JToggleButton("Adaug\u0103");
		adauga_Friptura.setBounds(467, 351, 149, 44);
		contentPane.add(adauga_Friptura);

		JToggleButton adauga_Bere = new JToggleButton("Adaug\u0103");
		adauga_Bere.setBounds(467, 470, 149, 44);
		contentPane.add(adauga_Bere);

		JToggleButton adauga_Fanta = new JToggleButton("Adaug\u0103");
		adauga_Fanta.setBounds(467, 525, 149, 44);
		contentPane.add(adauga_Fanta);

		JToggleButton adauga_Cola = new JToggleButton("Adaug\u0103");
		adauga_Cola.setBounds(467, 579, 149, 44);
		contentPane.add(adauga_Cola);

		JToggleButton adauga_Sprite = new JToggleButton("Adaug\u0103");
		adauga_Sprite.setBounds(467, 634, 149, 44);
		contentPane.add(adauga_Sprite);

		JToggleButton adauga_Nestea = new JToggleButton("Adaug\u0103");
		adauga_Nestea.setBounds(467, 689, 149, 44);
		contentPane.add(adauga_Nestea);

		JToggleButton adauga_Cafea = new JToggleButton("Adaug\u0103");
		adauga_Cafea.setBounds(467, 744, 149, 44);
		contentPane.add(adauga_Cafea);



		JButton finalizare = new JButton("Finalizare comand\u0103");
		finalizare.setFont(new Font("Arial Black", Font.PLAIN, 29));
		finalizare.setBounds(149, 859, 476, 51);
		contentPane.add(finalizare);

		finalizare.addActionListener(new ActionListener() {
			private String msg1,msg2,msg3,msg4,msg5,msg6,msg7,msg8,msg9,msg10,msg11,msg12;
			ArrayList<String> total=new ArrayList<String>();

			public void actionPerformed(ActionEvent e) {
				if (adauga_Pizza.isSelected())
				{
					AbstractFactory fdFactory1 = FactoryParser.getFactory("Mancare");
					FD food1 = fdFactory1.getFD("Pizza");
					msg1=food1.get();
					total.add(msg1);
				}
				if (adauga_Ciorba.isSelected())
				{
					AbstractFactory fdFactory2 = FactoryParser.getFactory("Mancare");
					FD food2 = fdFactory2.getFD("Ciorba");
					msg2=food2.get();
					total.add(msg2);
				}
				if (adauga_Shaorma.isSelected())
				{
					AbstractFactory fdFactory3 = FactoryParser.getFactory("Mancare");
					FD food3 = fdFactory3.getFD("Shaorma");
					msg3=food3.get();
					total.add(msg3);
				}
				if (adauga_Paste.isSelected())
				{
					AbstractFactory fdFactory4 = FactoryParser.getFactory("Mancare");
					FD food4 = fdFactory4.getFD("Paste");
					msg4=food4.get();
					total.add(msg4);
				}
				if (adauga_Legume.isSelected())
				{
					AbstractFactory fdFactory5 = FactoryParser.getFactory("Mancare");
					FD food5 = fdFactory5.getFD("Legume la cuptor");
					msg5=food5.get();
					total.add(msg5);
				}
				if (adauga_Friptura.isSelected())
				{
					AbstractFactory fdFactory6 = FactoryParser.getFactory("Mancare");
					FD food6 = fdFactory6.getFD("Friptura de porc");
					msg6=food6.get();
					total.add(msg6);
				}
				if (adauga_Bere.isSelected())
				{
					AbstractFactory fdFactory7 = FactoryParser.getFactory("Bautura");
					FD drink1 = fdFactory7.getFD("Bere");
					msg7=drink1.get();
					total.add(msg7);
				}
				if (adauga_Fanta.isSelected())
				{
					AbstractFactory fdFactory8 = FactoryParser.getFactory("Bautura");
					FD drink2 = fdFactory8.getFD("Fanta");
					msg8=drink2.get();
					total.add(msg8);
				}
				if (adauga_Cola.isSelected())
				{
					AbstractFactory fdFactory9 = FactoryParser.getFactory("Bautura");
					FD drink3 = fdFactory9.getFD("Cola");
					msg9=drink3.get();
					total.add(msg9);
				}
				if (adauga_Sprite.isSelected())
				{
					AbstractFactory fdFactory10 = FactoryParser.getFactory("Bautura");
					FD drink4 = fdFactory10.getFD("Sprite");
					msg10=drink4.get();
					total.add(msg10);
				}
				if (adauga_Nestea.isSelected())
				{
					AbstractFactory fdFactory11 = FactoryParser.getFactory("Bautura");
					FD drink5 = fdFactory11.getFD("Nestea");
					msg11=drink5.get();
					total.add(msg11);
				}
				if (adauga_Cafea.isSelected())
				{
					AbstractFactory fdFactory12 = FactoryParser.getFactory("Bautura");
					FD drink6 = fdFactory12.getFD("Cafea");
					msg12=drink6.get();
					total.add(msg12);
				}
				label_Mancare.setVisible(false);	
				label_Pizza.setVisible(false);
				label_Ciorba.setVisible(false);
				label_Shaorma.setVisible(false);
				label_Paste.setVisible(false);
				label_Legume.setVisible(false);
				label_Friptura.setVisible(false);
				label_Bauturi.setVisible(false);
				label_Bere.setVisible(false);
				label_Fanta.setVisible(false);
				label_Cola.setVisible(false);
				label_Sprite.setVisible(false);
				label_Nestea.setVisible(false);
				label_Cafea.setVisible(false);
				adauga_Pizza.setVisible(false);
				adauga_Ciorba.setVisible(false);
				adauga_Shaorma.setVisible(false);
				adauga_Paste.setVisible(false);
				adauga_Legume.setVisible(false);
				adauga_Friptura.setVisible(false);
				adauga_Bere.setVisible(false);
				adauga_Fanta.setVisible(false);
				adauga_Cola.setVisible(false);
				adauga_Sprite.setVisible(false);
				adauga_Nestea.setVisible(false);
				adauga_Cafea.setVisible(false);
				finalizare.setVisible(false);

				JTextArea comanda = new JTextArea();
				comanda.setBounds(0,0,800,960);
				Font font=new Font("Arial Black",Font.BOLD,16);
				comanda.setLineWrap(true);
				comanda.setWrapStyleWord(true);
				comanda.setFont(font);
				comanda.setVisible(true);

				contentPane.add(comanda);

				String rezultat=total.toString();
				rezultat=rezultat.replace("[", "");
				rezultat=rezultat.replace("]", "");

				if(rezultat.isEmpty()) 
				{
					comanda.append("Nu ati comandat nimic.");
				}else{
					comanda.append("Ati comandat "+rezultat+".");
				}
				comanda.setEditable(false);	
			}

		});



	}
}
