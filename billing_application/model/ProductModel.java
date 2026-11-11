package model;

public class ProductModel {

	private String proName;
	private int proPrice;
	private int proStock;
	private int proId;
	
	public  ProductModel(){
		
	}
	
	public ProductModel(String proName, int proPrice, int proStock, int proId) {
		this.proName = proName;
		this.proPrice = proPrice;
		this.proStock = proStock;
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public int getProStock() {
		return proStock;
	}

	public void setProStock(int proStock) {
		this.proStock = proStock;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}
	
}
