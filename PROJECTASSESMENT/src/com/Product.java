package com;

public class Product {

	
	
	private int pID;
	private String pNAME;
	private int Price;
	private int qoa;
	@Override
	public String toString() {
		return "Product [pID=" + pID + ", pNAME=" + pNAME + ", Price=" + Price + ", qoa=" + qoa + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Price;
		result = prime * result + qoa;
		result = prime * result + pID;
		result = prime * result + ((pNAME == null) ? 0 : pNAME.hashCode());
		return result;
	}
	public Product(int pID, String pNAME, int price, int qoa) {
		super();
		this.pID = pID;
		this.pNAME = pNAME;
		Price = price;
		qoa = qoa;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Price != other.Price)
			return false;
		if (qoa != other.qoa)
			return false;
		if (pID != other.pID)
			return false;
		if (pNAME == null) {
			if (other.pNAME != null)
				return false;
		} else if (!pNAME.equals(other.pNAME))
			return false;
		return true;
	}
	public int getpID() {
		return pID;
	}
	public void setpID(int pID) {
		this.pID = pID;
	}
	public String getpNAME() {
		return pNAME;
	}
	public void setpNAME(String pNAME) {
		this.pNAME = pNAME;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getqoa() {
		return qoa;
	}
	public void setqoa(int qoa) {
		qoa = qoa;
	}
}
