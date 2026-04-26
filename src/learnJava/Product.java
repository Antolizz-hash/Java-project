package learnJava;

public class Product {
	
	private double price;
	private int quantity;
	private String name;
	
	public Product(double initialPrice, int intialQuantity, String initialName) {
		this.price  =initialPrice;
		this.quantity = intialQuantity;
		this.name = initialName;
		
	}
	
	public void printProduct() {
		System.out.println(this.name+", price "+this.price+", "+this.quantity+" pcs");
	}
	
	public static void main(String[]args) {
		
		Product banana = new Product(1.1,13,"Banana");
		
		banana.printProduct();
	}

}
