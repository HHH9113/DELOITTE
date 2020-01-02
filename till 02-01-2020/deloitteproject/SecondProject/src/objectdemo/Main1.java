package objectdemo;

public class Main1 {
public static void main(String[] args) {
	Product product = new Product(2000,"Laptop",25 ,2500000);
	System.out.println(product);
	product.setProductId(2001);
	product.setProductName("Mobile");
	product.setQoh(12);
	product.setPrice(200000);
	System.out.println(product);
	product.setProductId(2002);
	product.setProductName("Bike");
	product.setQoh(4);
	product.setPrice(3000000);
	System.out.println(product);
}
}
