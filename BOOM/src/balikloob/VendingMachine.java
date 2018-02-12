package balikloob;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.*;

public class VendingMachine extends JFrame implements ActionListener {

	private JTextField text;
	private JButton soda;
	private JButton coke;
	private JButton sprite;
	private JButton water;
	private JButton royal;
	private JButton sevenUp;
	private JButton buy;

	Setget vmTF;

	public VendingMachine() {

		vmTF = new Setget();

		text = new JTextField();
		text.setBounds(48, 50, 300, 80);
		text.setEditable(false);
		add(text);

		soda = new JButton("SODA");
		soda.setBounds(48, 170, 80, 50);
		soda.addActionListener(this);
		add(soda);

		coke = new JButton("COKE");
		coke.setBounds(158, 170, 80, 50);
		coke.addActionListener(this);
		add(coke);

		sprite = new JButton("SPRITE");
		sprite.setBounds(270, 170, 80, 50);
		sprite.addActionListener(this);
		add(sprite);

		water = new JButton("WATER");
		water.setBounds(48, 250, 80, 50);
		water.addActionListener(this);
		add(water);

		royal = new JButton("ROYAL");
		royal.setBounds(158, 250, 80, 50);
		royal.addActionListener(this);
		add(royal);

		sevenUp = new JButton("7UP");
		sevenUp.setBounds(270, 250, 80, 50);
		sevenUp.addActionListener(this);
		add(sevenUp);

		buy = new JButton("BUY!");
		buy.setBounds(132, 330, 135, 40);
		buy.addActionListener(this);
		buy.setActionCommand("toOpen");
		add(buy);

		setTitle("Vending Machine");
		setSize(400, 450);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new VendingMachine();


	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if(soda==e.getSource())
		{
			text.setText("SODA for P30");
		}
		if(coke==e.getSource())
		{
			text.setText("COKE for P40");
		}
		if(sprite==e.getSource())
		{
			text.setText("SPRITE for P50");
		}
		if(water==e.getSource())
		{
			text.setText("WATER for P20");
		}
		if(royal==e.getSource())
		{
			text.setText("ROYAL for P60");
		}
		if(sevenUp==e.getSource())
		{
			text.setText("SEVEN UP for P70");
		}

		if(e.getSource() == buy){

			vmTF.setVenmaTF(text.getText());

			if(e.getActionCommand().equals("toOpen")){
				int message = JOptionPane.showConfirmDialog(null,"Do you want to buy " + vmTF.getVenmaTF() + "?","",JOptionPane.YES_NO_OPTION);
				if(message == JOptionPane.YES_OPTION){
					System.out.println("You bought " + vmTF.getVenmaTF() + "!"); 

				}


			}
		}
	}
}




