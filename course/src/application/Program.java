package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Price: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Product data: " + produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data:  " + produto);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantidade = sc.nextInt();
		produto.removeProdutos(quantidade);
		
		System.out.println();
		System.out.println("Updated data:  " + produto);
		
		sc.close();
	}

}
