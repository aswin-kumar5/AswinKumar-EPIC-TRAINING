package model;

public class CustomerModel {
	
	private String cusName;
	private String cusMailId;
	private int cusId;
	
	public CustomerModel(){
		
	}
	
	public CustomerModel(String cusName, String cusMailId, int cusId) {
		this.cusName = cusName;
		this.cusMailId = cusMailId;
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusMailId() {
		return cusMailId;
	}

	public void setCusMailId(String cusMailId) {
		this.cusMailId = cusMailId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	
}
