package softEng;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

public class Midterm extends JFrame implements ActionListener {
	private JLabel name;
	private JTextField nameTF;
	private JLabel password;
	private JPasswordField passPF;
	private JLabel conPass;
	private JPasswordField conPassPF;
	private JLabel forCity;
	private JComboBox cities;
	private JLabel gender;
	private JRadioButton male, female;
	private JLabel gmail;
	private JTextField gmailTF;
	private JButton submit;

	SetAndGet setGet;

	String [] city = {"---","Quezon City","Makati City"};

	PrintWriter pw;
	File file = new File("C:/Users/HUGO//Downloads/.tooling/Desktop/File.txt");

	public Midterm(){

		setGet = new SetAndGet();

		name = new JLabel("Name:");
		name.setBounds(50,20,100,100);
		add(name);

		nameTF = new JTextField();
		nameTF.setBounds(170,60,200,20);
		add(nameTF);

		password = new JLabel("Password:");
		password.setBounds(50,50,100,100);
		add(password);

		passPF = new JPasswordField();
		passPF.setBounds(170,90,200,20);
		add(passPF);

		conPass = new JLabel("Confirm Password:");
		conPass.setBounds(50,80,150,100);
		add(conPass);

		conPassPF = new JPasswordField();
		conPassPF.setBounds(170,120,200,20);
		add(conPassPF);

		forCity = new JLabel("City:");
		forCity.setBounds(50,110,150,100);
		add(forCity);

		cities = new JComboBox(city);
		cities.setBounds(170,150,200,20);
		cities.addActionListener(this);
		add(cities);

		gender = new JLabel("Gender:");
		gender.setBounds(50,145,150,100);
		add(gender);

		male = new JRadioButton("Male");
		male.setBounds(170,170,100,50);
		add(male);

		female = new JRadioButton("Female");
		female.setBounds(270,170,100,50);
		add(female);

		gmail = new JLabel("Gmail:");
		gmail.setBounds(50,180,150,100);
		add(gmail);

		gmailTF = new JTextField();
		gmailTF.setBounds(170,220,200,20);
		add(gmailTF); 

		submit = new JButton("Submit");
		submit.setBounds(210,250,120,30);
		submit.addActionListener(this);
		add(submit);

		setTitle("Registration");
		setSize(430,370);
		setLayout(null);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == submit) {

			setGet.setName(nameTF.getText());
			setGet.setPassword(passPF.getText());
			setGet.setConPass(conPassPF.getText());
			setGet.setCities(cities.getSelectedItem().toString());
			if(male.isSelected()){
				setGet.setGender(male.getText());
			}
			if(female.isSelected()){
				setGet.setGender(female.getText());
			}
			setGet.setGmail(gmailTF.getText());


			try {

				pw = new PrintWriter(file);

				pw.println(setGet.getName() + ";" + setGet.getPassword() + ";" + setGet.getConPass() + ";" + setGet.getCities() + ";" + setGet.getGender() + ";" + setGet.getGmail());
				pw.close();

			} catch (FileNotFoundException e1) {
				System.out.println("error");
			}



			JOptionPane.showMessageDialog(null, "Submitted!","", JOptionPane.INFORMATION_MESSAGE);
			dispose();
			new Midterm();
		}

	}


	public static void main(String[] args) {
		new Midterm();
	}
}