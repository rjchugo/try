package balikloob;

import java.text.DecimalFormat;
import java.util.*;

public class robass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		String choose;
		float sineDeg, cosDeg, tanDeg, verAx, horAx, incAx, distance, force, mass, velocity, torque, kE, x, derCos, intSin;
		

		System.out.println("Choose from the following:"
				+ "\n a. Sine(Deg) \n b. Cos(Deg) \n c. Tan(Deg) \n d. Torque "
				+ "\n e. Kinetic Energy \n f. Derivative of Cosine \n g. Integral of Sine \n");

		System.out.print("Choose: ");
		choose = sc.nextLine();

		if(choose.equals("a")){
			System.out.println("SINE(DEGREES) SOLVING! \n");
			System.out.println("Enter Vertical Axis: ");
			verAx = sc.nextFloat();
			System.out.println("Enter Inclined Axis: ");
			incAx = sc.nextFloat();
			
			sineDeg = (float) Math.sin(verAx/incAx);
			System.out.println("Sine(Deg): " + df.format(sineDeg));


		}
		else if(choose.equals("b")){
			System.out.println("COSINE(DEGREES) SOLVING! \n");
			System.out.println("Enter Horizontal Axis: ");
			horAx = sc.nextFloat();
			System.out.println("Enter Inclined Axis: ");
			incAx = sc.nextFloat();
			
			cosDeg = (float) Math.cos(horAx/incAx);
			System.out.println("Cos(Deg): "+ df.format(cosDeg));
		}
		else if(choose.equals("c")){
			System.out.println("TAN(DEGREES) SOLVING! \n");
			System.out.println("Enter Vertical Axis: ");
			verAx = sc.nextFloat();
			System.out.println("Ente Horizontal Axis: ");
			horAx = sc.nextFloat();
			
			tanDeg = (float) Math.tan(verAx/horAx);
			System.out.println("Tan(Deg): " + df.format(tanDeg));
		}
		else if(choose.equals("d")){
			System.out.println("TORQUE SOLVING! \n");
			System.out.println("Enter Distance: ");
			distance = sc.nextFloat();
			System.out.println("Enter Force: ");
			force = sc.nextFloat();
			
			torque = distance*force;
			System.out.println("Torque: " + df.format(torque));
			
		}
		else if(choose.equals("e")){
			System.out.println("KINETIC ENERGY SOLVING! \n");
			System.out.println("Enter mass: ");
			mass = sc.nextFloat();
			System.out.println("Enter velocity: ");
			velocity = sc.nextFloat();
			
			kE = (float) Math.pow(velocity, 2)*mass/2;
			System.out.println("KE: " + df.format(kE));
		}
		else{
			System.out.println("There's no" + choose + "in choices!");
		}

	}

}
