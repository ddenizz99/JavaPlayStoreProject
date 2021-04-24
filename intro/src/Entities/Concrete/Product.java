package Entities.Concrete;

import Entities.Abstract.Entity;

public class Product implements Entity{
	
	public int id;
	public String productName;
	public int unitPrice;
	public int unitsInStock;
	
	public Product(int id, String productName, int unitPrice, int unitsInStock) {
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public int getUnitsInStock() {
		return unitsInStock;
	}
	
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
}
