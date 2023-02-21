package product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a directory");
		
		try {
			String path = sc.nextLine();
			File file = new File(path);
			boolean sucess = new File(path + "//out").mkdir();
			
			String name = sc.next();
			String value = sc.next();
			String quant = sc.next();
			
			Product product = new Product(name, Double.parseDouble(value), Integer.parseInt(quant));
			
			List<String> productList = new ArrayList();
			
			Double res = product.total(product.getValue(), product.getQuant());
			
			productList.add(product.getName());
			productList.add(res.toString());
			
			try (BufferedWriter br = new BufferedWriter(new FileWriter(path + "//out" + "//application.csv"))){
				for(String products : productList) {
					br.write(products);
					br.newLine();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		sc.close();
		
		
		
	}
}
