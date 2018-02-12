package balikloob;
import java.util.*;
public class First {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String product;
		double unitPrice=0;
		double quantity=0;
		double totalPrice=0;
		double discount=0;
		double netPrice;
		
		System.out.println("Enter product: ");
		product = scan.nextLine();
		
		System.out.println("Enter unit price: ");
		unitPrice = scan.nextDouble();
		
		System.out.println("Enter quantity: ");
		quantity = scan.nextDouble();
		
		
		totalPrice = unitPrice*quantity;
		discount = totalPrice*0.1;
		netPrice = totalPrice-discount;
		
		System.out.println("The product is "+ product);
		System.out.println("Total price is "+ totalPrice);
		System.out.println("Discount is "+ discount);
		System.out.println("Net Price is "+ netPrice);


	}

}
