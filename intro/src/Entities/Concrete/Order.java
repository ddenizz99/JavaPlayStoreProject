package Entities.Concrete;

import Entities.Abstract.Entity;

public class Order implements Entity{
	public int id;
	public int userId;
	public int productId;
	public int campaignId;
	public double totalPrice;
	
	public Order(int id, int userId, int productId, int campaignId, double totalPrice) {
		this.id = id;
		this.userId = userId;
		this.productId = productId;
		this.campaignId = campaignId;
		this.totalPrice = totalPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
