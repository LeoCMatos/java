package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		
		System.out.println("Product data: " + product);
		
		
		System.out.println("Enter the number of products to be added in stock");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("updated data: " + product);
		
		System.out.println("Enter the number of products to be removed in stock");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();

		System.out.println("updated data: " + product);
		
		product.setName("Computer");
		product.setPrice(1200);
		System.out.println("Updated name: "+ product.getName());
		System.out.println("Update price" + product.getPrice());
		System.out.println("updated data: " + product);

		sc.close();
	}

}
