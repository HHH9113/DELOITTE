
public class product {  
	
private int productId;
private String productName;
private int qoh;
private int billamount;
public product(int productId, String productName, int qoh, int billamount) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.qoh = qoh;
	this.billamount = billamount;
}
@Override
public String toString() {
	return "product [productId=" + productId + ", productName=" + productName + ", qoh="
			+ qoh + ", billamount=" + billamount + "]";
}

public void setproductId(int productId) {
	this.productId = productId;
}

public void setproductName(String productName) {
	this.productName = productName;
}

public void qoh(int qoh) {
	this.qoh = qoh;
}

public void setBillamount(int billamount) {
	this.billamount = billamount;
}




}
