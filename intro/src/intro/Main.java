package intro;

import java.util.Scanner;

import Business.Abstract.ProductService;
import Business.Concrete.ProductManager;
import DataAccess.Concrete.InMemoryProductDao;
import DataAccess.Concrete.NbProductDao;
import Entities.Concrete.Product;

public class Main {
	public static void main(String[] args) {
		//Test();
		ProductService productService = new ProductManager(new InMemoryProductDao());
		
//		for (Product product : productService.getAll()) {
//			System.out.println("Id : " + product.id + ", Ürün Adý : " + product.productName + ", Fiyat : "
//		+ product.unitPrice + " TL, Stok : " + product.unitsInStock);
//		}
		
		productService.add(new Product(6,"Bursaspor",350,12));
		
		for (Product product : productService.getAll()) {
			System.out.println("Id : " + product.id + ", Ürün Adý : " + product.productName + ", Fiyat : "
		+ product.unitPrice + " TL, Stok : " + product.unitsInStock);
		}
		
	}

	private static void Test() {
		String lang;
		HelloWord helloWord;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sistem dilini seçiniz : tr , en ?");
		lang = scan.nextLine();
		
		if (lang.equals("tr")) {
			helloWord = new TrMessage();
		}else {
			helloWord = new EnMessage();
		}
		
		helloWord.getMessage();
	}	
}
