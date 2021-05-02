package intro;

import java.util.Date;
import java.util.Scanner;

import Business.Abstract.CampaignService;
import Business.Abstract.CustomerService;
import Business.Abstract.OrderService;
import Business.Abstract.ProductService;
import Business.Adapters.PersonService.MernisPersonManager;
import Business.Concrete.CampaignManager;
import Business.Concrete.CustomerManager;
import Business.Concrete.OrderManager;
import Business.Concrete.ProductManager;
import DataAccess.Concrete.InMemoryCampaignDao;
import DataAccess.Concrete.InMemoryCustomerDao;
import DataAccess.Concrete.InMemoryOrderDao;
import DataAccess.Concrete.InMemoryProductDao;
import DataAccess.Concrete.NbProductDao;
import Entities.Concrete.Campaign;
import Entities.Concrete.Customer;
import Entities.Concrete.Order;
import Entities.Concrete.Product;

public class Main {
	public static void main(String[] args) {
		
		OrderService orderService = new OrderManager(new InMemoryOrderDao());
		CustomerService customerService = new CustomerManager(new InMemoryCustomerDao(), new MernisPersonManager());
		ProductService productService = new ProductManager(new InMemoryProductDao());
		CampaignService campaignService = new CampaignManager(new InMemoryCampaignDao());
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---- X Game Store -----");
		String menu = 
				"1 - Müşteri Ekle \n" +
				"2 - Müşteri Sil \n" + 
				"3 - Oyun Satın Al \n" + 
				"4 - Satılan oyunları gör \n" +
				"5 - Kampanya Ekle \n" +
				"6 - Kampanya Sil \n" +
				"7 - Menüyü Gör \n" +
				"q - Çıkış Yap";
		System.out.println(menu);
		
		boolean exit = false;
		String operation;
		
		while (!exit) {
			System.out.print("İşlem Seçiniz : ");
			operation = scanner.nextLine();
			
			if (operation.equals("1")) {
				var addCustomer = customerService.add(new Customer(4,"Ege","Deniz", new Date(),"24897658421"));
				
				if (addCustomer.success) {
					System.out.println(addCustomer.message);
				}
				else
				{
					System.out.println(addCustomer.message);
				}
			}else if(operation.equals("2")){
				var removeCustomer = customerService.add(new Customer(1,"Ali","Veli", new Date(),"24897658421"));
				
				if (removeCustomer.success) {
					System.out.println(removeCustomer.message);
				}
				
			}else if(operation.equals("3")){
				var addOrder = orderService.add(new Order(1,1,1,1,5.2));
				if (addOrder.success) {
					System.out.println(addOrder.message);
				}
			}else if(operation.equals("4")){
				var orders = orderService.getAll();
				if (orders.success) {
					for (Order order : orders.data) {
						System.out.println("Id : " + order.id);
					}
				}else {
					System.out.println(orders.message);
				}
				
			}else if(operation.equals("5")){
				var addCampaign = campaignService.add(new Campaign(1,"",1));
				if (addCampaign.success) {
					System.out.println(addCampaign.message);
				}
			}else if(operation.equals("6")){
				var removeCampaign = campaignService.delete(new Campaign(1,"",1));
				if (removeCampaign.success) {
					System.out.println(removeCampaign.message);
				}
			}else if(operation.equals("7")){
				System.out.println(menu);
			}else if(operation.equals("q")){
				System.out.println("Çıkış yapılıyor...");
				exit = true;
			}else {
				System.out.println("Geçersiz işlem!");
			}
			
		}
	}


	private static void Test() {
		String lang;
		HelloWord helloWord;
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen sistem dilini se�iniz : tr , en ?");
		lang = scan.nextLine();
		
		if (lang.equals("tr")) {
			helloWord = new TrMessage();
		}else {
			helloWord = new EnMessage();
		}
		
		helloWord.getMessage();
	}	
}
