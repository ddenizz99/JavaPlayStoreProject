package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity{
	public int id;
	public String description;
	public double discount;
	
	public Campaign(int id, String description, double discount) {
		this.id = id;
		this.description = description;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
